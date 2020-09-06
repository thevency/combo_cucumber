package activity.shoppingGo;

import model.FRUITS;

public class FruitShop {
    private static FRUITS fruitName;
    private static int numberOfFruit;
    private static double price =0.0;
    private static double totalPrice=0.0;

    public FruitShop() {
        System.out.println("Welcome to Fruit Shop");
    }

    public static void makeOrder(FRUITS fruits, int number){
        FruitPrice.orderedFruit = fruits;
        FruitPrice.orderNumber=number;
        FruitShop.totalPrice = FruitPrice.calculate() + FruitShop.totalPrice;
        System.out.println("totalPrice: "+totalPrice);
    }

    public static Double getBill(){
        Double finalPrice = FruitShop.totalPrice;
        FruitShop.totalPrice =0.0;
        return finalPrice;
    }


}
