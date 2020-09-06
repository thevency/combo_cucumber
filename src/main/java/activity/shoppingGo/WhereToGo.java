package activity.shoppingGo;

import net.serenitybdd.core.steps.Instrumented;

public class WhereToGo {

    public static comeToFruitShop FruitShop(){
        return Instrumented.instanceOf(comeToFruitShop.class).withProperties();
    }
}
