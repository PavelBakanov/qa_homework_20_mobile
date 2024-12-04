package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.*;
import static io.qameta.allure.Allure.step;


public class SearchTests extends TestBase {
    @Test
    void androidSuccessfulSearchTest() {
        step("Напечатать в поиске слово 'Appium'", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Appium");
        });
        step("Проверить, что статьи найдены", () ->
                $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                        .shouldHave(sizeGreaterThan(0)));
    }

    @Test
    void androidUnsuccessfulOpenArticleTest() {
        step("Напечатать в поиске слово 'Japan'", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Japan");
        });
        step("Попытаться открыть самую первую статью", () ->{
            $$(id("org.wikipedia.alpha:id/page_list_item_title")).first().click();
        });

        step("Проверить видимость сообщения об ошибке", () -> {
            $(id("org.wikipedia.alpha:id/view_wiki_error_text")).shouldBe(Condition.visible);
        });
    }
}
