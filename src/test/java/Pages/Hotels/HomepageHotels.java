package Pages.Hotels;

import DriverWrapper.Web;
import Pages.WebCommands;
import Utils.TestConstant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HomepageHotels extends WebCommands {

    By checkinCalendarLinklocator = By.xpath("//span[text()='Check in']");
    By backArrowlocator = By.xpath("//button[@aria-label='Previous']");
    By disabledDateslocator = By.xpath("//span[text()='Disabled']");
    By guestsLinklocator = By.xpath("//span[text()='Guests']");
    By adultsNumberlocator = By.xpath("//select[@name='q-room-0-adults']");
    By childrenNumberlocator = By.xpath("//select[@name='q-room-0-children']");
    By firstChildAgelocator = By.xpath("//select[@name='q-room-0-child-0-age']");
    By secondChildAgelocator = By.xpath("//select[@name='q-room-0-child-1-age']");
    By textRoomsPopuplocator = By.xpath("//div[contains(text(),'Adults')]");
    By applyButtonlocator = By.xpath("//button[@aria-label='Apply']");
    By textNumberOfGuestslocator = By.xpath("//span[contains(text(),'room')]");
    By destionationSearchFieldlocator = By.xpath("//form//span[contains(text(),'Vegas')]");
    By closeModalButtonlocator = By.xpath("//button[@class='modal-button modal-button-close']");
    By dropdownAllBorBoraTextlocator = By.xpath("//span[@class='highlighted' and contains(text(),'Bora')]");
    By forwardArrowlocator = By.xpath("//button[@aria-label='Next']");
    By allMonthslocator = By.xpath("//h2[@align='top']");
    By checkInDatelocator = By.xpath("//button[contains(@name,'Oct 10 2021')]");
    By checkOutDatelocator = By.xpath("//button[contains(@name,'Oct 31 2021')]");
    By searchButtonlocator = By.xpath("//button[@aria-label='Search']");
    By changeDatesButtonlocator = By.xpath("//button[@aria-label='Change dates']");


    public void openSHotels() {
        Web web = new Web();
        web.openUrl("https://www.hotels.com/");
    }

    public void clickCheckinCalendar() {
        clickThis(checkinCalendarLinklocator);
    }

    public boolean verifyBackButtonDisabled() {
        return isElementEnabled(backArrowlocator);
    }


    public boolean verifyPastDatesDisabled() {
        boolean allDatesDisabled = false;
        List<WebElement> disabledDatesWebElements = getElements(disabledDateslocator);
        for (WebElement disableDate : disabledDatesWebElements) {
            isElementEnabled(disableDate);
            allDatesDisabled &= isElementEnabled(disableDate);
        }
        return allDatesDisabled;
    }

    public void clickGuests() {
        clickThis(guestsLinklocator);
    }

    public void selectAdultsNumber(String adultNumber) {
        clickThis(adultsNumberlocator);
        selectFromDropdown(adultsNumberlocator, adultNumber);
    }

    public void selectChildrenNumber(String childrenNumber) {
        clickThis(childrenNumberlocator);
        selectFromDropdown(childrenNumberlocator, childrenNumber);
    }

    public void selectFirstChildAge(String firstChildAge) {
        clickThis(firstChildAgelocator);
        selectFromDropdown(firstChildAgelocator, firstChildAge);
    }

    public void selectSecondChildAge() {
        clickThis(secondChildAgelocator);
        selectFromDropdown(secondChildAgelocator, "<1");
    }

    public String numOfAdultsFromPopup;
    public String numOfChildrenFromPopup;

    public void getTextRoomsPopup() {
        String allText = getElementText(textRoomsPopuplocator);
        String[] afterSplitBy_space = allText.split(" ");
        numOfAdultsFromPopup = afterSplitBy_space[1].replace(" ", "").substring(4).trim();
        numOfChildrenFromPopup = afterSplitBy_space[3].trim();
    }

    public void clickApplyButton() {
        clickThis(applyButtonlocator);
    }

    public String totalNumOfGuests;

    public void getTotalNumberOfGuestsText() {
        String allNumberOfGuestsText = getElementText(textNumberOfGuestslocator);
        String[] afterSplitBy_space1 = allNumberOfGuestsText.split(" ");
        totalNumOfGuests = afterSplitBy_space1[2].trim();
    }

    public void closeModal() {
        clickThis(closeModalButtonlocator);
    }

    public void inputDestionationSearchField(String destination) {

        Actions act = new Actions(Web.getDriver());
        act.click(Web.getDriver().findElement(destionationSearchFieldlocator));
        act.sendKeys(destination).build().perform();
    }

    public void selectBoraBoraFromDropDown() {
        List<WebElement> allBoraBoraWebElements = getElements(dropdownAllBorBoraTextlocator);
        for (WebElement boraBora : allBoraBoraWebElements) {
            clickThis(boraBora);
            break;
        }
    }

    public void selectCheckInDate() {
        clickThis(checkinCalendarLinklocator);
        List<WebElement> monthsList = getElements(allMonthslocator);
        for (WebElement month : monthsList) {
            if (!getElementText(month).equalsIgnoreCase("October 2021")) {
                do {
                    clickThis(forwardArrowlocator);
                    try {
                        Thread.sleep(TestConstant.halfSecond);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } while (getElementText(month).equalsIgnoreCase("October 2021"));
            }
        }
        clickThis(checkInDatelocator);
        clickThis(checkOutDatelocator);
    }

    public void clickSearchButton() {
        clickThis(searchButtonlocator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        scrollDownByPixel(2000);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        scrollDownByPixel(1500);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        scrollDownByPixel(1000);
    }

    public boolean verifyChangeDateButtonDisplayed() {
        return isElementDisplayed(changeDatesButtonlocator);
    }

    public boolean verifyChangeDateButtonEnabled() {
        return isElementEnabled(changeDatesButtonlocator);
    }


}


