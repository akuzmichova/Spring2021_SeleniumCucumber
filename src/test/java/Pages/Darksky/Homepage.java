package Pages.Darksky;

import Pages.WebCommands;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Homepage extends WebCommands {
    By todayTLlocator = By.xpath("//*[contains(text(), 'Today')]");
    By todayPlusButtonLocator = By.xpath("//a[@data-day='0']/span[@class='toggle']/span[@class='open']");

    By todayMinTemp = By.xpath("//a[@class='day revealed']//span[@class='tempRange']//span[@class='minTemp']");
    By minTemp = By.xpath("(//div[@class='dayDetails revealed']//span[@class='temp'])[1]");

    By todayMaxTemp = By.xpath("//a[@class='day revealed']//span[@class='tempRange']//span[@class='maxTemp']");
    By maxTemp = By.xpath("(//div[@class='dayDetails revealed']//span[@class='temp'])[2]");

    By buttonTM = By.xpath("//a[@class='button' and contains(text(), 'Time Machine')]");
    By todayDate = By.xpath("//td[@class='is-today']");

    public void scrollToToday() {
        scrollToElement(getElement(todayTLlocator));
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickTodayPlusButton() {
        scrollToToday();
        clickThis(todayPlusButtonLocator);
    }

    public String getTodayLowTempFromTimeline() {
        return getElementText(minTemp).substring(0, getElementText(minTemp).length() - 1);
    }

    public String getTodayLowTempInsideTimeline() {
        return getElementText(todayMinTemp).substring(0, getElementText(todayMinTemp).length() - 1);
    }

    public String getTodayHighTempFromTimeline() {
        return getElementText(maxTemp).substring(0, getElementText(maxTemp).length() - 1);
    }

    public String getTodayHighTempInsideTimeline() {
        return getElementText(todayMaxTemp).substring(0, getElementText(todayMaxTemp).length() - 1);
    }

    public void scrollToTimeMachine() {
        scrollToElement(getElement(buttonTM));
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickTMButton() {
        clickThis(buttonTM);
    }

    public String getSelectedDateInCalendar() {
        return getElementAttributeValue(todayDate, "data-day");
        }
}

