import java.util.List;

public class HotDrinksMachine implements VendingMachine{

    public List<Product> productList;
    private int money;

    public HotDrinksMachine(List<Product> productList) {
        this.productList = productList;
    }
    @Override
    public Product getProduct(String name) {
        for (Product product:productList){
            if (product.getName().equals(name)){
                money += product.getPrice();
                return product;
            }
        }
        return null;
    }
    public HotDrink getProduct(String name, int volume, int temperature){
        for (Product product:productList){
            if(product instanceof HotDrink){
                if(product.getName().equals(name) && ((BottleOfWater) product).getVolume() == volume && ((HotDrink)product).getTemperature() == temperature){
                    return (HotDrink) product;
                }
            }
        }
        return null;
    }
}
