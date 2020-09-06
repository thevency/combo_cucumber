package activity.shoppingGo;

import model.FRUITS;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;


public class buyApple implements Task {

    private int number;

    public buyApple(int number) {
//        System.out.println("Actor is buying Apples");
        this.number = number;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        FruitShop.makeOrder(FRUITS.APPLE,number);
    }

    public static buyApple For(int number){
        System.out.println("Actor is buying "+number+" Apples");
        return Instrumented.instanceOf(buyApple.class).withProperties(number);
    }

}
