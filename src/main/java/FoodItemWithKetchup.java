public class FoodItemWithKetchup extends Topping {

    public FoodItemWithKetchup(FoodItem foodItem){
        super(foodItem);
    }

    @Override
    public String getFoodName() {
        return super.getFoodName() + " + Ketchup";
    }

    @Override
    public double getItemPrice() {
        return super.getItemPrice() + 0.5;
    }
}
