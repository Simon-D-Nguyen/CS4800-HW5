public abstract class Topping extends FoodItem {
    FoodItem foodItem;
    Topping(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public String getFoodName() {
        return foodItem.getFoodName();
    }

    @Override
    public double getItemPrice() {
        return foodItem.getItemPrice();
    }
}
