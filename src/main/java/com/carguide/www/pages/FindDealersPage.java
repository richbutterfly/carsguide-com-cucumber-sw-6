package com.carguide.www.pages;

import com.carguide.www.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FindDealersPage extends Utility {

    private static final Logger log = LogManager.getLogger(FindDealersPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Find a Dealer']")
    WebElement findADealerButton;
    @CacheLookup
    @FindBy(xpath = "//p[@class='dealerBanner--dealershipName']")
    List<WebElement> nameOfDealers;
    @CacheLookup
    @FindBy(xpath = "//div[@class='pagination']//p[7]//*[name()='svg']")
    WebElement nextButton;

    public void clickOnFindADealer() {
        clickOnElement(findADealerButton);
        log.info("Clicking of Find a Dealer Button : " + findADealerButton.toString());
    }

    public String gettingNameOfDealer(String text) {
        log.info("Finding Dealer Name  : " + nameOfDealers.toString());
        for (WebElement data : nameOfDealers) {
            String str = data.getText();
            if (str.equalsIgnoreCase(text)) {
                return str;
            }
        }
        return null;
    }

    public void clickOnNextButton() {
        clickOnElement(nextButton);
        log.info("Clicking on Next Button : " + nextButton.toString());
    }
}
