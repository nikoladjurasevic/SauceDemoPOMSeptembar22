package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    @FindBy(xpath = "//a[@class = 'shopping_cart_link']")
    WebElement shoppingCartLink;

    @FindBy(xpath = "//span[@class = 'shopping_cart_badge']")
    WebElement shoppingCartBadge;

    ChromeDriver driver = null;

    public BasePage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }

    public void clickShoppingCartIcon() {
        print("clickShoppingCartIcon()");
        shoppingCartLink.click();
    }

    public String getNumberFromShoppingCartIcon() {
        print("getNumberFromShoppingCartIcon()");
        String number = shoppingCartBadge.getText();
        return number;
    }


    public void print(String s) {
        System.out.println(s);
    }


}
