package StepDefinition.Scholastic;

import Pages.Scholastic.AccountPageScholastic;
import Pages.Scholastic.HomepageScholastic;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class AddCreditCardSD {

    HomepageScholastic hs = new HomepageScholastic();
    AccountPageScholastic as = new AccountPageScholastic();

    @Given("^I log in to Scholastic account with three credit cards stored using '(.*)' login and '(.*)' password$")
    public void signInIntoAccount(String email, String password) {
        hs.openScholastic();
        hs.clickSignInLink();
        hs.inputEmailAddressField(email);
        hs.inputPasswordField(password);
    }

    @When("^I click Payment Methods from My Account drop-down in the header$")
    public void clickPaymentMethodtLink() {
        as.clickMyAccountLink();
        as.paymentMethodsLink();
    }

    @And("^I click 'Add a Card' in 'My Credit Cards section'$")
    public void clickAddCreditCardButton() {
        as.clickAddCreditCardLink();
    }

    @Then("^I verify that I get error msg '(.*)' if I try to add 4th credit card$")
    public void verifyItemAddedToRecommendList(String errorMSG) {
        Assert.assertEquals(errorMSG, as.getCreditCardErrorMsgText(), "Error message is missing");
    }

}
