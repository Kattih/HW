import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new BottleOfWater("Минская", 50, 500));
        products.add(new BottleOfWater("Артезианская", 50, 500));
        products.add(new BottleOfWater("Артезианская", 100, 1000));
        //System.out.println(products);

        BottleOfWaterVendingMachine waterMachine = new BottleOfWaterVendingMachine(products);
        waterMachine.productList = products;
        Product product = waterMachine.getProduct("Минская");
        System.out.println(product);

        BottleOfWater bottle = waterMachine.getProduct("Артезианская", 1000);
        System.out.println(bottle);

        List<Product> products1 = new ArrayList<>();
        products1.add(new HotDrink("Кофе", 50, 60));
        products1.add(new HotDrink("Какао", 40, 60));
        products1.add(new HotDrink("Чай", 30, 70));
        //System.out.println(products1);

        HotDrinksMachine HotDrinksMachine = new HotDrinksMachine(products1);
        HotDrinksMachine.productList = products1;
        Product Drink = HotDrinksMachine.getProduct("Кофе");
        System.out.println(Drink);
    }
}