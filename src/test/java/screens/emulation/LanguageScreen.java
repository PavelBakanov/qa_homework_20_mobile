package screens.emulation;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class LanguageScreen {
    private static final SelenideElement defaultLanguageLocator = $(id("org.wikipedia.alpha:id/option_label"));

    public static void checkVisibilityOfDefaultLanguage()
    {
        $(defaultLanguageLocator).shouldBe(Condition.visible);
    }
}