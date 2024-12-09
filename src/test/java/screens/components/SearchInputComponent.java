package screens.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class SearchInputComponent {

    private final SelenideElement accessibilitySearchElement = $(accessibilityId("Search Wikipedia"));
    private final SelenideElement searchElement = $(id("org.wikipedia.alpha:id/search_src_text"));

    @Step("Нажать на Поиск, что бы получить доступ к нему")
    public void clickSearchField() {
        accessibilitySearchElement.click();
    }

    @Step("Ввести текст из параметра")
    public void searchQuery(String query) {
        searchElement.sendKeys(query);
    }
}