package StepDefinition.Scholastic;

import Pages.Scholastic.AccountPageScholastic;
import Pages.Scholastic.ReviewYourCartPage;
import Pages.Scholastic.YourTeacherOrderPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class YourTeacherOrderSD {

    YourTeacherOrderPage yto = new YourTeacherOrderPage();
    AccountPageScholastic as = new AccountPageScholastic();
    ReviewYourCartPage ryc = new ReviewYourCartPage();


    @When("^I hover over ENTER ORDERS tab and select YOUR TEACHER ORDER from drop-down$")
    public void selectYTOLink() {
        as.hoverEnterOrdersTab();
        yto.clickYTOLink();
    }

    @And("^On BY FLYER tab I click on Price-QTY box$")
    public void clickFirstItemQTYBox() {
        yto.clickFirstItemQTYBox();
    }

    @Then("^I verify teacher sees a jumper above the box with Heading '(.*)' and Message '(.*)'$")
    public void verifyJumperText(String jumperHeading, String jumperMessage) {
        yto.jumperHeadingTextYTO();
        yto.jumperMessageTextYTO();
        Assert.assertEquals(yto.jumperHeadingText + yto.jumperMessageText, jumperHeading + jumperMessage, "Jumper text is not correct");
    }

    @When("^I enter '(.*)' in the clicked Price-QTY box$")
    public void inputPriceQTYBox(String number) {
        yto.typeIntoFirstItemQTYBox(number);
    }

    @And("^I click on X on the jumper$")
    public void closeJumper() {
        yto.clickjumperCloseButton();
    }

    @When("^I click on another Price-QTY box$")
    public void clickSecondItemQTYBox1() {
        yto.clickSecondItemQTYBox();
    }

    @Then("^I verify teacher does NOT see any jumper$")
    public void jumperNotPresent() {
        Assert.assertFalse(yto.isJumperDisplayed(), "There is jumper over QTY box");
    }

    @When("^I enter '(.*)' in the second clicked Price-QTY box$")
    public void inputPriceQTYSecondBox(String number) {
        yto.typeIntoSecondItemQTYBox(number);
    }

    @When("^I click on REVIEW CART button on YTO page$")
    public void clickReviewCartButton() {
        yto.clickReviewCartButtonYTO();
    }


}
