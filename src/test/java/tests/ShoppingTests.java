package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.*;

import javax.swing.*;

public class ShoppingTests extends BaseTest {

    /**
     * Buy one item
     *
     * Steps:
     * 1. Log into Sauce demo
     * 2. Add backpack to cart and navigate to cart page
     * 3. On cart page click continue
     * 4. Enter users information and continue
     * 5. Click finish
     *
     * Expected result:
     * 5. Verify that the item is bought and success message is shown
     */
    @Test
    public void buyOneItem() {
        ChromeDriver driver = openChromeDriver();
        try {

            print("Log into Sauce demo");
            LoginPage loginPage = new LoginPage(driver);
            loginPage.logInUser(Strings.VALID_USERNAME, Strings.VALID_PASSWORD);

            print("Add backpack to cart and navigate to cart page");
            InventoryPage inventoryPage = new InventoryPage(driver);
            inventoryPage.clickBackpackAddToCartButton();
            assert inventoryPage.getNumberFromShoppingCartIcon().equals("1") : "Wrong number of items. Expected: 1, Actual " + inventoryPage.getNumberFromShoppingCartIcon();
            inventoryPage.clickShoppingCartIcon();

            print("On cart page click continue");
            ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
            shoppingCartPage.clickCheckoutButton();

            print("Enter users information and continue");
            CheckoutStepOnePage checkoutStepOnePage = new CheckoutStepOnePage(driver);
            checkoutStepOnePage.enterLastName("Petrovic");
            checkoutStepOnePage.enterFirstName("Pera");
            checkoutStepOnePage.enterZipCode("11080");
            checkoutStepOnePage.clickContinueButton();

            print("Click finish");
            CheckoutStepTwoPage checkoutStepTwoPage = new CheckoutStepTwoPage(driver);
            checkoutStepTwoPage.clickFinishButton();

            print("Verify that the item is bought and success message is shown");
            CheckoutCompletePage checkoutCompletePage =  new CheckoutCompletePage(driver);
            String actualText = checkoutCompletePage.getHeaderText();
            assert actualText.equals(Strings.THANK_YOU_FOR_YOUR_ORDER_TEXT) : "Wrong text. " +
                    "Expected: " + Strings.THANK_YOU_FOR_YOUR_ORDER_TEXT + " Actual: " +actualText;


        }finally {
            driver.quit();
        }
    }

}
