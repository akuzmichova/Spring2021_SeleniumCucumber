package Pages.Scholastic;

import Pages.WebCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class YourTeacherOrderPage extends WebCommands {

    By linkYTOlocator = By.xpath("//div[@class='hide-mobile desktop_nav_menu']//li[@id='your-teacher-order']");
    By itemQTYlocator = By.xpath("//td[@class=' item-qty']//input[@type='text']");
    By jumperHeadingTextlocator = By.xpath("//div[@class='info-modal-hd']");
    By jumperMessageTextlocator = By.xpath("//div[@class='info-modal-content']");
    By jumperCloseButtonlocator = By.xpath("//i[@class='fa fa-times info-modal-close']");
    By jumperlocator = By.xpath("//div[@class='arrow']");
    By byFlyerTablocator = By.xpath("//ul[@class='hidden-xs']//a[text()='By Flyer']");
    By reviewCartButtonYTOlocator = By.xpath("//button[@class='secondary']");


    public void clickYTOLink() {
        clickThis(linkYTOlocator);
    }

    List<WebElement> allQTYBoxListGlobal = getElements(itemQTYlocator);

    public void clickFirstItemQTYBox() {
        List<WebElement> allQTYBoxList = getElements(itemQTYlocator);
        clickThis(allQTYBoxList.get(0));
        allQTYBoxListGlobal = allQTYBoxList;
    }

    public String jumperHeadingText;

    public String jumperHeadingTextYTO() {
        String allJumperHeadingText = "";
        List<WebElement> allJumperHeadingTextList = getElements(jumperHeadingTextlocator);
        for (WebElement headingText : allJumperHeadingTextList) {
            allJumperHeadingText += headingText.getText();
        }
        jumperHeadingText = allJumperHeadingText.trim().replace("!", "");
        return jumperHeadingText;
    }

    public String jumperMessageText;

    public String jumperMessageTextYTO() {
        String allJumperMessageText = "";
        List<WebElement> allJumperMessageTextList = getElements(jumperMessageTextlocator);
        for (WebElement messageText : allJumperMessageTextList) {
            allJumperMessageText += messageText.getText();
        }
        jumperMessageText = allJumperMessageText.trim();
        return jumperMessageText;
    }

    public void typeIntoFirstItemQTYBox(String number) {
        type((allQTYBoxListGlobal.get(0)), number);
    }

    public void typeIntoSecondItemQTYBox(String number) {
        type((allQTYBoxListGlobal.get(1)), number);
    }

    public void clickjumperCloseButton() {
        clickThis(jumperCloseButtonlocator);
    }

    public void clickSecondItemQTYBox() {
        clickThis(allQTYBoxListGlobal.get(1));
    }

    public boolean isJumperDisplayed() {
        return isElementDisplayed(jumperlocator);
    }

    public void clickByFlyerTab() {
        clickThis(byFlyerTablocator);
    }

    public void clickReviewCartButtonYTO() {
        scrollToBottom();
        clickThis(reviewCartButtonYTOlocator);
    }


}