package activity.shoppingGo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;

public class comeToFruitShop implements Question<FruitShop> {

    @Override
    public FruitShop answeredBy(Actor actor) {
        return new FruitShop();
    }
}
