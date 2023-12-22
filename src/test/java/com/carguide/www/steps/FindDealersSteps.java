package com.carguide.www.steps;

import com.carguide.www.pages.FindDealersPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.List;

public class FindDealersSteps {
    @And("I click ‘Find a Dealer’")
    public void iClickFindADealer() {
        new FindDealersPage().clickOnFindADealer();
    }

    @Then("I navigate to ‘car-dealers’ page")
    public void iNavigateToCarDealersPage() {

    }

    @And("I should see the dealer names <dealersName> are display on page")
    public void iShouldSeeTheDealerNamesDealersNameAreDisplayOnPage(DataTable dataTable) {
        List<String> dealerList = dataTable.asList(String.class);
            for (String dealersName : dealerList){
                while (new FindDealersPage().gettingNameOfDealer(dealersName) == null) {
                    new FindDealersPage().clickOnNextButton();
                }
                Assert.assertEquals(dealersName, new FindDealersPage().gettingNameOfDealer(dealersName));
            }
        }
    }

