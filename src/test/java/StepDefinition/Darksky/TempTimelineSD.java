package StepDefinition.Darksky;

import DriverWrapper.Web;
import Pages.Darksky.Homepage;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class TempTimelineSD {

    Homepage hp = new Homepage();

    @Then("I verify temp timeline is displayed for every 2 hours from current time with total 12 time-data-points")
    public void verifyTempTLDisplayedFormat(){
        hp.openDarksky();
        Assert.assertTrue(hp.isTimeDataPointsEqual(), "Time data displayed incorrectly");
    }
}
