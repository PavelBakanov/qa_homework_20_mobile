package screens.emulation.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class ContinueButtonComponent {

    private static final SelenideElement continueButtonLocator = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"));

    public static void clickContinueButton() {
        $(continueButtonLocator).click();
    }
}