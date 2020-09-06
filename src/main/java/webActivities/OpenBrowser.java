package webActivities;

import central.MyCast;
import model.BROWSERTYPE;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

public class OpenBrowser implements Task {

    private WebDriver driver;

    private String address;

    public OpenBrowser(String address){
        this.address = address;
    }

    @Override
    @Step("{0} open browser at {1}")
    public <T extends Actor> void performAs(T actor) {
        driver = MyCast.getDriver();
        if(driver!=null) {
            driver.get(address);
        }else{
            System.out.println("Driver is null");
        }

    }

    public static OpenBrowser As(String address){
        return Instrumented.instanceOf(OpenBrowser.class).withProperties(address);
    }
}
