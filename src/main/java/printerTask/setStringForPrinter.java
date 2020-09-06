package printerTask;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class setStringForPrinter implements Task {
    private String str;

    public setStringForPrinter(String str) {
        this.str = str;
    }

    public <T extends Actor> void performAs(T actor) {
       System.out.println("Inputted String is "+str);
       MyLib.set(str);
    }
}
