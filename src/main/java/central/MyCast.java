package central;

import org.openqa.selenium.WebDriver;

public class MyCast {

    private static WebDriver webDriver;

    public MyCast(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public static WebDriver getDriver(){
        return webDriver;
    }
}
