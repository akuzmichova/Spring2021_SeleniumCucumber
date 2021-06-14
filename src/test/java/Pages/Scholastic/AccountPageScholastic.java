package Pages.Scholastic;

import Pages.WebCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AccountPageScholastic extends WebCommands {

    By classCodeTextlocatorAP = By.xpath("//div[@class='classcode']//span");
    By nameTextlocatorAP = By.xpath("//h3[contains(text(),'Email')]/preceding-sibling::div//span");
    By schoolNameAndAddresslocatorAP = By.xpath("//div[@class='school-section']//span");


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
        return allSchoolText1.replace(" ","");
    }
}




