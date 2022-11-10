package GunTour.stepdefinitions;

import GunTour.pages.AdminProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class UpdateProductStep {

    AdminProductPage adminProductPage;
    @Given("click edit product button")
    public void clickEditProductButton(){
        adminProductPage.clickEditProductButton();
    }
    @When("click close button edit modal")
    public void clickCloseButtonEditModal() {
        adminProductPage.scrollToCloseButton();
        adminProductPage.clickCloseButton();
    }
    @Then("edit product modal should closed")
    public void editProductModalShouldClosed() {
        adminProductPage.getTableTitle();
    }

    @And("input update product photo data")
    public void inputProductPhotoData() {
        adminProductPage.inputEditProductPhoto();
    }
    @And("input update product name {string}")
    public void inputProductName(String productName) {
        adminProductPage.inputProductName(productName);
    }

    @And("input update rent price {string}")
    public void inputRentPrice(String rentPrice) {
        adminProductPage.inputRentPrice(rentPrice);
    }

    @And("input update description {string}")
    public void inputDescription(String desc) {
        adminProductPage.inputDesc(desc);
    }

    @And("input update warning {string}")
    public void inputNote(String warning) {
        adminProductPage.inputWarning(warning);
    }

    @And("click save data button modal")
    public void clickSaveDataButtonModal() {
        adminProductPage.clickSaveDataButton();
    }

    @Then("the product should be edited")
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
}
