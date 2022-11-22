package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(xpath = "//input[@id = 'user-name']")
    WebElement userNameField;

    @FindBy(xpath = "//input[@id = 'password']")
    WebElement passwordField;

    @FindBy(xpath = "//input[@id = 'login-button']")
    WebElement loginButton;

    //ovo mi je potrebno da bih mogao da koristim metode nad drajverom
    ChromeDriver driver = null;

    //ovo je konstruktor
    public LoginPage(ChromeDriver driver) {
        this.driver = driver;
        driver.get(Strings.LOGIN_PAGE_URL);
        PageFactory.initElements(driver, this);
        assert driver.getCurrentUrl().equals(Strings.LOGIN_PAGE_URL) : "User is not on Login page";
    }

    /**
     * This method clicks on a field and enters username
     * @param name
     */
    public void enterUserName(String name) {
        assert userNameField.isDisplayed() : "Username field is not present";
        userNameField.click();
        userNameField.sendKeys(name);
    }

    /**
     *
     * @param password
     */
    public void enterPassword(String password) {
        assert passwordField.isDisplayed() : "Password field is not present";
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        assert loginButton.isDisplayed() : "Login button is not present";
        loginButton.click();
    }

    /**
     *
     * @param userName
     * @param password
     */
    public void logInUser(String userName, String password) {
        enterUserName(userName);
        enterPassword(password);
        clickLoginButton();
    }

}
