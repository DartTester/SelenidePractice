package guru.qa;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class Herokuapp {

    @DisplayName("Swap squares")
    @Test
    public void dragAndDropTest() {

        Selenide.open("https://the-internet.herokuapp.com/drag_and_drop");

        //перетаскиваем левый квадрат А на место правого квадрата B
        $("#column-a").dragAndDropTo($("#column-b"));

        //проверяем, что квадраты поменялись по тексту
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }
}
