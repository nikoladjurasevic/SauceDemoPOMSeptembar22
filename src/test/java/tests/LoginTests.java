package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests {


    /**
     *
     */
    @Test
    public void loginWithValidCreds() {
        ChromeDriver driver =  new ChromeDriver();
        try {

            LoginPage loginPage = new LoginPage(driver);
            loginPage.enterUserName("standard_user");
            loginPage.enterPassword("secret_sauce");
            loginPage.clickLoginButton();

        }finally {
            driver.quit();
        }
    }

    /**
     *
     */
    @Test
    public void loginWithInValidUserName() {
        ChromeDriver driver =  new ChromeDriver();
        try {
            LoginPage loginPage = new LoginPage(driver);
            loginPage.enterUserName("los user");
            loginPage.enterPassword("secret_sauce");
            loginPage.clickLoginButton();

        }finally {
            driver.quit();
        }
    }

}
