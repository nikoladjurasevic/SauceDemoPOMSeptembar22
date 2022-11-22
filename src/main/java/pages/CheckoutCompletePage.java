package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage extends BasePage{

    @FindBy(xpath = "//h2[@class = 'complete-header']")
    WebElement headerText;

    public CheckoutCompletePage(ChromeDriver driver) {
        super(driver);
        assert driver.getCurrentUrl().equals(Strings.CHECKOUT_COMPLETE_URL) : "User is not on Checkout page";
    }

    public String getHeaderText() {
        print("getHeaderText");
        assert headerText.isDisplayed() : "Header is NOT shown on page";
        String actualText = headerText.getText();
        return  actualText;
    }

}
