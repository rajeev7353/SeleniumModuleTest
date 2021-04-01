package dev.selenium.pages;

import dev.selenium.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentationPage extends BasePage {
    @FindBy(css ="#search-by" )
    public WebElement SearchBox;

    @FindBy(xpath = "/en/grid/grid_3/")
    public WebElement Grid2ndOptions;

    @FindBy(id = "/html[1]/body[1]/nav[1]/div[2]/ul[1]/li[9]/ul[1]/li[3]/a[1]/mark[1]")
    public WebElement GridResults;





    public DocumentationPage() {
        PageFactory.initElements(Driver.get(), this);
    }
}