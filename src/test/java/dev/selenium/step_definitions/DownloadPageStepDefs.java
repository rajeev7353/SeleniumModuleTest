package dev.selenium.step_definitions;

import dev.selenium.pages.HomePage;
import dev.selenium.utilities.ConfigurationReader;
import dev.selenium.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DownloadPageStepDefs {
    @Given("user is in the homepage")
    public void use_is_in_the_homepage() {
        Driver.get().get(ConfigurationReader.get("url"));
        String expectedUrl = "https://www.selenium.dev/";
        String actualUrl = Driver.get().getCurrentUrl();

        System.out.println("expectedUrl = " + expectedUrl);
        System.out.println("actualUrl = " + actualUrl);

        Assert.assertEquals(expectedUrl,actualUrl);//verifying user is in the home page by verifying expected and ctual url

    }

    @When("user cliks on Downloads menu")
    public void user_cliks_on_Downloads_menu() {
        HomePage homepage = new HomePage();
        homepage.DownloadModule.click();



    }

    @Then("user should be able to see download page")
    public void user_should_be_able_to_see_download_page() {
        HomePage homePage = new HomePage();

        String expectedPageTitle ="Downloads";
        String actualPageTitle = Driver.get().getTitle();

        System.out.println("expectedPageTitle = " + expectedPageTitle);
        System.out.println("actualPageTitle = " + actualPageTitle);


        Assert.assertEquals(expectedPageTitle,actualPageTitle);//Verifying that user navigates to download page by comparing the page title
        
    }
}
