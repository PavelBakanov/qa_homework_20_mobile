package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.LanguageScreen;
import screens.MainScreen;
import screens.SearchResultScreen;

@DisplayName("Тесты поиска")
@Tag("wikipedia")
public class SearchTests extends TestBase {
    private final MainScreen mainScreen = new MainScreen();
    private final SearchResultScreen searchResultScreen = new SearchResultScreen();
    private final LanguageScreen languageScreen = new LanguageScreen();

    @DisplayName("Тест на успешный поиск")
    @Owner("bakanovpb")
    @Test
    void successfulSearchTest() {
        languageScreen.clickSkipButton();
        mainScreen.searchQuery("Appium");
        searchResultScreen.checkSearchResult();
    }

    @DisplayName("Негативный тест на неуспeшный поиск")
    @Owner("bakanovpb")
    @Test
    void UnsuccessfulSearchTest() {
        languageScreen.clickSkipButton();
        mainScreen.searchQuery("gdsgdsg");
        searchResultScreen.checkNoResultsMessage();
    }
}
