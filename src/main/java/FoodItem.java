import java.util.HashMap;
import java.util.Map;

public abstract class FoodItem {
    private String foodName;
    private double itemPrice;

    FoodItem(){
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
}
