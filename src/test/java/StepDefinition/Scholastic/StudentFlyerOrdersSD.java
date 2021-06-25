package StepDefinition.Scholastic;

import Pages.Scholastic.*;
import Utils.TestConstant;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class StudentFlyerOrdersSD {

    StudentFlyerOrdersPage sfo = new StudentFlyerOrdersPage();
    AccountPageScholastic as = new AccountPageScholastic();
    ReviewYourCartPage ryc = new ReviewYourCartPage();
    CheckoutRewardsAndCouponsPage crc = new CheckoutRewardsAndCouponsPage();
    YourTeacherOrderPage yto = new YourTeacherOrderPage();

    @When("^I hover over ENTER ORDERS tab and select STUDENT FLYER ORDERS from drop-down$")
    public void selectYTOLink() {
        as.hoverEnterOrdersTab();
        sfo.clickSFOLink();
    }

    @And("^I input '(.*)' in the Enter Student Name field$")
    public void inputSearchNameText(String studentName) {
        sfo.inputStudentNameSearchField(studentName);
        try {
            Thread.sleep(TestConstant.oneSecond);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("^I input '(.*)' in the Item field and click Add button$")
    public void inputItemNumber(String itemNumber) {
        sfo.inputItemNumberSearchField(itemNumber);
        sfo.clickAddButton();
    }

    @And("^I input quantity '(.*)' in QTY field for this item$")
    public void inputQtyField1(String quantity) {
        sfo.inputQtyField1(quantity);
    }

    @When("^I click on REVIEW CART button$")
    public void clickReviewCartButton() {
        sfo.clickReviewCartButton();
        ryc.verifyHarryTotalPriceUpdated();
        ryc.verifyOrderTotalPriceUpdated();
    }

    @And("^I click on 'X' button corresponding to 2S8 item for Harry$")
    public void clickRemoveItemCrossButton() {
        sfo.clickRemoveItemCrossButton();
    }

    @And("^I click YES button in 'Delete this Item' pop-up$")
    public void clickYesFirstItemButton() {
        sfo.clickRemoveYesButton();
        try {
            Thread.sleep(TestConstant.halfSecond);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("^I verify Harry Total Price and Qty get updated$")
    public void verifyHarryTotalPriceUpdated() {
        ryc.getItemTotalPriceAfterUpdate();
        ryc.getItemTotalQtyAfterUpdate();
        Assert.assertEquals(ryc.itemTotalPriceNumber, ryc.itemTotalPriceAfterUpdateNumber, "Item total Price is not correct");
        Assert.assertEquals(ryc.itemTotalQtyNumber, ryc.itemTotalQtyAfterUpdateNumber, "Item total Qty is not correct");
    }

    @And("^I verify Order Total Price and Qty get updated$")
    public void verifyOrderTotalPriceUpdated() {
        ryc.getOrderTotalPriceAfterUpdate();
        ryc.getOrderTotalQtyAfterUpdate();
        Assert.assertEquals(ryc.orderTotalPriceNumber, ryc.orderTotalPriceAfterUpdateNumber, "Order total Price is not correct");
        Assert.assertEquals(ryc.orderTotalQtyNumber, ryc.orderTotalQtyAfterUpdateNumber, "Order total Qty is not correct");
    }

    @And("^I verify for Harry, item 2S8 gets deleted$")
    public void verifyHarry2S8ItemDeleted() {
        Assert.assertFalse(ryc.isHarry2S8Displayed(), "Item 2S8 was not deleted for Harry order");
    }

    @Then("^I verify expected error msg: '(.*)'$")
    public void verifyValidItemNumberErrorMsg(String expectedErrorMsg) {
        Assert.assertEquals(sfo.getValidItemNumberErrorMsg(), expectedErrorMsg, "Error message is correct");
    }

    @And("^I click to Proceed to Checkout button on Review your order page$")
    public void clickProceedToCheckoutButtonRYO() {ryc.clickProceedToCheckoutRYOButton();
    }

    @And("^I click to Proceed to Checkout button on Modal window page$")
    public void clickProceedToCheckoutButtonModal() {
        ryc.clickProceedToCheckoutModalWindowButton();
    }

    @Then("^I verify Tax amount is '(.*)'$")
    public void verifyTaxAmount(String expectedtaxAmount) {
        Assert.assertEquals(crc.getTaxAmountFromCheckoutPage(), expectedtaxAmount, "Tax amount is not correct");
    }

    @When("^I click to Your Teacher Order tab$")
    public void clickYTOTab() {
        sfo.clickYTOTab();
    }

    @And("^I select BY FLYER tab$")
    public void clickByFlyerTab() {
        yto.clickByFlyerTab();
    }


}




