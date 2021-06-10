package Pages.Facebook;

import Pages.WebCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class HomepageFB extends WebCommands {

    By createNewAccLocator = By.linkText("Create New Account");
    By genderRadioButtons = By.xpath("//input[@type='radio']");
    By messengerLink = By.linkText("Messenger");

    public void clickCreateNewAccountButton() {
        clickThis(createNewAccLocator);
    }

    public List<WebElement> getGenderRadioButtons() {
        return getElements(genderRadioButtons);
    }

    public boolean areGenderRadioButtonsSelected() {
        boolean isGenderRadioButtonSelected = false;
        for (WebElement genderRadioButton : getGenderRadioButtons()) {
            isGenderRadioButtonSelected |= isElementSelected(genderRadioButton);
        }
        return isGenderRadioButtonSelected;
    }

    public void scrollToBottomFacebook() {
        scrollToBottom();
    }

    public void clickMessengerLink() {
        scrollToBottomFacebook();
        clickThis(messengerLink);
    }

}
