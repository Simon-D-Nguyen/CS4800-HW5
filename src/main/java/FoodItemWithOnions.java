public class FoodItemWithOnions extends Topping{

    public FoodItemWithOnions(FoodItem foodItem) {
        super(foodItem);
    }


    @Override
    public String getFoodName() {
        return super.getFoodName() + " + Onions";
    }

    @Override
    public double getItemPrice() {
        return super.getItemPrice() + 1.0;
    }
}
