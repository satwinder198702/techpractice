package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class googleBasePages {
   WebDriver driver;
    public googleBasePages(WebDriver dr){
         driver = dr;

        PageFactory.initElements(driver,this);



    }
    @FindBy(id = "APjFqb")
    WebElement searchBar;

    public void EnterElement(String product_Name){
        searchBar.sendKeys(product_Name);

    }
    @FindBy(name="btnK")
    WebElement searchButton;

    public void clickSearch(){

        searchButton.click();


    }


@FindBy(className="YmvwI")
    WebElement All;

    public boolean verifying(){

        return All.isDisplayed();

    }

}
