package StepDefinition.Darksky;

import DriverWrapper.Web;
import Pages.Darksky.Homepage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Homework5SD {

    @Given("I am on darksky home page")
    public void openDarksky() {
        Web web = new Web();
        web.openUrl("https://darksky.net/forecast/40.7127,-74.0059/us12/en");
    }

    @When("I scroll to Today timeline")
    public void scrollToTodayTL() {
        Homepage hp = new Homepage();
        hp.scrollToToday();
    }

    @And("I click the plus button")
    public void clickPlusButton() {
        Homepage hp = new Homepage();
        hp.clickPlusButton();
    }

    @Then("I verify tempValues on timeline are the same as tempValue in the Today's detail")
    public void verifyTempValuesTL() {
        Homepage hp = new Homepage();
        hp.verifyTempValues();
        Web web = new Web();
        web.closePage();
    }

    @When("I scroll to Time Machine button")
    public void scrollToTimeMachineButton() {
        Homepage hp = new Homepage();
        hp.scrollToTimeMachine();
    }

    @And("I click Time Machine button")
    public void clickTimeMachineButton() {
        Homepage hp = new Homepage();
        hp.clickTMButton();
    }

    @Then("I verify current date is selected")
    public void verifyCurrentDateSelected() {
        Homepage hp = new Homepage();
        hp.verifyCurDateSelected();
        Web web = new Web();
        web.closePage();
    }

}
