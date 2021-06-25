package StepDefinition.Scholastic;

import Pages.Scholastic.HomepageScholastic;
import Pages.Scholastic.MyListsPageScholastic;
import Pages.Scholastic.PDPScholastic;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class AddToRecommendationsListSD {

    HomepageScholastic hs = new HomepageScholastic();
    PDPScholastic pdp = new PDPScholastic();
    MyListsPageScholastic mlp = new MyListsPageScholastic();

    @When("^On Scholastic Homepage I click Sign In$")
    public void clickSignInLink() {
        hs.openScholastic();
        hs.clickSignInLink();
    }

    @And("^I enter '(.*)' email into email address field and click Continue button$")
    public void inputEmailAddressSignIn(String email) {
        hs.inputEmailAddressField(email);
    }

    @And("^I enter '(.*)' into password field and click Sign In button$")
    public void inputPasswordSignIn(String password) {
        hs.inputPasswordField(password);
    }

    @When("^I enter '(.*)' into search field and click search button$")
    public void inputSearchByText(String searchText) {
        hs.inputSearchField(searchText);
    }

    @And("^I click Quick Look button on a book on PDP page$")
    public void clickQuickLookButton() {
        pdp.clickQuickviewElement();
    }

    @And("^I click Recommended button on Quick Look window$")
    public void clickQuickLookRecommendButton() {
        pdp.clickRecommendButton();
    }

    @And("^I click Recommendations to Students check box in Add to my List pop-up window and close it$")
    public void clickRecToStudentsCheckboxQL() {
        pdp.clickRecToStudentsCheckbox();
        pdp.clickRecToStudentsCloseButton();
    }

    @And("^I close Quick Look window$")
    public void closeQuickLook() {
        pdp.clickquickviewCloseButton();
    }

    @When("^I click on My List button and click Recommendations for Students link$")
    public void clickMyListLink() {
        hs.clickMyListLink();
        hs.clickRecommendForStudentsFromMyList();
    }

    @Then("^I verify the item is added in Recommendations to Students Lists under My Lists$")
    public void verifyItemAddedToRecommendList() {
        Assert.assertEquals(pdp.quickLookTitleText, mlp.getStudentRecommendTitleTextMLP(), "Item is not added in Recommendations");
    }

}
