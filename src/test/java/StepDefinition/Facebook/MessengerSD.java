package StepDefinition.Facebook;

import Pages.Facebook.HomepageFB;
import Pages.Facebook.Messenger;
import Utils.TestConstant;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MessengerSD {

    HomepageFB hpfb = new HomepageFB();
    Messenger mes = new Messenger();

    @When("On Facebook Homepage I click on Messenger link")
    public void clickMessenger() {
        hpfb.clickMessengerLink();
    }

    @And("On Messenger page I click on Log In button")
    public void clickMessengerLogInButton() {
        mes.switchToMessengerHandle();
        mes.clickMessengerLogInButton();
    }

    @Then("I verify error message \"Incorrect email or phone number\" is displayed")
    public void verifyErrorMessageDisplayed() {
        mes.switchToMessengerLoginHandle();
        String expectedErrorMessage = "Incorrect email or phone number";
        Assert.assertEquals(mes.isMessengerLoginErrorMsgDisplayed(), expectedErrorMessage, "Error message is not displayed");
    }



}