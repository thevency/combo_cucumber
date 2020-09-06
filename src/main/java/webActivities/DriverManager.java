package webActivities;

import model.BROWSERTYPE;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {


    private static WebDriver webDriver;
    private static BROWSERTYPE browsertype;

    public DriverManager(BROWSERTYPE browsertype){
        System.out.println("here");
        this.browsertype = browsertype;

        System.setProperty("webdriver.chrome.driver","src/test/resources/webdriver/windows/chromedriver.exe");
        switch (browsertype){
            case CHROME:
                webDriver = new ChromeDriver();
                break;
            case FIREFOX:
                webDriver = new FirefoxDriver();
                break;
            default:
                webDriver = new ChromeDriver();
        }
    }

    public static WebDriver getWebDriver(){
        return webDriver;
    }

}
