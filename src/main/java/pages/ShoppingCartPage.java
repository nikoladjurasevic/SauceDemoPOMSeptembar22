package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

    @FindBy(xpath = "//button[@data-test = 'checkout']")
    WebElement checkoutButton;



    public ShoppingCartPage(ChromeDriver driver) {
        super(driver);
        print("we are on shopping cart page");
        assert driver.getCurrentUrl().equals(Strings.SHOPPING_CART_PAGE_URL) : "User is not on Shopping cart page";
    }


    public void clickCheckoutButton() {
        print("clickCheckoutButton()");
        assert checkoutButton.isDisplayed() : "Checkout button is not present on page";

        checkoutButton.click();
    }

}
