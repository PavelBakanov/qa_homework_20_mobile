package screens.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class ContinueButtonComponent {

    private final SelenideElement continueButtonLocator = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"));

    @Step("Нажать на кнопку Continue!")
    public void clickContinueButton() {
        $(continueButtonLocator).click();
    }
}