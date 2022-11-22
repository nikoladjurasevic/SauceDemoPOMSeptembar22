package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class CheckoutStepOnePage extends BasePage{
    //webelements

    @FindBy(xpath = "//input[@data-test = 'firstName']")
    WebElement firstNameField;

    @FindBy(xpath = "//input[@data-test = 'lastName']")
    WebElement lastNameField;

    @FindBy(xpath = "//input[@data-test = 'postalCode']")
    WebElement zipCodeField;

    @FindBy(xpath = "//input[@data-test = 'continue']")
    WebElement continueButton;

    @FindBy(xpath = "//button[@data-test = 'cancel']")
    WebElement cancelButton;


    //constructor
    public CheckoutStepOnePage(ChromeDriver driver) {
        super(driver);
        assert driver.getCurrentUrl().equals(Strings.CHECKOUT_STEP_ONE_URL) : "Wrong page. Expected "
                + Strings.CHECKOUT_STEP_ONE_URL + " . Actual " + driver.getCurrentUrl();

    }

    //methods for that page

    public void enterFirstName(String firstName) {
        print("enterFirstName ( " + firstName + " )");
        firstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        print("enterLastName ( " + lastName + " )");
        lastNameField.sendKeys(lastName);
    }

    public void enterZipCode(String zipCode) {
        print("enterZipCode ( " + zipCode + " )");
        zipCodeField.sendKeys(zipCode);
    }

    public void clickContinueButton() {
        print("clickContinueButton");
        continueButton.click();
    }

}
