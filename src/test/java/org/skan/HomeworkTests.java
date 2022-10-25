package org.skan;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomeworkTests {

    @Test
    void checkThatEnterprisePageOpened(){
        open("https://github.com");
        $(withText("Solutions")).hover();
        $(withText("Enterprise")).click();
        $("h1").shouldHave(Condition.text("Build like the best"));
    }

    @Test
    void dragAndDropTest(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo("#column-b");
        $("#column-a").$("header").shouldHave(Condition.text("B"));
        $("#column-b").$("header").shouldHave(Condition.text("A"));
    }

}
