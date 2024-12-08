package screens.browserstack;

import screens.browserstack.components.SearchInputComponent;

public class WikipediaMainScreen {

    public static void searchQuery(String query) {

        SearchInputComponent.clickSearchField();
        SearchInputComponent.searchQuery(query);

    }
}