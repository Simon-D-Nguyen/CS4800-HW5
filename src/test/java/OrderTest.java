import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class OrderTest {


    @Test
    public void testGetTotalCost(){
        // GIVEN
        Order order = new Order(CustomerLoyalty.LoyaltyStatus.Newbie);
        double expected = 6.99;

        // WHEN
        order.addItem(new Burger()); //
        double actual = order.getTotalCost();

        // THEN
        assertEquals(expected, actual);
    }


    @Test
    public void testGetTotalCostWithRegularDiscount(){
        // GIVEN
        Order order = new Order(CustomerLoyalty.LoyaltyStatus.Regular);
        double expected = 6.6405;

        // WHEN
        order.addItem(new Burger());
        double actual = order.getTotalCost();

        // THEN
        assertEquals(expected, actual);
    }


    @Test
    public void testGetTotalCostWithAllStarDiscount(){
        // GIVEN
        Order order = new Order(CustomerLoyalty.LoyaltyStatus.AllStar);
        double expected = 6.291;

        // WHEN
        order.addItem(new Burger());
        double actual = order.getTotalCost();

        // THEN
        assertEquals(expected, actual);
    }


    @Test
    public void testGetItems(){
        // GIVEN
        Order order = new Order(CustomerLoyalty.LoyaltyStatus.Newbie);
        String expected = "Burger" + System.lineSeparator();

        // WHEN
        order.addItem(new Burger()); //
        String actual = order.getItems();

        // THEN
        assertEquals(expected, actual);
    }
}
