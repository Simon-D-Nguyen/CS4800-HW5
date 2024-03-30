public abstract class Topping extends FoodItem {
    Topping(FoodItem foodItem) {
        this.foodName = foodItem.getFoodName();
        this.itemPrice = foodItem.getItemPrice();
        this.toppings = foodItem.toppings;
    }
}
