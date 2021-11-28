package searchApartment;

import base.BaseTest;
import org.testng.annotations.Test;

import static constants.Constants.Urls.REALT_HOME_PAGE;

public class SearchApartmentTest extends BaseTest{

    @Test
    public void checkIsRedirectToListing(){
        basePage.open(REALT_HOME_PAGE);
        homePage
                .enterCountRooms()
                .clickToFind();
        listingPage
                .checkCountOfTeasers();
    }
}
