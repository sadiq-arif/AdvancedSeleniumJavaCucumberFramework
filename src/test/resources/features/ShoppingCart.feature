Feature: Add products to Shopping Cart

  Background:
    Given User is logged into the website

    Scenario: User is able to add products into the shopping cart
      Given user clicks on Show All Notebooks and Laptops link
      And   user clicks on Macbook product
      And   user enters the quantity of the product
      When  user clicks on Add to Cart button for Macbook product
      And   user clicks on Shopping Cart link
      Then  Macbook is added to shopping cart