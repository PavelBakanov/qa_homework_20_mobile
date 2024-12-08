package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.browserstack.WikipediaErrorScreen;
import screens.browserstack.WikipediaMainScreen;
import screens.browserstack.WikipediaSearchResultScreen;
import screens.browserstack.components.SearchInputComponent;

import static io.qameta.allure.Allure.step;

@Tag("browserstack")
public class BrowserstackTests extends TestBase {
    @Test
    void androidSuccessfulSearchTest() {
        step("Напечатать в поиске слово 'Appium'", () -> {
            WikipediaMainScreen.searchQuery("Appium");
        });
        step("Проверить, что статьи найдены", () ->
            WikipediaSearchResultScreen.checkSearchResult()
        );
    }

    @Test
    void androidUnsuccessfulOpenArticleTest() {
        step("Напечатать в поиске слово 'Japan'", () -> {
            WikipediaMainScreen.searchQuery("Japan");
        });
        step("Попытаться открыть самую первую статью", () -> {
            WikipediaSearchResultScreen.openArticle();
        });

        step("Проверить, что произошла ошибка", () -> {
            WikipediaErrorScreen.checkError("An error occurred");
        });
    }
}
