package screens;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

import static org.assertj.core.api.Assertions.assertThat;

public class ReadingListsScreen {
    private  final SelenideElement joinWikipediaTextLocator = $(id("org.wikipedia.alpha:id/secondaryTextView"));

    @Step("Проверить наличие текста 'Join Wikipedia' в конкретном месте")
    public void checkJoinWikipediaText() {
        String text = $(joinWikipediaTextLocator).getText();
        assertThat(text.contains("Join Wikipedia"));
    }
}