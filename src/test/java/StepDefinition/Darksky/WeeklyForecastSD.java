package StepDefinition.Darksky;

import DriverWrapper.Web;
import Pages.Darksky.Homepage;
import Utils.DateMethods;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class WeeklyForecastSD {
    Homepage hp = new Homepage();
    Web web = new Web();

    @Given("I am on darksky home page")
    public void openDarksky() {
        web.openUrl("https://darksky.net/forecast/40.7127,-74.0059/us12/en");
    }

    @When("I click on Today plus button")
    public void clickTodayPlusButton() {
        hp.clickTodayPlusButton();
    }

    @Then("I verify tempValues on timeline are the same as tempValue in the Today's detail")
    public void verifyTempValuesTL() {
        Assert.assertEquals(hp.getTodayLowTempFromTimeline(), hp.getTodayLowTempInsideTimeline(), "Low TempValue on timeline is NOT the same as Low tempValue in the Today's detail");
        Assert.assertEquals(hp.getTodayHighTempFromTimeline(), hp.getTodayHighTempInsideTimeline(), "High TempValue on timeline is NOT the same as High tempValue in the Today's detail");
        //web.closePage();
    }

    @When("I scroll to Time Machine button")
    public void scrollToTimeMachineButton() {
        Homepage hp = new Homepage();
        hp.scrollToTimeMachine();
    }

    @And("I click Time Machine button")
    public void clickTimeMachineButton() {
        hp.clickTMButton();
    }

    @Then("I verify current date is selected")
    public void verifyCurrentDateSelected() {
        String currentDay = DateMethods.getCurrentDateWithFormat("d");
        Assert.assertEquals(currentDay, hp.getSelectedDateInCalendar(), "Current date is not selected");
        //web.closePage();
    }

}
