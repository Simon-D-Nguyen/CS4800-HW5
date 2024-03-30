import java.util.HashMap;
import java.util.Map;

public abstract class FoodItem {
    protected Map<String, Double> toppings;
    protected String foodName;
    protected double itemPrice;

    FoodItem(){
        this.toppings = new HashMap<>();
        this.foodName = "n/a";
        this.itemPrice = 0.0;
    }


    public void setFoodName(String foodName){
        this.foodName = foodName;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setItemPrice(double itemPrice){
        this.itemPrice = itemPrice;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void print() {
        System.out.printf("%n%s : +$%.2f%n", foodName, itemPrice);
        for(String topping: toppings.keySet()){
            System.out.printf("|--> %s : +$%.2f%n", topping, toppings.get(topping));
        }
    }

    protected void addTopping(String topping, double price) {
        toppings.put(topping, price);
    }



}
