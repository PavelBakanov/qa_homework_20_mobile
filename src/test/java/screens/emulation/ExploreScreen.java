package screens.emulation;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;
import static org.assertj.core.api.Assertions.assertThat;

public class ExploreScreen {
    private static final SelenideElement primaryTextLocator = $(id("org.wikipedia.alpha:id/primaryTextView"));

    public static void checkTextInPrimaryTextView() {
        String text = $(primaryTextLocator).getText();
        assertThat(text.contains("Dive down the Wikipedia rabbit hole with a constantly updating Explore feed. " +
                "\nCustomize the feed to your interests – whether it’s learning about historical events On this day, or rolling the dice with Random."));
    }
}