package dev.selenium.pages;

import dev.selenium.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

 @FindBy(xpath = "//header/nav[@id='navbar']/a[3]")
   public WebElement DocumentationModule;

    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }
}
