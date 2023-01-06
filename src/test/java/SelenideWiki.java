import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideWiki {
    @Test
    void SelenideWiki()
    {
        open("https://github.com/");
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
        $$("ul.repo-list li").first().$("a").click();
        //$("ul.data-view-component").sibling(5).$("a").click();
        $("#wiki-tab").click();
        $("div.markdown-body").shouldHave(text("Soft assertions"));
        $(byText("Soft assertions")).click();
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));


    sleep(7000);
    }
}
