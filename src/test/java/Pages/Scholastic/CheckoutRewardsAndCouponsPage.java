package Pages.Scholastic;

import Pages.WebCommands;
import org.openqa.selenium.By;

public class CheckoutRewardsAndCouponsPage extends WebCommands {

    By estimatedTaxesFieldlocator = By.xpath("//li[@class='std-total-msg']//span");

    public String getTaxAmountFromCheckoutPage() {
        return getElementText(estimatedTaxesFieldlocator);
    }

}
