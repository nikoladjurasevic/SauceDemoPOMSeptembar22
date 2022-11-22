package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class CheckoutStepTwoPage extends BasePage {
    //webelements
    @FindBy(xpath = "//button[@data-test = 'finish']")
    WebElement finishButton;


    //constructor
    public CheckoutStepTwoPage(ChromeDriver driver) {
        super(driver);
        assert driver.getCurrentUrl().equals(Strings.CHECKOUT_STEP_TWO_URL) : "User is NOT on checkout two page";
    }

    //methods
    public void clickFinishButton() {
        print("clickFinishButton");
        assert finishButton.isDisplayed() : "Finish button is not present on page";
        finishButton.click();
    }

}
