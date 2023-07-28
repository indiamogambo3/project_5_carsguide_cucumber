package au.com.carsguide.steps;

import au.com.carsguide.pages.CarDealersPage;
import au.com.carsguide.pages.Homepage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class DealersSteps {
    @And("^I click on find a dealer$")
    public void iClickOnFindADealer() {
        new Homepage().mouseHoverAndClickOnFindADealerLink();
    }

    @Then("^I should navigate to car dealers page$")
    public void iShouldNavigateToCarDealersPage() {
        Assert.assertEquals(new CarDealersPage().verifyFindACarDealershipNearYouText(), "Find a Car Dealership Near You", "Unable to verify text.");
    }


    @And("^I should see the dealers name is displayed on page \"([^\"]*)\"$")
    public void iShouldSeeTheDealersNameIsDisplayedOnPage(boolean dealer) {
        new CarDealersPage().verifyDealersNameIsDisplayed(dealer);

    }
}
