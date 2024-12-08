package screens.browserstack;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;
import static org.assertj.core.api.Assertions.assertThat;

public class WikipediaErrorScreen {

    private static final SelenideElement errorFieldElement = $(id("org.wikipedia.alpha:id/view_wiki_error_text"));

    public static void checkError(String textError) {

        assertThat(errorFieldElement).isNotNull();

        String errorOnPage = errorFieldElement.getAttribute("text");
        assertThat(errorOnPage).isEqualTo(textError);
    }
}