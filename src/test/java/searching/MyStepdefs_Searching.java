package searching;


import baseListener.Hook;
import central.MyCast;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import webActivities.target.HomePage;
import webActivities.target.SearchPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
public class MyStepdefs_Searching{

    @Managed
    WebDriver webDriver;


    @Before
    public void setUp(){
        System.out.println("Before of Cucumber");
        OnStage.setTheStage(new OnlineCast());
        MyCast myCast = new MyCast(webDriver);
    }

    @After
    public void tearDown(){
        MyCast.getDriver().quit();
    }

    @Given("{actor} opens browser as {string}")
    public void smiOpensBrowserAsBrowser(Actor actor, String address) {
        BrowseTheWeb.as(actor).openUrl(address);
    }

    @When("{actor} enters keyword as {string} to search box")
    public void smiEntersKeywordAsKeywordToSearchBox(Actor actor,String keyword) {
        WaitUntil.the(HomePage.SearchBox,isVisible()).forNoMoreThan(30).seconds();
        actor.attemptsTo(Enter.theValue(keyword).into(HomePage.SearchBox));
    }

    @And("{actor} clicks on Search Button")
    public void smiClicksOnSearchButton(Actor actor) throws InterruptedException {
        actor.attemptsTo(Hit.the(Keys.ENTER).keyIn(HomePage.SearchBox));
    }

    @Then("{actor} should see result that contains {string}")
    public void smiShouldSeeResultThatContainsResult(Actor actor,String result) {
        WaitUntil.the(SearchPage.SearchPanel,isPresent()).forNoMoreThan(30).seconds();
        actor.attemptsTo(Ensure.that(SearchPage.FirstSearchResult).textValues().contains(result));
    }





}
