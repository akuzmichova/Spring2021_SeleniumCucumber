package Pages.Facebook;

import Pages.WebCommands;
import org.openqa.selenium.By;
import java.util.Set;

public class Messenger extends WebCommands {

    By loginButtonLocator = By.id("loginbutton");
    By loginErrorMsgLocator = By.xpath("//div[contains(text(), 'Incorrect')]");

    public String switchToMessengerHandle() {
        String fbHandle = getCurrentHandle();
        Set<String> allHandles = getAllHandles();
        String mesHandle = "";
        for (String handle : allHandles) {
            if (!handle.equalsIgnoreCase(fbHandle)) {
                switchToWindow(handle);
                break;
            }
            mesHandle = handle;
        }
        return mesHandle;
    }

    public void clickMessengerLogInButton() {

        clickThis(loginButtonLocator);
    }

    public void switchToMessengerLoginHandle() {
        Set<String> allHandles = getAllHandles();
        for (String mesLoginHandle : allHandles) {
            if (!mesLoginHandle.equalsIgnoreCase(switchToMessengerHandle())) {
                switchToWindow(mesLoginHandle);
                break;
            }
        }
    }

    public String isMessengerLoginErrorMsgDisplayed(){
        return getElementText(loginErrorMsgLocator);
    }

}
