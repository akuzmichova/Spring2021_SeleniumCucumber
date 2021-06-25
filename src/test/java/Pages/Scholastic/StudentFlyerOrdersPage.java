package Pages.Scholastic;

import Pages.WebCommands;
import Utils.TestConstant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class StudentFlyerOrdersPage extends WebCommands {

    By linkSFOlocator = By.xpath("//div[@class='hide-mobile desktop_nav_menu']//li[@id='student-flyer-orders']");
    By searchStudentNameFieldlocator = By.id("student-name");
    By searchItemNumberFieldlocator = By.id("item-number");
    By addButtonlocator = By.id("btn-add");
    By qtyFirstFieldlocator = By.xpath("//input[@class='input-qty numericenteronly']");
    By reviewCartButtonlocator = By.xpath("//button[@class='secondary']");
    By removeItemCrossButtonlocator = By.xpath("//i[@class='fa fa-times-circle remove']");
    By removeYesButtonlocator = By.xpath("//button[@class='grey removeYes']");
    By validItemNumberErrorMsglocator = By.xpath("//span[@id='error-message-tooltip']");
    By yourTeacherOrderTablocator = By.xpath("//li[@id='tab-yto']//a");


    public void clickSFOLink() {
        clickThis(linkSFOlocator);
    }

    public void inputStudentNameSearchField(String studentName) {
        clickThis(searchStudentNameFieldlocator);
        type(searchStudentNameFieldlocator, studentName);
    }

    public void inputItemNumberSearchField(String itemNumber) {
        clickThis(searchItemNumberFieldlocator);
        type(searchItemNumberFieldlocator, itemNumber);
    }

    public void clickAddButton() {
        clickThis(addButtonlocator);
        try {
            Thread.sleep(TestConstant.halfSecond);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void inputQtyField1(String quantity) {
        clickThis(qtyFirstFieldlocator);
        type(qtyFirstFieldlocator, quantity);
    }

    public void clickReviewCartButton() {
        scrollDownByPixel(800);
        clickThis(reviewCartButtonlocator);
    }

    public void clickRemoveItemCrossButton() {

        List<WebElement> crossButtonWebElements = getElements(removeItemCrossButtonlocator);
        for (WebElement crossButton : crossButtonWebElements) {
            clickThis(crossButton);
            break;
        }
    }

    public void clickRemoveYesButton() {

        List<WebElement> yesButtonWebElements = getElements(removeYesButtonlocator);
        for (WebElement yesButton : yesButtonWebElements) {
            clickThis(yesButton);
            break;
        }
    }

    public String getValidItemNumberErrorMsg() {
        return getElementText(validItemNumberErrorMsglocator);
    }

    public void clickYTOTab() {
        clickThis(yourTeacherOrderTablocator);
    }




}
