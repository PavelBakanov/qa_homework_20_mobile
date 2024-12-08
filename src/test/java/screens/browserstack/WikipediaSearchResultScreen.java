package screens.browserstack;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.id;
import static org.assertj.core.api.Assertions.assertThat;

public class WikipediaSearchResultScreen {
    private static final ElementsCollection articlesListElements = $$(id("org.wikipedia.alpha:id/page_list_item_title"));

    public static void openArticle() {
        articlesListElements.first().click();
    }

    public static void checkSearchResult() {
        assertThat(articlesListElements).size().isGreaterThan(0);
    }

}