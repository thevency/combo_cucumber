package printerTask;

import net.serenitybdd.core.steps.Instrumented;

public class Printer {


    public Printer(){
        System.out.println("Welcome To Printer MAHCHINE");
    }

    public static setStringForPrinter setString(String str){
        return Instrumented.instanceOf(setStringForPrinter.class).withProperties(str);
    }

    public static getStringForPrinter getString(){
        return Instrumented.instanceOf(getStringForPrinter.class).withProperties();
    }

}
