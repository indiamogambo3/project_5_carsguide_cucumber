package au.com.carsguide.steps;

import au.com.carsguide.pages.Homepage;
import au.com.carsguide.pages.NewAndUsedCarSearchPage;
import au.com.carsguide.pages.ResultsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class BuySteps {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }


    @When("^I mouse hover on buy \\+ sell tab$")
    public void iMouseHoverOnBuySellTab() {
        new Homepage().mouseHoverOnBuyAndSellTab();
    }

    @And("^I click on Search Cars link$")
    public void iClickOnSearchCarsLink() {
        new Homepage().mouseHoverAndClickOnSearchCarsLink();
    }

    @Then("^I should navigate to new and used car page$")
    public void iShouldNavigateToNewAndUsedCarPage() {
        Assert.assertEquals(new NewAndUsedCarSearchPage().verifyNewAndUsedCarSearchCarsguideText(), "New & Used Car Search - carsguide", "Unable to verify text");
    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String anyMake) {
        new NewAndUsedCarSearchPage().selectAnyMakeFromDropDown(anyMake);

    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String anyModel) {
        new NewAndUsedCarSearchPage().selectAnyModelFromDropDown(anyModel);

    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String anyLocation) {
        new NewAndUsedCarSearchPage().selectAnyLocationFromDropDown(anyLocation);

    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String maxPrice) {
        new NewAndUsedCarSearchPage().selectMaxPriceFromDropDown(maxPrice);

    }

    @And("^I click on find my next car tab$")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarSearchPage().clickOnFindMyNextCarTab();
    }


    @Then("^I should see the make in results \"([^\"]*)\"$")
    public void iShouldSeeTheMakeInResults(String result) {
        Assert.assertEquals(new ResultsPage().verifyTheMake(), result, "Unable to verify make");

    }
}
