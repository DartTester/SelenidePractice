package guru.qa;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class SelenideTest extends TestBase {

    @Test
    void selenideTest() {
        //Открыть страницу  GitHub
        Selenide.open("/selenide/selenide");
        //В "поисковой строке" вести текст и нажать поиск
        $("#wiki-tab").click();
        //Проверяем, что мы на нужной странице
        $(".markdown-body").shouldHave(text("Welcome to the selenide wiki!"));
        // Убедимся, что в списке страниц (Pages) есть страница SoftAssertions
        $(".markdown-body").$(byText("Soft assertions")).click();
        // Убедимся, что в разделе SoftAssertions присутствует пример кода для JUnit 5
        $("#user-content-3-using-junit5-extend-test-class").ancestor("h4")
                .shouldHave(text("3. Using JUnit5 extend test class:"));
        //или проще: $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));


        sleep(5000);
    }
}
