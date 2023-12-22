package com.carguide.www.steps;

import com.carguide.www.pages.Homepage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

public class BuySteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I mouse hover on “buy+sell” tab")
    public void iMouseHoverOnBuySellTab() {
        new Homepage().mouseHooverOnBuyAndCell();
    }

    @And("I select make “<make>”")
    public void iSelectMakeMake(String make) {
        new Homepage().selectAnyMakes(make);
    }

    @And("I select model “<model>”")
    public void iSelectModelModel(String models) {
        new Homepage().selectAnyModel(models);
    }

    @And("I select location “<location>”")
    public void iSelectLocationLocation(String locations) {
        new Homepage().selectAnyLocation(locations);
    }

    @And("I select price “<price>”")
    public void iSelectPricePrice(int price) {
        new Homepage().selectPrice(price);
    }

    @And("I click on Find My Next Car tab")
    public void iClickOnFindMyNextCarTab() {
        new Homepage().clickOnFindMyNextCar();
    }

    @When("I click ‘Search Cars’ link")
    public void iClickSearchCarsLink() {
        new Homepage().clickOnSearchCars();
    }

    @Then("I navigate to ‘new and used car search’ page")
    public void iNavigateToNewAndUsedCarSearchPage() {
        Assert.assertEquals(new Homepage().getTextNewAndUsedCarSearch(), "New & Used Car Search - carsguide", "Error message");
    }

    @And("I should see the make “<make>” in results")
    public void iShouldSeeTheMakeMakeInResults(DataTable dataTable) {
        List<List<String>> anyMake = dataTable.asLists(String.class);
        for (List<String> make : anyMake) {
            System.out.println(make.get(0));//list.get(0) for just make
        }
    }


    @And("I click {string} link")
    public void iClickUsedLink() {
        new Homepage().clickOnUsed();
    }


    @Then("I navigate to ‘Used Cars For Sale’ page")
    public void iNavigateToUsedCarsForSalePage() {
        Assert.assertEquals(new Homepage().getTextUsedCarsForSale(), "Used Cars For Sale", "Error message");

    }


}
