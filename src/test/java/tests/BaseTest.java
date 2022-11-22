package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    public ChromeDriver openChromeDriver() {
        print("This is how I open driver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--start-maximized"});
        options.addArguments(new String[]{"--ignore-certificate-errors"});
        options.addArguments(new String[]{"--disable-popup-blocking"});
        options.addArguments(new String[]{"--incognito"});
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        ChromeDriver driver = new ChromeDriver(options);
        return driver;
    }


    public void print(String s) {
        System.out.println(s);
    }
}
