package activity.shoppingGo;


import model.FRUITS;
import net.serenitybdd.core.steps.Instrumented;

public class FruitPrice {

    public static FRUITS orderedFruit;

    public static int orderNumber;

    private static double price =0.0;

    public static double calculate(){
        switch (orderedFruit){
            case APPLE:
                price = orderNumber*1.0;
                break;
            case ORANGE:
                price = orderNumber*3.5;
                break;
            case BANANA:
                price = orderNumber*1.0;
                break;
            default:
                System.out.println("Invalid fruit Type !");
                price = 0.0;
                break;
        }
        return price;
    }

}
