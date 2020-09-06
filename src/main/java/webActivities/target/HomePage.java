package webActivities.target;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.time.Duration;

public class HomePage {

    private static long WAIT_OF_TARGET_1=30;

    public static Target SearchBox = Target.the("Search Box On Home Page")
                .located(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input"))
                .waitingForNoMoreThan(Duration.ofSeconds(WAIT_OF_TARGET_1));



}
