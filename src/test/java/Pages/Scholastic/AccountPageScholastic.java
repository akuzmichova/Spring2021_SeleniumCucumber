package Pages.Scholastic;

import Pages.WebCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class AccountPageScholastic extends WebCommands {

    By classCodeTextlocatorAP = By.xpath("//div[@class='classcode']//span");
    By nameTextlocatorAP = By.xpath("//h3[contains(text(),'Email')]/preceding-sibling::div//span");
    By schoolNameAndAddresslocatorAP = By.xpath("//div[@class='school-section']//span");
    By myAccountLinklocator = By.xpath("//a[@class='user-account toggle-item']");
    By paymentMethodsLinklocator = By.xpath("//a[text()='Payment Methods']");
    By addCreditCardlocator = By.xpath("//a[@class='custom-tooltip tooltipstered']");
    By creditCardErrorMsglocator = By.xpath("//div[@class='tooltipster-body']");
    By hoverEnterOrdersTablocator = By.xpath("//div[@class='hide-mobile desktop_nav_menu']//a[@id='enter-orders']");

    public void hoverEnterOrdersTab() {
        moveMouseOverElement(hoverEnterOrdersTablocator);
    }

    public boolean isClassCodeEpmtyAP() {
        return (getElementText(classCodeTextlocatorAP).length() == 0);
    }

    public String getNameTextAP() {
        return getElementText(nameTextlocatorAP);
    }

    public String getschoolNameAndAddressTextAP() {
        String allSchoolText1 = "";
        List<WebElement> schoolText1 = getElements(schoolNameAndAddresslocatorAP);
        for (WebElement school : schoolText1) {
            allSchoolText1 += school.getText();
        }
        return allSchoolText1.replace(" ", "");
    }

    public void clickMyAccountLink() {
        clickThis(myAccountLinklocator);
    }

    public void paymentMethodsLink() {
        clickThis(paymentMethodsLinklocator);
    }

    public void clickAddCreditCardLink() {
        clickThis(addCreditCardlocator);
    }

    public String getCreditCardErrorMsgText() {
        return getElementText(creditCardErrorMsglocator);
    }


}




