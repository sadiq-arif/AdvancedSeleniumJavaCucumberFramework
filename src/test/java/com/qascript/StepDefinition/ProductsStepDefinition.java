package com.qascript.StepDefinition;

import com.qascript.PageObjects.HomePage;
import com.qascript.PageObjects.ProductsPage;
import com.qascript.PageObjects.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.PrimitiveIterator;

public class ProductsStepDefinition {
    @When("user clicks on Add to Cart button for Macbook product")
    public void userClicksOnAddToCartButtonForMacbookProduct() {
        ProductsPage.validateProduct("MacBook");
        ProductsPage.validatePrice("$500");
        ProductsPage.clickAddToCartBtn();
    }

    @Given("user clicks on Show All Notebooks and Laptops link")
    public void userClicksOnShowAllNotebooksAndLaptopsLink() {
        HomePage.clickAllLaptopsAndNotebooks();
    }

    @Then("Macbook is added to shopping cart")
    public void macbookIsAddedToShoppingCart() {
        ShoppingCartPage.validateProductName("MacBook");
        ShoppingCartPage.validateProductQuantity("2");
        ShoppingCartPage.validateProductPrice("$500");
        ShoppingCartPage.validateProductTotalPrice("$500","2");
    }

    @And("user clicks on Macbook product")
    public void userClicksOnMacbookProduct() {
        ProductsPage.clickProduct();
    }

    @And("user enters the quantity of the product")
    public void userEntersTheQuantityOfTheProduct() {
        ProductsPage.enterQuantity("2");
    }

    @And("user clicks on Shopping Cart link")
    public void userClicksOnShoppingCartLink() {
        HomePage.clickShoppingCart();
    }
}
