package screens;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class DataAndPrivacyScreen {
    private final SelenideElement secondaryTextViewLocator = $(id("org.wikipedia.alpha:id/secondaryTextView"));

    @Step("Проверить видимость текста под заголовком")
    public  void checkVisibilityOfSecondaryTextView() {
        $(secondaryTextViewLocator).shouldBe(Condition.visible);
    }
}