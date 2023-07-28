package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class NewAndUsedCarSearchPage extends Utility {

    private static final Logger log = LogManager.getLogger(NewAndUsedCarSearchPage.class.getName());

    public NewAndUsedCarSearchPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath=  "//h1[contains(text(),'New & Used Car Search - carsguide')]")
    WebElement verifyNewAndUsedCarPage;
    @CacheLookup
    @FindBy(xpath=  "//select[@id='makes']")
    WebElement makeFromDropDown;
    @CacheLookup
    @FindBy(xpath=  "//select[@id='models']")
    WebElement modelFromDropDown;
    @CacheLookup
    @FindBy(xpath=  "//select[@id='locations']")
    WebElement locationFromDropDown;
    @CacheLookup
    @FindBy(xpath=  "//select[@id='priceTo']")
    WebElement maxPriceFromDropDown;
    @CacheLookup
    @FindBy(id=  "search-submit")
    WebElement findMyNextCarTab;

    public String verifyNewAndUsedCarSearchCarsguideText() {
        log.info("Verifying new and used car search - carsguide text: " + verifyNewAndUsedCarPage.toString());
        return getTextFromElement(verifyNewAndUsedCarPage);
    }

    public void selectAnyMakeFromDropDown(String anyMake)  {
        log.info("Selecting any make from drop down menu: " + makeFromDropDown.toString());
        selectByVisibleTextFromDropDown(makeFromDropDown, anyMake);
    }

    public void selectAnyModelFromDropDown(String anyModel) {
        log.info("Selecting any model from drop down menu: " + modelFromDropDown.toString());
        selectByVisibleTextFromDropDown(modelFromDropDown, anyModel);
    }

    public void selectAnyLocationFromDropDown(String anyLocation) {
        log.info("Selecting any location from drop down menu: " + locationFromDropDown.toString());
        selectByVisibleTextFromDropDown(locationFromDropDown, anyLocation);
    }

    public void selectMaxPriceFromDropDown(String maxPrice) {
        log.info("Selecting max price from drop down menu: " + maxPriceFromDropDown.toString());
        selectByVisibleTextFromDropDown(maxPriceFromDropDown, maxPrice);
    }

    public void clickOnFindMyNextCarTab() {
        log.info("Clicking on find my next car tab: " + findMyNextCarTab.toString());
        clickOnElement(findMyNextCarTab);
    }


}
