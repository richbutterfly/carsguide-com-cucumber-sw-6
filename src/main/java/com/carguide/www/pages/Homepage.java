package com.carguide.www.pages;

import com.carguide.www.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Utility {

    private static final Logger log = LogManager.getLogger(Homepage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'buy + sell')]")
    WebElement buyCell;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Search Cars']")
    WebElement searchCars;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='New & Used Car Search - carsguide']")
    WebElement textNewAndUsedCarSearch;
    @CacheLookup
    @FindBy(id = "makes")
    WebElement anyMake;
    @CacheLookup
    @FindBy(id = "models")
    WebElement anyModel;
    @CacheLookup
    @FindBy(id = "locations")
    WebElement anyLocation;
    @CacheLookup
    @FindBy(name = "priceTo")
    WebElement price;
    @CacheLookup
    @FindBy(id = "search-submit")
    WebElement findMyNextCar;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Used']")
    WebElement used;

    @CacheLookup
    @FindBy(linkText = "Used Cars For Sale")
    WebElement textUsedCarsForSale;

    public void mouseHooverOnBuyAndCell() {
        log.info("Mouse hoovering on : " + searchCars.toString());
        mouseHoverToElementAndClick(buyCell);
    }

    public void clickOnSearchCars() {
        log.info("Clicking on Search Cars : " + searchCars.toString());
        clickOnElement(searchCars);
    }

    public void clickOnUsed() {
        log.info("Clicking on Used : " + used.toString());
        clickOnElement(used);
    }

    public void selectAnyMakes(String makes) {
        log.info("Select options from dropdown : " + anyMake.toString());
        selectByVisibleTextFromDropDown(anyMake, makes);

    }

    public void selectAnyModel(String models) {
        log.info("Select options from dropdown : " + anyModel.toString());
        selectByVisibleTextFromDropDown(anyModel, models);
    }

    public void selectAnyLocation(String locations) {
        log.info("Select options from dropdown : " + anyLocation.toString());
        selectByVisibleTextFromDropDown(anyLocation, locations);
    }

    public void selectPrice(int pRice) {
        log.info("Select price from dropdown : " + price.toString());
        selectByIndexFromDropDown(price, pRice);
    }

    public void clickOnFindMyNextCar() {
        log.info("Clicking on Find my next car : " + searchCars.toString());
        clickOnElement(findMyNextCar);
    }
    public String getTextNewAndUsedCarSearch(){
       return getTextFromElement(textNewAndUsedCarSearch);
    }
    public String getTextUsedCarsForSale(){
        return getTextFromElement(textUsedCarsForSale);
    }
}
