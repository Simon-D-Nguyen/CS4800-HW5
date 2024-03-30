public class Driver {
    public static void main(String[] args) {

        // Start order
        // Burger = 6.99
        // Fries = 1.00
        // HotDog = 1.50
        // + Ketchup = .50
        // + Onions = 1.00

        Order newOrder = new Order(CustomerLoyalty.LoyaltyStatus.Newbie);
        newOrder.addItem(new Burger());
        newOrder.addItem(new FoodItemWithOnions(new Burger()));
        newOrder.printOrder();

        Order newItemOrder = new Order(CustomerLoyalty.LoyaltyStatus.Newbie);
        newItemOrder.addItem(new NewFood("DoubleBurger", 12.00));
        newItemOrder.printOrder();

        Order multipleToppings = new Order(CustomerLoyalty.LoyaltyStatus.Regular);
        multipleToppings.addItem(new FoodItemWithOnions(new FoodItemWithKetchup(new HotDog())));
        multipleToppings.printOrder();

        Order allStarOrder = new Order(CustomerLoyalty.LoyaltyStatus.AllStar);
        allStarOrder.addItem(new Burger());
        allStarOrder.printOrder();
    }
}