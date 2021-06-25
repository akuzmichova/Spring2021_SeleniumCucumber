package Pages.Scholastic;

import Pages.WebCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;


public class ReviewYourCartPage extends WebCommands {

    By reviewOrderHarry2S8locator = By.xpath("//tr[@id='2S8' and starts-with(@data-name,'Harry')]");
    By totalPriceHarrylocator = By.xpath("//li[@class='std-total-label' and contains(text(),'Harry')]/following-sibling::li[contains(@class,'price')]");
    By totalQtyHarrylocator = By.xpath("//li[@class='std-total-label' and contains(text(),'Harry')]/following-sibling::li[@class='std-total-qty']//span");
    By price2S8HarryItemlocator = By.xpath("//tr[@data-name='Harry' and starts-with(@id,'2S8')]//span[@class='value']");
    By qty2S8HarryItemlocator = By.xpath("//tr[@data-name='Harry' and starts-with(@id,'2S8')]//input");
    By orderTotalPricelocator = By.xpath("//li[@class='std-total-price sfoSubTotalPrice']");
    By orderTotalQtylocator = By.xpath("//span[@class='total-qty sfoSubTotalQty']");
    By proceedToCheckoutButtonRYOlocator = By.xpath("//form[@class='cart-action-checkout']//button[@id='dwfrm_cart_checkoutCart']");
    By proceedToCheckoutButtonModalWindowlocator = By.xpath("//form[@class='cart-action-continue-shopping']/following-sibling::form//fieldset//button");

    public boolean isHarry2S8Displayed() {
        try {
            isElementDisplayed(reviewOrderHarry2S8locator);
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public double itemTotalPriceNumber;
    public double itemPriceNumber;
    public int itemTotalQtyNumber;
    public int itemQtyNumber;

    public double verifyHarryTotalPriceUpdated() {

        itemTotalPriceNumber = Double.valueOf(getElementText(totalPriceHarrylocator).replace("$", ""));
        itemPriceNumber = Double.valueOf(getElementText(price2S8HarryItemlocator).replace("$", ""));
        itemTotalQtyNumber = Integer.valueOf(getElementText(totalQtyHarrylocator));
        itemQtyNumber = Integer.valueOf(getElementAttributeValue(qty2S8HarryItemlocator, "value"));
        itemTotalPriceNumber -= itemPriceNumber * itemQtyNumber;
        itemTotalQtyNumber -= itemQtyNumber;
        return itemTotalPriceNumber;
    }

    public double orderTotalPriceNumber;
    public double orderTotalQtyNumber;

    public double verifyOrderTotalPriceUpdated() {
        orderTotalPriceNumber = Double.valueOf(getElementText(orderTotalPricelocator).replace("$", ""));
        itemPriceNumber = Double.valueOf(getElementText(price2S8HarryItemlocator).replace("$", ""));
        orderTotalQtyNumber = Integer.valueOf(getElementText(orderTotalQtylocator));
        itemQtyNumber = Integer.valueOf(getElementAttributeValue(qty2S8HarryItemlocator, "value"));
        orderTotalPriceNumber -= itemPriceNumber * itemQtyNumber;
        orderTotalQtyNumber -= itemQtyNumber;
        return orderTotalPriceNumber;
    }

    public double itemTotalPriceAfterUpdateNumber;

    public double getItemTotalPriceAfterUpdate() {
        itemTotalPriceAfterUpdateNumber = Double.valueOf(getElementText(totalPriceHarrylocator).replace("$", ""));
        return itemTotalPriceAfterUpdateNumber;
    }

    public int itemTotalQtyAfterUpdateNumber;

    public double getItemTotalQtyAfterUpdate() {
        itemTotalQtyAfterUpdateNumber = Integer.valueOf(getElementText(totalQtyHarrylocator));
        return itemTotalQtyAfterUpdateNumber;
    }

    public double orderTotalPriceAfterUpdateNumber;

    public double getOrderTotalPriceAfterUpdate() {
        orderTotalPriceAfterUpdateNumber = Double.valueOf(getElementText(orderTotalPricelocator).replace("$", ""));
        System.out.println("orderTotalPriceAfterUpdateNumber" + orderTotalPriceAfterUpdateNumber);
        return orderTotalPriceAfterUpdateNumber;
    }

    public double orderTotalQtyAfterUpdateNumber;

    public double getOrderTotalQtyAfterUpdate() {
        orderTotalQtyAfterUpdateNumber = Integer.valueOf(getElementText(orderTotalQtylocator));
        System.out.println("orderTotalQtyAfterUpdateNumber " + orderTotalQtyAfterUpdateNumber);
        return orderTotalQtyAfterUpdateNumber;
    }

    public void clickProceedToCheckoutRYOButton() {
        scrollDownByPixel(900);
        clickThis(proceedToCheckoutButtonRYOlocator);
    }

    public void clickProceedToCheckoutModalWindowButton() {
        scrollDownByPixel(300);
        clickThis(proceedToCheckoutButtonModalWindowlocator);
    }

}


