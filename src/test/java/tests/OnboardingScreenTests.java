package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.*;
import screens.components.ContinueButtonComponent;

@DisplayName("Тесты начального экрана")
@Tag("wikipedia")
public class OnboardingScreenTests extends TestBase {
    private final LanguageScreen languageScreen = new LanguageScreen();
    private final ContinueButtonComponent continueButtonComponent = new ContinueButtonComponent();
    private final ExploreScreen exploreScreen = new ExploreScreen();
    private final ReadingListsScreen readingListsScreen = new ReadingListsScreen();
    private final DataAndPrivacyScreen dataAndPrivacyScreen = new DataAndPrivacyScreen();

    @DisplayName("Тест начального экрана")
    @Owner("bakanovpb")
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