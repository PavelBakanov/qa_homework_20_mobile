package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.DataAndPrivacyScreen;
import screens.ExploreScreen;
import screens.LanguageScreen;
import screens.ReadingListsScreen;
import screens.components.ContinueButtonComponent;

@DisplayName("Тесты на эмуляторе Android")
@Tag("emulation")
public class EmulationTests extends TestBase {

    private final LanguageScreen languageScreen = new LanguageScreen();
    private final ContinueButtonComponent continueButtonComponent = new ContinueButtonComponent();
    private final ExploreScreen exploreScreen = new ExploreScreen();
    private final ReadingListsScreen readingListsScreen = new ReadingListsScreen();
    private final DataAndPrivacyScreen dataAndPrivacyScreen = new DataAndPrivacyScreen();

    @DisplayName("Тест начального экрана")
    @Test
    void onboardingScreenTest() {
        languageScreen.checkVisibilityOfDefaultLanguage();
        continueButtonComponent.clickContinueButton();
        exploreScreen.checkTextInPrimaryTextView();
        continueButtonComponent.clickContinueButton();
        readingListsScreen.checkJoinWikipediaText();
        continueButtonComponent.clickContinueButton();
        dataAndPrivacyScreen.checkVisibilityOfSecondaryTextView();
    }
}