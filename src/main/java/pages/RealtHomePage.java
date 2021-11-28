package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RealtHomePage extends BasePage{
    public RealtHomePage(WebDriver driver) {
        super(driver);
    }
    private final By roomsCount = By.id("rooms");
    private final By optionRooms = By.cssSelector("#rooms option[value='2']");
    private final By findFlat = By.cssSelector("#residentialInputs a.common-search-submit");

    public RealtHomePage enterCountRooms() {
        driver.findElement(roomsCount).click();
        driver.findElement((optionRooms)).click();
        return this;
    }

    public RealtHomePage clickToFind() {
        WebElement findButton = driver.findElement(findFlat);
        waitElementIsVisible(findButton).click();
        return this;
    }

}
