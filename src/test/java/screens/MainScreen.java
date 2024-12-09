package screens;

import io.qameta.allure.Step;
import screens.components.SearchInputComponent;

public class MainScreen {

    @Step("Набрать в поиске текст по параметру")
    public void searchQuery(String query) {

        SearchInputComponent searchInputComponent = new SearchInputComponent();

        searchInputComponent.clickSearchField();
        searchInputComponent.searchQuery(query);

    }
}