package Pages.Scholastic;

import Pages.WebCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class PDPScholastic extends WebCommands {

    By quickviewImagelocator = By.className("js-product-image");
    By quickLookTitleTextlocator = By.xpath("//a[@class='name-link']");
    By quickviewButtonlocator = By.className("quickview");
    By quickviewRecommendButtonlocator = By.xpath("//div[contains(@class,'recommended')]//span[@class='icon-button-text']");
    By quickviewRecToStudentsCheckboxlocator = By.xpath("//input[@value='recommended']");
    By quickviewRecToStudentsCloseButtonlocator = By.xpath("//span[@class='tooltipster-close ']");
    By quickviewCloseButtonlocator = By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-closethick']");

    public String quickLookTitleText;

    public String clickQuickviewElement() {
        String firstBookTitle = "";
        List<WebElement> quickviewImgList = getElements(quickviewImagelocator);
        for (WebElement quickviewImg : quickviewImgList) {
            moveMouseOverElement(quickviewImg);
            break;
        }
        firstBookTitle = getElementText(quickLookTitleTextlocator);
        quickLookTitleText = firstBookTitle.trim();
        List<WebElement> quickviewWebElements = getElements(quickviewButtonlocator);
        for (WebElement quickview : quickviewWebElements) {
            clickThis(quickview);
            break;
        }
        return quickLookTitleText;
    }

    public void clickRecommendButton() {
        clickThis(quickviewRecommendButtonlocator);
    }

    public void clickRecToStudentsCheckbox() {
        clickThis(quickviewRecToStudentsCheckboxlocator);
    }

    public void clickRecToStudentsCloseButton() {
        clickThis(quickviewRecToStudentsCloseButtonlocator);
    }

    public void clickquickviewCloseButton() {
        clickThis(quickviewCloseButtonlocator);
    }
}


