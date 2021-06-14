package Pages.Scholastic;

import DriverWrapper.Web;
import Pages.WebCommands;
import Utils.TestConstant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomepageScholastic extends WebCommands {

    By createAccountLinklocator = By.xpath("//div[@id='navLinksOnly']/preceding-sibling::a[@class='create-account-trigger']");
    By teacherRadioButtonlocator = By.xpath("//label[@for='acccountTeacther']");
    By createAccountNextButtonlocator = By.id("linkChooseAcount");
    By selectTitlelocator = By.xpath("//div[contains(text(),'Select Title')]");
    By selectMrTitlelocator = By.xpath("//span[text()='Mr.']");
    By firstNameFieldlocator = By.id("dwfrm_profile_customer_firstname");
    By lastNameFieldlocator = By.id("dwfrm_profile_customer_lastname");
    By emailFieldlocator = By.id("dwfrm_profile_customer_email");
    By passwordFieldlocator = By.id("dwfrm_profile_login_password");
    By termsofuseCheckBoxlocator = By.id("dwfrm_registration_termsofuseteacher");
    By createTeacherAccountNextButtonlocator = By.name("dwfrm_profile_confirm");
    By zipCodeFieldlocator = By.id("dwfrm_myschool_schoolzip");

    By shcoolStateFieldlocator = By.className("custom-select");
    By stateFromDropDownlocator = By.xpath("//span[text()=' New York']");
    By cityFromDropDownlocator = By.id("dwfrm_myschool_schoolcity");
    By autosuggestionListlocator = By.className("auto-matches");


    By stateCitySearchButtonlocator = By.className("button-continue");

    By schoolSearchButtonlocator = By.name("dwfrm_myschool_search");
    By schoolNameFieldlocator = By.name("dwfrm_searchschool_schoolvalue");
    By dropDownSBClocator = By.xpath("//span[text()='scholastic+book+clubs']");
    By mySchoolNextButtonlocator = By.name("dwfrm_searchschool_findnext");
    By selectRolelFieldlocator = By.xpath("//div[contains(text(),'Select Role')]");
    By selectTeacherByGradelocator = By.xpath("//span[contains(text(),'by Grade')]");
    By selectGradeFieldlocator = By.xpath("//div[contains(text(),'Select Grade')]");
    By select1stGradelocator = By.xpath("//span[contains(text(),'1st Grade')]");
    By numberOfStudentsFielddlocator = By.id("dwfrm_myrole_students");
    By myRoleNextButtonlocator = By.name("dwfrm_myrole_findgrade");
    By selectTypeFieldlocator = By.xpath("//div[contains(text(),'Select Type')]");
    By selectGRLlocator = By.xpath("//span[contains(text(),'GRL')]");
    By continueToSiteButtonlocator = By.name("dwfrm_profileselection_confirmed");

    By classCodeTextlocatorHP = By.xpath("//div[text()='Class Code']/following-sibling::div");
    By myAccountLinklocator = By.xpath("//span[@class='hide-desktop' and contains(text(),'My Account')]//following-sibling::span");
    By ProfileLinklocator = By.xpath("//a[@title='Profile']");

    By schoolNameAndAddresslocatorHP = By.xpath("//div[@class='school-selection']//div[contains(@class,'school-')]");

    public void openScholastic() {
        Web web = new Web();
        web.openUrl("https://clubs3qa1.scholastic.com/home");
    }

    public void clickCreateAccountLink() {
        clickThis(createAccountLinklocator);
    }

    public void clickteacherRadioButton() {
        clickThis(teacherRadioButtonlocator);
    }

    public void clickTeacherNextButton() {
        moveMouseOverElement(createAccountNextButtonlocator);
        clickThis(createAccountNextButtonlocator);
    }

    public void clickTitleDropDown() {
        clickThis(selectTitlelocator);
    }

    public void clickMrTitle() {
        clickThis(selectMrTitlelocator);
    }

    public void inputFirstName(String firstName) {
        clickThis(firstNameFieldlocator);
        type(firstNameFieldlocator, firstName);
    }

    public void inputLastName(String lastName) {
        clickThis(lastNameFieldlocator);
        type(lastNameFieldlocator, lastName);
    }

    public void inputEmail(String email) {
        clickThis(lastNameFieldlocator);
        type(emailFieldlocator, email);
    }

    public void inputPassword(String password) {
        clickThis(passwordFieldlocator);
        type(passwordFieldlocator, password);
    }

    public void clickTermsOfUse() {
        clickThis(termsofuseCheckBoxlocator);
    }

    public void clickCreateTeacherAccountNextButton() {
        clickThis(createTeacherAccountNextButtonlocator);
    }

    public void inputZipCode(String zipcode) {
        clickThis(zipCodeFieldlocator);
        type(zipCodeFieldlocator, zipcode);
    }

    public void clickSchoolSearchButton() {
        clickThis(schoolSearchButtonlocator);
    }

    public void clickSchoolStateField() {
        moveMouseOverElement(shcoolStateFieldlocator);
        clickThis(shcoolStateFieldlocator);
    }

    public void selectStateFromDropDown() {
        clickThis(stateFromDropDownlocator);
    }

    public void selectCityFromDropDown(String city) {
        moveMouseOverElement(shcoolStateFieldlocator);
        clickThis(cityFromDropDownlocator);
        type(cityFromDropDownlocator, city);
        selectFromAutoSuggestion(autosuggestionListlocator,city);
        WebDriverWait eWait = new WebDriverWait(getDriver(), 20);
        eWait.until(ExpectedConditions.textToBe(autosuggestionListlocator,city));
    }

    public void clickStateCitySearchButton() {
        moveMouseOverElement(stateCitySearchButtonlocator);
        clickThis(stateCitySearchButtonlocator);
    }

    public void searchSchoolNameAutosuggestion(String schoolName) {
        clickThis(schoolNameFieldlocator);
        type(schoolNameFieldlocator, schoolName);
    }

    public void selectSchoolNameFromDropDown(String schoolName) {
        clickThis(dropDownSBClocator);
    }

    public void clickMySchoolNextButton() {
        clickThis(mySchoolNextButtonlocator);
    }

    public void clickMyRoleDropDown() {
        clickThis(selectRolelFieldlocator);
    }

    public void selectTeacherByGrade() {
        clickThis(selectTeacherByGradelocator);
    }

    public void clickGradeDropDown() {
        clickThis(selectGradeFieldlocator);
    }

    public void select1stGrade() {
        clickThis(select1stGradelocator);
    }

    public void inputNumberOfStudents(String numOfStudents) {
        clickThis(numberOfStudentsFielddlocator);
        type(numberOfStudentsFielddlocator, numOfStudents);
    }

    public void clickMyRolelNextButton() {
        clickThis(myRoleNextButtonlocator);
    }

    public void clickSelectTypeDropDown() {
        clickThis(selectTypeFieldlocator);
    }

    public void selectGuidedReadingLevel() {
        clickThis(selectGRLlocator);
        clickThis(continueToSiteButtonlocator);
    }

    public boolean isClassCodeEpmtyHP() {
        return (getElementText(classCodeTextlocatorHP).length() == 0);
    }

    public void clickMyAccountLink() {
        clickThis(myAccountLinklocator);
    }

    public void clickProfileLink() {
        clickThis(ProfileLinklocator);
    }

    public String schoolNameAndAddressTextHP;

    public String getschoolNameAndAddressTextHP() {
        String allSchoolText = "";
        List<WebElement> schoolText = getElements(schoolNameAndAddresslocatorHP);
        for (WebElement school : schoolText) {
            allSchoolText += school.getText();
        }
        schoolNameAndAddressTextHP = allSchoolText.replace(" ", "");
        return schoolNameAndAddressTextHP;
    }

}
