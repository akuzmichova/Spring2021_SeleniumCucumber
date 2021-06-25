package Pages.Scholastic;

import Pages.WebCommands;
import org.openqa.selenium.By;

public class MyListsPageScholastic extends WebCommands {

    By studentRecommendTitleTextlocatorMLP = By.xpath("//div[@class='product-list-item']//a");

    public String textfromMLP;

    public String getStudentRecommendTitleTextMLP() {
        textfromMLP = getElementText(studentRecommendTitleTextlocatorMLP);
        return textfromMLP;
    }
}
