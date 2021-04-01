package dev.selenium.step_definitions;

import dev.selenium.pages.DocumentationPage;
import dev.selenium.pages.HomePage;
import dev.selenium.utilities.BrowserUtils;
import dev.selenium.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Do;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class DocumentationPageStepDefs {

    @When("User click on the Documentaion Page and should enter in the new page")
    public void user_click_on_the_Documentaion_Page_and_should_enter_in_the_new_page() {
        String CurrentUrlBeforeClick = Driver.get().getCurrentUrl();
        System.out.println("CurrentUrlBeforeClick = " + CurrentUrlBeforeClick);
        HomePage homePage = new HomePage();
        homePage.DocumentationModule.click();
        BrowserUtils.waitFor(4);
        String CurrentUrlAfterClick = Driver.get().getCurrentUrl();
        System.out.println("CurrentUrlAfterClick = " + CurrentUrlAfterClick);

        Assert.assertFalse(CurrentUrlBeforeClick.equals(CurrentUrlAfterClick));


    }
    @When("User search for the Grid in search panel and selects the second result")
    public void user_search_for_the_Grid_in_search_panel_and_selects_the_second_result() throws InterruptedException {
        DocumentationPage DocsPage = new DocumentationPage();
        DocsPage.SearchBox.sendKeys("Grid");
        Thread.sleep(5000);
        DocsPage.Grid2ndOptions.click();
        Thread.sleep(5000);


    }
    @Then("User should be able to see the results")
    public void user_should_be_able_to_see_the_results() {
        DocumentationPage documentationPage = new DocumentationPage();


    }

}