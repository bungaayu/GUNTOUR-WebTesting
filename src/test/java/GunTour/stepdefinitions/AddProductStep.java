package GunTour.stepdefinitions;

import GunTour.pages.AdminProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class AddProductStep {
    AdminProductPage adminProductPage;

    @Given("click add product button")
    public void clickAddProductButton(){
        adminProductPage.clickAddProductButton();
    }
    @When("click close button add modal")
    public void clickCloseButtonAddModal() {
        adminProductPage.scrollToCloseButton();
        adminProductPage.clickCloseButton();
    }
    @Then("add product modal should closed")
    public void addProductModalShouldClosed() {
        adminProductPage.getTableTitle();
    }

    @And("input product photo data")
    public void inputProductPhotoData() {
        adminProductPage.inputAddProductPhoto();
    }
    @And("input product name {string}")
    public void inputProductName(String productName) {
        adminProductPage.inputProductName(productName);
    }

    @And("input rent price {string}")
    public void inputRentPrice(String rentPrice) {
        adminProductPage.inputRentPrice(rentPrice);
    }

    @And("input description {string}")
    public void inputDescription(String desc) {
        adminProductPage.inputDesc(desc);
    }

    @And("input warning {string}")
    public void inputNote(String warning) {
        adminProductPage.inputWarning(warning);
    }

    @And("click save data button modal")
    public void clickSaveDataButtonModal() {
        adminProductPage.clickSaveDataButton();
    }

    @Then("the product should be added to table")
    public void theProductShouldBeAddedToTable() {
        adminProductPage.clickOk();
        adminProductPage.clickCloseButton();
        adminProductPage.getTableTitle();
    }

    @Then("alert message should appear {string}")
    public void alertMessageShouldAppear(String alert) {
        assertEquals(alert, adminProductPage.getAlertProductPopup());
        adminProductPage.clickOk();

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
