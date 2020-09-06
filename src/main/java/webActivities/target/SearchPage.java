package webActivities.target;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.time.Duration;

public class SearchPage {

    public static Target SearchPanel = Target.the("Search Panel in Search Page")
            .located(By.id("search"))
            .waitingForNoMoreThan(Duration.ofSeconds(30));

    public static Target FirstSearchResult = Target.the("First Search Result in Search Page")
            .located(By.xpath("*//div[@id='search']/div/div/div[1]/div[@class='rc']//h3"))
            .waitingForNoMoreThan(Duration.ofSeconds(30));
}
