package screens;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.id;
import static org.assertj.core.api.Assertions.assertThat;

public class SearchResultScreen {
    private final ElementsCollection articlesListElements = $$(
            id("org.wikipedia.alpha:id/page_list_item_title"));

    private final SelenideElement noResultsSelector = $(id("org.wikipedia.alpha:id/results_text"));

    @Step("Проверить, что статьи найдены")
    public void checkSearchResult() {
        assertThat(articlesListElements).size().isGreaterThan(0);
    }

    @Step("Проверить, что результаты не найдены")
    public void checkNoResultsMessage() {
        String text = noResultsSelector.getText();
        assertThat(text.equals("No results"));
    }

}
