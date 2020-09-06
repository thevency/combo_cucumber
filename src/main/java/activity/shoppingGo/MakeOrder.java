package activity.shoppingGo;

import model.FRUITS;
import net.serenitybdd.core.steps.Instrumented;

public class MakeOrder {

    private static int numberOfFruit;

    public MakeOrder(){
        System.out.println("Actor is buying fruit");
    }

    public static buyApple Apple(){
        return Instrumented.instanceOf(buyApple.class).withProperties(numberOfFruit);
    }

    public static buyOrange Orange(){
        return Instrumented.instanceOf(buyOrange.class).withProperties(numberOfFruit);
    }
}
