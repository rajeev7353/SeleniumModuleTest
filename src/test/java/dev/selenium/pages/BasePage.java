package dev.selenium.pages;

import dev.selenium.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    @FindBy(xpath = "//a[contains(text(),'Downloads')]")
    public WebElement DownloadModule;

    @FindBy(id = "aboutArrow")
    public WebElement AboutModule;

    @FindBy(xpath = "//header/nav[@id='navbar']/ul[@id='aboutSubnav']/div[2]/a[1]")
    public WebElement GovernanceModule;






    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    public void waitUntilLoaderScreenDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.get(), 5);
            wait.until(ExpectedConditions.invisibilityOf(DownloadModule));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


