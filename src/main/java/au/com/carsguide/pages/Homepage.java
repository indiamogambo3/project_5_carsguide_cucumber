package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Utility {

    private static final Logger log = LogManager.getLogger(Homepage.class.getName());

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath=  "//a[contains(text(),'buy + sell')]")
    WebElement buySellTab;
    @CacheLookup
    @FindBy(xpath=  "//a[contains(text(),'Search Cars')]")
    WebElement searchCarsLink;
    @CacheLookup
    @FindBy(linkText=  "Used")
    WebElement usedLink;
    @CacheLookup
    @FindBy(linkText=  "Find a Dealer")
    WebElement findDealerLink;



    public void mouseHoverOnBuyAndSellTab() {
        log.info("Mouse hovering on buy + sell tab : " + buySellTab.toString());
        mouseHoverToElement(buySellTab);
    }

    public void mouseHoverAndClickOnSearchCarsLink() {
        log.info("Mouse hovering and clicking on search cars link: " + buySellTab.toString());
        mouseHoverToElementAndClick(searchCarsLink);
    }

    public void mouseHoverAndClickOnUsedLink() {
        log.info("Mouse hovering and clicking on used link: " + buySellTab.toString());
        mouseHoverToElementAndClick(usedLink);
    }

    public void mouseHoverAndClickOnFindADealerLink() {
        log.info("Mouse hovering and clicking on find a dealer link: " + findDealerLink.toString());
        mouseHoverToElementAndClick(findDealerLink);
    }

}
