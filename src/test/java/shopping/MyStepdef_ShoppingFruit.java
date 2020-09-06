package shopping;

import activity.shoppingGo.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.FRUITS;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

public class MyStepdef_ShoppingFruit {
    private FruitShop fruitShop;

    @Before
    public void setUp(){
       OnStage.setTheStage(new OnlineCast());
    }

    @Given("{actor} comes to Fruit shop")
    public void comesToFruitShop(Actor actor) {
        fruitShop = actor.asksFor(WhereToGo.FruitShop());
    }

    @When("{actor} buys {int} apples with price as 1 dollar per apple")
    public void buyApples(Actor actor, int number) {
        actor.attemptsTo(MakeOrder.Apple().For(number));
    }

    @And("{actor} buys {int} oranges with price as 3.5 dollar per orange")
    public void smiBuysNumOranges(Actor actor, int number) {
        actor.attemptsTo(MakeOrder.Orange().For(number));
    }

    @Then("{actor} pays for {double} dollars")
    public void pay(Actor actor, double total) {
        Double price = actor.asksFor(FinalBill.getTotal());
        System.out.println("price: "+price);
        actor.attemptsTo(Ensure.that(price).isEqualTo(total));
    }


}
