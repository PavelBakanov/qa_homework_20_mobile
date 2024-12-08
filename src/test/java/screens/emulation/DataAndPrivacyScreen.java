package screens.emulation;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class DataAndPrivacyScreen {
    private static final SelenideElement secondaryTextViewLocator = $(id("org.wikipedia.alpha:id/secondaryTextView"));

    public static void checkVisibilityOfSecondaryTextView() {
        $(secondaryTextViewLocator).shouldBe(Condition.visible);
    }
}