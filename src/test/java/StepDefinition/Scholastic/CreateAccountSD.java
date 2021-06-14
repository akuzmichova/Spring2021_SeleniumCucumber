package StepDefinition.Scholastic;

import Pages.Scholastic.AccountPageScholastic;
import Pages.Scholastic.HomepageScholastic;
import Utils.TestConstant;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class CreateAccountSD {

    HomepageScholastic hs = new HomepageScholastic();
    AccountPageScholastic as = new AccountPageScholastic();

    @When("^On Scholastic Homepage I click on Create an Account$")
    public void clickCreateAccountButton() {
        hs.openScholastic();
        hs.clickCreateAccountLink();
    }

    @And("^I click on Teacher/Administrator/Homeschooler radio button and click Next$")
    public void clickteacherRadioBtnAndNext() {
        hs.clickteacherRadioButton();
        hs.clickTeacherNextButton();
    }

    @When("^I choose Mr. Title from Title drop-down$")
    public void clickTitle() {
        hs.clickTitleDropDown();
        hs.clickMrTitle();
    }

    String firstName1;

    @And("^I enter '(.*)' in First Name field$")
    public void fillFirstName(String firstName) {
        hs.inputFirstName(firstName);
        firstName1 = firstName;
    }

    String lastName1;

    @And("^I enter '(.*)' in Last Name field$")
    public void fillLastName(String lastName) {
        hs.inputLastName(lastName);
        lastName1 = lastName;
    }

    @And("^I enter '(.*)' in Email Address field$")
    public void fillEmail(String email) {
        hs.inputEmail(email);
    }

    @And("^I enter '(.*)' in Password field$")
    public void fillPassword(String password) {
        hs.inputPassword(password);
    }

    @And("^I click Terms of Use and Privacy Policy checkbox and click Next$")
    public void clickTermsOfUseandNextButton() {
        hs.clickTermsOfUse();
        hs.clickCreateTeacherAccountNextButton();
    }

    @When("^I input '(.*)' zip code and click Search$")
    public void inputZipCode(String zipcode) {
        hs.inputZipCode(zipcode);
        hs.clickSchoolSearchButton();
    }

    @When("^I select '.*' state from Search By State And City State drop-down$")
    public void inputState() {
        hs.clickSchoolStateField();
        hs.selectStateFromDropDown();
    }

    @And("^I select '(.*)' city from City drop-down and click Search$")
    public void inputCity(String city) {
        hs.selectCityFromDropDown(city);
        hs.clickStateCitySearchButton();
    }

    @And("^I input '(.*)' into School Name field$")
    public void searchSchoolName(String schoolName) {
        hs.searchSchoolNameAutosuggestion(schoolName);
    }

    @And("^I choose '(.*)' from drop autosuggestion list and click Next$")
    public String selectSchoolNameFromDropDown(String schoolName) {
        hs.selectSchoolNameFromDropDown(schoolName);
        hs.getschoolNameAndAddressTextHP();
        hs.clickMySchoolNextButton();
        return hs.getschoolNameAndAddressTextHP();
    }

    @When("^I choose Teacher 'by Grade' from Role drop-down$")
    public void selectTeacherRoleByGrade() {
        hs.clickMyRoleDropDown();
        hs.selectTeacherByGrade();
    }

    @And("^I choose 1st Grade from Grade drop-down$")
    public void select1StGrade() {
        hs.clickGradeDropDown();
        hs.select1stGrade();
    }

    @And("^I input '(.*)' in Number of Sturents field and click Next$")
    public void inputNumberOfStudents(String numOfStudents) {
        hs.inputNumberOfStudents(numOfStudents);
        hs.clickMyRolelNextButton();
    }

    @When("^I choose Guided Reading Level 'GRL' from Preferred Reading Level System drop-down and click Continue to Site button$")
    public void selectGRLfromPRLSdropDown() {
        hs.clickSelectTypeDropDown();
        hs.selectGuidedReadingLevel();
    }

    @Then("^I verify CLASS CODE allocated to the teacher, present on Home-Page$")
    public void verifyClassCodePresentOnHomePage() {
        Assert.assertFalse(hs.isClassCodeEpmtyHP(), "Class Code is empty");
    }

    @And("^I verify CLASS CODE allocated to the teacher, present on MyAccount-Page$")
    public void verifyClassCodePresentOnMyAccountPage() {
        hs.clickMyAccountLink();
        hs.clickProfileLink();
        Assert.assertFalse(as.isClassCodeEpmtyAP(), "Class Code is empty");
    }

    @And("^I verify same Teacher name is present on My Accounts$")
    public void verifyTeacherName() {
        Assert.assertEquals(as.getNameTextAP(), "Mr. " + firstName1 + " " + lastName1, "Teacher name is different on My Account Page");
    }

    @And("^I verify same school address is present as selected while creating the account$")
    public void verifySchoolAddress() {
        Assert.assertEquals(as.getschoolNameAndAddressTextAP(), hs.schoolNameAndAddressTextHP, "School address is different on My Account Page");
    }


}

