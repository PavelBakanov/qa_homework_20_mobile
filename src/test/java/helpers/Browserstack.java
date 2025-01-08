package helpers;

import config.BrowserstackDriverConfig;
import io.restassured.http.ContentType;
import models.UploadAppResponseModel;
import models.UploadedAppsListResponseModel;
import org.aeonbits.owner.ConfigFactory;

import java.util.List;

import static io.restassured.RestAssured.given;

public class Browserstack {

    private static final BrowserstackDriverConfig config =
            ConfigFactory.create(BrowserstackDriverConfig.class, System.getProperties());

    public static String videoUrl(String sessionId) {
        String url = String.format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);

        return given()
                .auth().basic(config.getBrowserstackUser(), config.getBrowserstackKey())
                .get(url)
                .then()
                .log().status()
                .log().body()
                .statusCode(200)
                .extract().path("automation_session.video_url");
    }

    public UploadAppResponseModel uploadAppToBrowserstack() {
        UploadAppResponseModel response = given()
                .auth().preemptive().basic(config.getBrowserstackUser(), config.getBrowserstackKey())
                .contentType(ContentType.URLENC)
                .formParam("url", "https://github.com/wikimedia/apps-android-wikipedia/" +
                        "releases/download/latest/app-alpha-universal-release.apk")
                .when()
                .post("https://api-cloud.browserstack.com/app-automate/upload")

                .then()
                .statusCode(200)
                .log().all()
                .extract().as(UploadAppResponseModel.class);
        return response;
    }

    public String checkUploadedAppsList() {
        List<UploadedAppsListResponseModel> response = given()
                .auth().preemptive().basic(config.getBrowserstackUser(), config.getBrowserstackKey())

                .when()
                .get("https://api-cloud.browserstack.com/app-automate/recent_apps")

                .then()
                .statusCode(200)
                .log().all()
                .extract()
                .jsonPath()
                .getList(".", UploadedAppsListResponseModel.class);


        for (UploadedAppsListResponseModel app : response) {
            if (app.getAppName().equals("app-alpha-universal-release.apk")) {
                return app.getAppUrl();
            }
        }

        return uploadAppToBrowserstack().getAppUrl();
    }
}