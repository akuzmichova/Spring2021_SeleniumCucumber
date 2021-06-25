package StepDefinition.Hotels;

import Pages.Hotels.HomepageHotels;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class HotelsSD {

    HomepageHotels hh = new HomepageHotels();

    @When("^On Hotels.com Homepage I click on Check in Calendar$")
    public void clickCheckinCalendar() {
        hh.openSHotels();
        hh.closeModal();
        hh.clickCheckinCalendar();
    }

    @Then("^I verify for current month past dates are disabled$")
    public void verifyPastDatesDisabled() {
        Assert.assertFalse(hh.verifyPastDatesDisabled(), "Not all paste dates are disabled");
    }

    @And("^I verify back button on current month is disabled$")
    public void verifyBackButtonDisabled() {
        Assert.assertFalse(hh.verifyBackButtonDisabled(), "Back button is enabled");
    }

    @When("^On Hotels.com Homepage I click on Guests$")
    public void clickCreateAccountButton() {
        hh.openSHotels();
        hh.closeModal();
        hh.clickGuests();
    }

    public String adultNumberInput;

    @And("I select 'Adults' as '(.*)'$")
    public void selectAdultsNumber(String adultNumber) {
        hh.selectAdultsNumber(adultNumber);
        adultNumberInput = adultNumber.trim();
    }

    public String childrenNumberInput;

    @And("I select 'Children' as '(.*)'$")
    public void selectChildrenNumber(String childrenNumber) {
        hh.selectChildrenNumber(childrenNumber);
        childrenNumberInput = childrenNumber.trim();
    }

    @And("I select first child age as '(.*)'$")
    public void selectFirstChildAge(String firstChildAge) {
        hh.selectFirstChildAge(firstChildAge);
    }

    @And("I select second child age as <1$")
    public void selectSecondChildAge() {
        hh.selectSecondChildAge();
    }

    @Then("^I verify on Rooms pop-up, number of adults and children same as selected on step #3 and #4$")
    public void verifyAdulstChildrenNumberOnPopup() {
        hh.getTextRoomsPopup();
        Assert.assertEquals(adultNumberInput, hh.numOfAdultsFromPopup, "Number of adults is not correct");
        Assert.assertEquals(childrenNumberInput, hh.numOfChildrenFromPopup, "Number of children is not correct");
    }

    @When("^I click Apply button$")
    public void clickApplyButton() {
        hh.clickApplyButton();
    }

    @Then("^I verify total number of guests in sum of adults and children is same as selected on step #3 and #4$")
    public void verifyTotalNumberOfGuests() {
        hh.getTotalNumberOfGuestsText();
        int totalGuestAmount = Integer.valueOf(adultNumberInput) + Integer.valueOf(childrenNumberInput);
        String totalGuestAmountString = Integer.toString(totalGuestAmount);
        Assert.assertEquals(totalGuestAmountString, hh.totalNumOfGuests, "Number of guests is not correct");
    }

    @When("^On Hotels.com Homepage I enter '(.*)' in destination$")
    public void inputDestionationSearchField(String destination) {
        hh.openSHotels();
        hh.closeModal();
        hh.inputDestionationSearchField(destination);
    }

    @When("^I select October 10, 2021 as Check-in and October 31, 2021 as Check-out$")
    public void selectCheckInDate() {
        hh.selectCheckInDate();
    }

    @And("^I select 'Bora Bora, French Polynesia' from auto suggestion$")
    public void selectBoraBoraFromDropDown() {
        hh.selectBoraBoraFromDropDown();
    }

    @And("^I click on Search button$")
    public void clickSearchButton() {
        hh.clickSearchButton();
    }

    @Then("^I verify at the end of search results, CHANGE DATES button is displayed and enabled$")
    public void verifyChangeDateButton() {
        Assert.assertTrue(hh.verifyChangeDateButtonDisplayed(), "Change Dates button is not displayed");
        Assert.assertTrue(hh.verifyChangeDateButtonEnabled(), "Change Dates button is not enabled");
    }

}
