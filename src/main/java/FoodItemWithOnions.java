public class FoodItemWithOnions extends Topping{

    public FoodItemWithOnions(FoodItem foodItem) {
        super(foodItem);
        addTopping("Onions", 1.0);
    }
}
