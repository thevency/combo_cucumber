package activity.shoppingGo;

import model.FRUITS;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

public class buyOrange implements Task {

    private int number;

    public buyOrange(int number) {
//        System.out.println("Actor is buying Orange");
        this.number = number;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        FruitShop.makeOrder(FRUITS.ORANGE,number);
    }

    public static buyOrange For(int number){
        System.out.println("Actor is buying "+number+" Orange");
        return Instrumented.instanceOf(buyOrange.class).withProperties(number);
    }

}
