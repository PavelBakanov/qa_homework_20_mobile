package screens;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class LanguageScreen {
    private final SelenideElement defaultLanguageLocator = $(id("org.wikipedia.alpha:id/option_label"));

    @Step("Проверить видимость текста языка по умолчанию")
    public void checkVisibilityOfDefaultLanguage()
    {
        $(defaultLanguageLocator).shouldBe(Condition.visible);
    }
}