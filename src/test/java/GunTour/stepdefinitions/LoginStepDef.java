package GunTour.stepdefinitions;

import GunTour.pages.AdminProductPage;
import GunTour.pages.HomePageUser;
import GunTour.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginStepDef {

    LoginPage loginPage;
    HomePageUser homePageUser;

    AdminProductPage adminProductPage;
    @Given("I already on log in page")
    public void iAlreadyOnLoginPage(){
        loginPage.open();
    }

    @When("I input email {string}")
    public void iInputEmail(String email) {
        loginPage.InputEmail(email);
    }

    @And("I input password {string}")
    public void iInputPassword(String password) {
        loginPage.InputPassword(password);
    }

    @And("I click login button")
    public void iClickLoginButton() {
        loginPage.ClickLoginButton();
    }

    @Then("Should be directed to Home Page")
    public void shouldBeDirectedToHomePage() {
        assertTrue(homePageUser.isPopUpVisible());
        assertEquals("https://guntour.vercel.app/home", homePageUser.getUrl());
        assertEquals("POPULAR", homePageUser.getProductTittle());
        assertTrue(homePageUser.isBookingVisible());
    }
    @Then("directed to admin page")
    public void DirectedtoAdminPage(){
        adminProductPage.clickOk();
        assertEquals("https://guntour.vercel.app/admin", adminProductPage.getUrl());
    }
    @Given("user already login")
    public void userAlreadyLogin() {
        loginPage.open();
        loginPage.InputEmail("nyusdjaja30@gmail.com");
        loginPage.InputPassword("Araa1989");
        loginPage.ClickLoginButton();
    }
}