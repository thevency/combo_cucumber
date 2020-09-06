package printer;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import printerTask.Printer;


public class MyStepdefs {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{actor} give a string as {string}")
    public void giveAStringAs(Actor actor, String givenString) {
        actor.attemptsTo(Printer.setString(givenString));
    }

    @Then("{actor} will see printer prints {string} to console")
    public void seePrinterPrintsToConsole(Actor actor, String str) {
        String printerContent = actor.asksFor(Printer.getString());
        actor.attemptsTo(Ensure.that(printerContent).isEqualTo(str));
    }


}
