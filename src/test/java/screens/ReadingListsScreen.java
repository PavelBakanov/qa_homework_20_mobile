package screens;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

import static org.assertj.core.api.Assertions.assertThat;

public class ReadingListsScreen {
    private static final SelenideElement joinWikipediaTextLocator = $(id("org.wikipedia.alpha:id/secondaryTextView"));

    public static void checkJoinWikipediaText() {
        String text = $(joinWikipediaTextLocator).getText();
        assertThat(text.contains("Join Wikipedia"));
    }


}
