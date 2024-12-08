package tests;

import org.junit.jupiter.api.Test;
import screens.DataAndPrivacyScreen;
import screens.ExploreScreen;
import screens.LanguageScreen;
import screens.ReadingListsScreen;
import screens.components.ContinueButtonComponent;

import static io.qameta.allure.Allure.step;


public class SearchTests extends TestBase {
    @Test
    void onboardingScreenTest()
    {
        step("Проверить видимость текста языка по умолчанию", () -> {
            LanguageScreen.checkVisibilityOfDefaultLanguage();
        });
        step("Нажать кнопку Continue", () -> {
            ContinueButtonComponent.clickContinueButton();
        });
        step("Проверить соответствие текста", () -> {
            ExploreScreen.checkTextInPrimaryTextView();
        });
        step("Нажать кнопку Continue", () -> {
            ContinueButtonComponent.clickContinueButton();
        });
        step("Проверить наличие текста 'Join Wikipedia' в конкретном месте", () -> {
            ReadingListsScreen.checkJoinWikipediaText();
        });
        step("Нажать кнопку Continue", () -> {
            ContinueButtonComponent.clickContinueButton();
        });
        step("Проверить видимость текста под заголовком", () -> {
            DataAndPrivacyScreen.checkVisibilityOfSecondaryTextView();
        });
    }
}