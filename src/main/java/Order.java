import java.util.ArrayList;

public class Order {
    ArrayList<FoodItem> itemsInCart;
    int itemNumber;
    CustomerLoyalty loyalty;
    CustomerLoyalty.LoyaltyStatus status;


    public Order(CustomerLoyalty.LoyaltyStatus status){
        itemsInCart = new ArrayList<>();
        itemNumber = 0;
        this.loyalty = new CustomerLoyalty();

        this.status = status;
    }


    public void addItem(FoodItem foodItem){
        itemsInCart.add(foodItem);
    }


    public double getTotalCost(){
        double sum = 0.0;

        for(FoodItem foodItem: itemsInCart){
            sum += foodItem.getItemPrice();
        }

        return sum * loyalty.applyDiscount(status);
    }


    public String getItems(){
        String items = "";

        for(FoodItem item: itemsInCart){
            items = items + item.getFoodName() + System.lineSeparator();
        }

        return items;
    }


    public void printOrder(){
        System.out.println("Order contents: \n---");
        System.out.print(getItems());
        System.out.println("---");
        System.out.printf("Total: $%.2f%n%n", getTotalCost());
    }
}
