public class FoodItemWithKetchup extends Topping {

    public FoodItemWithKetchup(FoodItem foodItem){
        super(foodItem);
        addTopping("Ketchup", 0.5);
    }
}
