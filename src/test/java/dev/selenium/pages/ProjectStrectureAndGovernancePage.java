package dev.selenium.pages;

import dev.selenium.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectStrectureAndGovernancePage extends BasePage {

    @FindBy(xpath="//b[contains(text(),'LEARN MORE')]")
    public WebElement learnMoreOption;



    public ProjectStrectureAndGovernancePage() {
        PageFactory.initElements(Driver.get(), this);
    }
}


