package baseListener;

import central.MyCast;
import io.cucumber.java.After;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import io.cucumber.java.Before;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


public class Hook {

    @Managed
    WebDriver webDriver;

    @Before
    public void setUp(){
        System.out.println("Before of Cucumber");
        OnStage.setTheStage(new OnlineCast());
        MyCast myCast = new MyCast(webDriver);
    }




}
