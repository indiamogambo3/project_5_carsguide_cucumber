package au.com.carsguide.steps;

import au.com.carsguide.pages.Homepage;
import au.com.carsguide.pages.UsedCarSearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class UsedCarsSteps {
    @And("^I click on used link$")
    public void iClickOnUsedLink() {
       new Homepage().mouseHoverAndClickOnUsedLink();
    }

    @Then("^I should navigate to used cars for sale page$")
    public void iShouldNavigateToUsedCarsForSalePage() {
        Assert.assertEquals(new UsedCarSearchPage().verifyUsedCarForSaleText(), "Used Cars For Sale", "Unable to verify text.");
    }
}
