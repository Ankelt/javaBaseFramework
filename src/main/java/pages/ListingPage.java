package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class ListingPage extends BasePage{
    public ListingPage(WebDriver driver) {
        super(driver);
    }

    private final By teaser = By.cssSelector(".listing-item.highlighted");

    public ListingPage checkCountOfTeasers() {
        int numberOfTeasers = driver.findElements(teaser).size();
        Assert.assertEquals(numberOfTeasers, 20);
        return this;
    }
}
