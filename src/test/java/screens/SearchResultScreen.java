package screens;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.id;
import static org.assertj.core.api.Assertions.assertThat;

public class SearchResultScreen {
    private  final ElementsCollection articlesListElements = $$(id("org.wikipedia.alpha:id/page_list_item_title"));

    @Step("Попытаться открыть самую первую статью")
    public  void openArticle() {
        articlesListElements.first().click();
    }

    @Step("Проверить, что статьи найдены")
    public  void checkSearchResult() {
        assertThat(articlesListElements).size().isGreaterThan(0);
    }

}