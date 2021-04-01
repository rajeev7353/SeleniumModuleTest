package dev.selenium.step_definitions;

import dev.selenium.pages.BasePage;
import dev.selenium.pages.HomePage;
import dev.selenium.pages.ProjectStrectureAndGovernancePage;
import dev.selenium.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AboutGoveranceAndLearnMoreMduleStepDefs {
    @When("user clicks on About menu")
    public void user_clicks_on_About_menu() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.AboutModule.click();
        Thread.sleep(5000);
    }



    @Then("user clicks on Governance menu")
    public void user_clicks_on_Governance_menu() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.GovernanceModule.click();
        Thread.sleep(5000);

    }
    @Then("user should be able to enter on new page")
    public void user_should_be_able_to_enter_on_new_page() {
      String ExpectedPageTitle = "Selenium Project Structure & Governance";
      String ActualPageTitle = Driver.get().getTitle();
      Assert.assertEquals(ExpectedPageTitle,ActualPageTitle);
      //Can be verified by comparing the currentURL and Home Page URL as well but i choosed comparing PageTitle)

    }
    @Then("user scrolls down the page")
    public void user_scrolls_down_the_page() {
        ProjectStrectureAndGovernancePage newPage = new ProjectStrectureAndGovernancePage();




        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        WebElement learnMoreModule = newPage.learnMoreOption;


        jse.executeScript("window.scrollBy(0,250)");

    }
    @Then("user clicks on Learn More menu")
    public void user_clicks_on_Learn_More_menu() throws InterruptedException {
        ProjectStrectureAndGovernancePage newPage = new ProjectStrectureAndGovernancePage();
        newPage.learnMoreOption.click();


        Thread.sleep(3000);




    }
    @Then("user should be able to see the Sponsers page")
    public void user_should_be_able_to_see_the_Sponsers_page() {
        String ExpectedUrl= "https://www.selenium.dev/sponsors/";
        System.out.println("expectedUrl = " + ExpectedUrl);

        String ActualUrl = Driver.get().getCurrentUrl();
        System.out.println("ActualUrl = " + ActualUrl);
        Assert.assertEquals(ExpectedUrl,ActualUrl);
    }


}
