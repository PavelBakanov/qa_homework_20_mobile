package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.emulation.DataAndPrivacyScreen;
import screens.emulation.ExploreScreen;
import screens.emulation.LanguageScreen;
import screens.emulation.ReadingListsScreen;
import screens.emulation.components.ContinueButtonComponent;

import static io.qameta.allure.Allure.step;

@Tag("emulation")
public class EmulationTests extends TestBase {
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