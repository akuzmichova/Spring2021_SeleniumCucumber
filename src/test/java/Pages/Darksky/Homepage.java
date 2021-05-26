package Pages.Darksky;

import Pages.WebCommands;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Homepage extends WebCommands {
    By todayTLlocator = By.xpath("//*[contains(text(), 'Today')]");
    By plusButtonLocator = By.xpath("//a[@data-day='0']/span[@class='toggle']/span[@class='open']");

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

    public void clickPlusButton() {
        clickThis(plusButtonLocator);
    }

    public void verifyTempValues() {
        String actualMin = getElementText(todayMinTemp).substring(0, getElementText(todayMinTemp).length() - 1);
        String expectedMin = getElementText(minTemp).substring(0, getElementText(minTemp).length() - 1);
        Assert.assertEquals(actualMin, expectedMin, "Low TempValue on timeline is NOT the same as Low tempValue in the Today's detail");

        String actualMax = getElementText(todayMaxTemp).substring(0, getElementText(todayMaxTemp).length() - 1);
        String expectedMax = getElementText(maxTemp).substring(0, getElementText(maxTemp).length() - 1);
        Assert.assertEquals(actualMax, expectedMax, "High TempValue on timeline is NOT the same as High tempValue in the Today's detail");
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

    public void verifyCurDateSelected() {
        Date currentTimeDate = new Date();
        SimpleDateFormat df = new SimpleDateFormat("d");
        String currentDay = df.format(currentTimeDate);
        String todayDateFromPage = getElementAttributeValue(todayDate, "data-day");
        Assert.assertEquals(currentDay, todayDateFromPage, "Current date is not selected");
    }
}

