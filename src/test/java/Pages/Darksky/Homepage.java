package Pages.Darksky;

import DriverWrapper.Web;
import Pages.WebCommands;
import Utils.DateMethods;
import Utils.TestConstant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class Homepage extends WebCommands {
    By todayTLlocator = By.xpath("//*[contains(text(), 'Today')]");
    By todayPlusButtonLocator = By.xpath("//a[@data-day='0']/span[@class='toggle']/span[@class='open']");

    By todayMinTemp = By.xpath("//a[@class='day revealed']//span[@class='tempRange']//span[@class='minTemp']");
    By minTemp = By.xpath("(//div[@class='dayDetails revealed']//span[@class='temp'])[1]");

    By todayMaxTemp = By.xpath("//a[@class='day revealed']//span[@class='tempRange']//span[@class='maxTemp']");
    By maxTemp = By.xpath("(//div[@class='dayDetails revealed']//span[@class='temp'])[2]");

    By buttonTM = By.xpath("//a[@class='button' and contains(text(), 'Time Machine')]");
    By todayDate = By.xpath("//td[@class='is-today']");

    By timeDataPoints = By.xpath("//div[@class='hours']//span[contains(text(),'am') or contains(text(),'pm')]");


    public void scrollToToday() {
        scrollToElement(getElement(todayTLlocator));
        try {
            Thread.sleep(TestConstant.halfSecond);
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
            Thread.sleep(TestConstant.halfSecond);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickTMButton() {
        clickThis(buttonTM);
    }

    public String  getSelectedDateInCalendar() {
        return getElementAttributeValue(todayDate, "data-day");
    }

    public void openDarksky() {
        Web web = new Web();
        web.openUrl("https://darksky.net/forecast/40.7127,-74.0059/us12/en");
    }

    List<String> timeDataPointsFromTimeline = new ArrayList<String>();

    public List<String> getTimeDataPointsFromTimeline() {
        for (WebElement element : getElements(timeDataPoints)) {
            timeDataPointsFromTimeline.add(getElementText(element));
        }
        return timeDataPointsFromTimeline;
    }

    public boolean isTimeDataPointsEqual() {
        DateMethods dm = new DateMethods();
        getTimeDataPointsFromTimeline();
        return timeDataPointsFromTimeline.equals(dm.getTimeLineFromCalendar());
    }


}



