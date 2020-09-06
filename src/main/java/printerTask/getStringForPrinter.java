package printerTask;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class getStringForPrinter implements Question<String> {

    public String answeredBy(Actor actor) {
        return  MyLib.get();
    }
}
