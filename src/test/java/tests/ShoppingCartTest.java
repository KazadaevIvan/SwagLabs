package tests;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class ShoppingCartTest extends BaseTest {

    @Test(description = "Validation that product could be removed from cart from Cart page")
    public void productShouldBeRemovedFromCart() {
        String productName = "Sauce Labs Backpack";
        productsPage
                .openPage()
                .isPageOpened()
                .addItemToCart(productName)
                .openShoppingCart();
        cartPage
                .isPageOpened()
                .productDetailsShouldBeLike(productName, "1", "29.99")
                .removeItemFromCart(productName)
                .numberOfItemsInTheCart(0);
    }
}