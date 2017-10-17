package step_definitions;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_objects.LitecartMainPage;
import utils.DriverFactory;

public class LoginFormStepDefinitions {

    @When("I open litecart main page")
    public void openLitecartMainPage() {
        new LitecartMainPage().open();
    }

    @Then("I make sure that elements are present: email address, password, login button")
    public void checkElementsPresence() {
        LitecartMainPage mainPage = new LitecartMainPage();

        assertTrue(mainPage.isLoginButtonPresent());
        assertTrue(mainPage.isEmailFieldPresent());
        assertTrue(mainPage.isPasswordFieldPresent());
    }

    @Then("I make sure that sale stickers are present")
    public void checkSaleStickersPresent() {
        LitecartMainPage mainPage = new LitecartMainPage();
        assertTrue(mainPage.isSaleStickersListNotEmpty());
    }

    @After
    public void tearDown() {
        DriverFactory.shutDownDriver();
    }
}