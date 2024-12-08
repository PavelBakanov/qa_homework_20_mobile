package screens.browserstack.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class SearchInputComponent {

    private static final SelenideElement accessibilitySearchElement = $(accessibilityId("Search Wikipedia"));
    private static final SelenideElement searchElement = $(id("org.wikipedia.alpha:id/search_src_text"));

    public static void  clickSearchField() {
        accessibilitySearchElement.click();
    }

    public static void searchQuery(String query) {
        searchElement.sendKeys(query);
    }
}