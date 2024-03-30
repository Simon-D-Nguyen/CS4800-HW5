import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class BurgerTest {

    FoodItem tester = new Burger();

    @Test
    public void testGetFoodName(){
        // GIVEN
        String expected = "Burger";
        // "burger" is instantiated with tester

        // WHEN
        String actual = tester.getFoodName();

        // THEN
        assertEquals(expected, actual);
    }


    @Test
    public void testSetFoodName() {
        // GIVEN
        String expected = "test";

        // WHEN
        tester.setFoodName("test");
        String actual = tester.getFoodName();

        // THEN
        assertNotEquals(expected, actual);
    }


    @Test
    public void testGetItemPrice(){
        // GIVEN
        double expected = 6.99;

        // WHEN
        double actual = tester.getItemPrice();

        // THEN
        assertEquals(expected, actual);
    }


    @Test
    public void testSetItemPrice(){
        // GIVEN
        double expected = 0.0;

        // WHEN
        tester.setItemPrice(0.0);
        double actual = tester.getItemPrice();

        // THEN
        assertNotEquals(expected, actual);
    }
}
