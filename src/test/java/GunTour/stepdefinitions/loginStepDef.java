package GunTour.stepdefinitions;

import GunTour.pages.HomePageUser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class loginStepDef {

    LoginPage loginPage;
    HomePageUser homePageUser;


    @Given("I already on log in page")
    public void iAlreadyOnLoginPage(){
        loginPage.open();
    }

    @When("I input email {string}")
    public void iInputEmail(String email) {
        loginPage.inputEmail(email);
    }

    @And("I input password {string}")
    public void iInputPassword(String password) {
        loginPage.inputPassowrd(password);
    }

    @And("I click login button")
    public void iClickLoginButton() {
        loginPage.clickButton();
    }

    @Then("Should be directed to Home Page")
    public void shouldBeDirectedToHomePage() {
        assertTrue(homePageUser.isPopUpVisible());
        assertEquals("https://guntour.vercel.app/home", homePageUser.getUrl());
        assertEquals("POPULAR", homePageUser.getProductTittle());
        assertTrue(homePageUser.isBookingVisible());
    }
}
