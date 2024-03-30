
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewFoodTest {

    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static final PrintStream originalOut = System.out;
    FoodItem tester = new NewFood("burger", 10.99);

    @BeforeAll
    public static void setupStreams(){
        System.setOut(new PrintStream(outContent));
    }

    @AfterAll
    public static void restoreStreams(){
        System.setOut(originalOut);
    }


    @Test
    public void testGetFoodName(){
        // GIVEN
        String expected = "burger";
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
        assertEquals(expected, actual);
    }


    @Test
    public void testGetItemPrice(){
        // GIVEN
        double expected = 10.99;

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
        assertEquals(expected, actual);
    }


    @Test
    public void testPrint(){
        // GIVEN
        tester = new NewFood("b", 0.0);
        String expected = System.lineSeparator() + "b : +$0.00"
                + System.lineSeparator();

        // WHEN
        tester.print();
        String actual = outContent.toString();

        assertEquals(expected, actual);
    }
}
