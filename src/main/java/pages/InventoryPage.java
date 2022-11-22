package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage extends BasePage{

    @FindBy(xpath = "//button[@data-test = 'add-to-cart-sauce-labs-backpack']")
    WebElement backpackAddToCartButton;

    @FindBy(xpath = "//button[@data-test = 'add-to-cart-sauce-labs-onesie']")
    WebElement onesiekAddToCartButton;

    public InventoryPage(ChromeDriver driver) {
        super(driver);
        print("We are on Inventory page");
        assert driver.getCurrentUrl().equals(Strings.INVENTORY_PAGE_URL) : "User is not on Inventory page";
    }

    public void clickBackpackAddToCartButton() {
        print("clickBackpackAddToCartButton()");
        assert backpackAddToCartButton.isDisplayed() : "Add to cart button is NOT present";
        backpackAddToCartButton.click();
    }





}
