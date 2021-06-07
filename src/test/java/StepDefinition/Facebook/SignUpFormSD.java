package StepDefinition.Facebook;

import DriverWrapper.Web;
import Pages.Facebook.HomepageFB;
import Utils.TestConstant;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class SignUpFormSD {

    HomepageFB hpfb = new HomepageFB();
    Web web = new Web();

    @When("On Facebook Homepage I click on Create new account button")
    public void clickCreateNewAccountButtonHP() {
       hpfb.clickCreateNewAccountButton();
    }

    @Then("I verify no gender-radio button is selected on Facebook sign up form")
    public void verifyGenderButtonsSelected(){
        Assert.assertFalse(hpfb.areGenderRadioButtonsSelected(),"Gender buttons are selected");
    }





}
