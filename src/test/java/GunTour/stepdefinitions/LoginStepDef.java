package GunTour.stepdefinitions;

import GunTour.pages.AdminProductPage;
import GunTour.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class LoginStepDef {

    AdminProductPage adminProductPage;
    LoginPage loginPage;
    @Given("already on login page")
    public void AlreadyOnLoginPage(){
        loginPage.open();
    }
    @When("input email {string}")
    public void InputEmail(String email){
        loginPage.InputEmail(email);
    }
    @And("input password {string}")
    public void InputPassword(String password){
        loginPage.InputPassword(password);
    }
    @And("click login button")
    public void ClickLoginButton(){
        loginPage.ClickLoginButton();
    }
    @Then("directed to admin page")
    public void DirectedtoAdminPage(){
        adminProductPage.clickOk();
        assertEquals("https://guntour.vercel.app/admin", adminProductPage.getUrl());
    }
//    @When("click product menu")
//    public void clickProductMenu() {
//        adminProductPage.ClickProductButton();
//    }
//    @And("products table appear")
//    public void productsTableAppear() {
//        assertEquals("PRICE", adminProductPage.getTableTitle());
//    }

}
