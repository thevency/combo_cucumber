package activity.shoppingGo;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class FinalBill implements Question<Double> {
    private Double price =0.0;

    @Override
    public Double answeredBy(Actor actor) {
        price = FruitShop.getBill();
        return price;
    }

    public static FinalBill getTotal(){
        return Instrumented.instanceOf(FinalBill.class).withProperties();
    }
}
