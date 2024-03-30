import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CustomerLoyaltyTest {

    @Test
    public void testNewbieApplyDiscount(){
        // GIVEN
        CustomerLoyalty loyalty = new CustomerLoyalty();
        double expected = 1.0;

        // WHEN
        double actual = loyalty.applyDiscount(CustomerLoyalty.LoyaltyStatus.Newbie);

        // THEN
        assertEquals(expected, actual);
    }


    @Test
    public void testRegularApplyDiscount(){
        // GIVEN
        CustomerLoyalty loyalty = new CustomerLoyalty();
        double expected = 0.95;

        // WHEN
        double actual = loyalty.applyDiscount(CustomerLoyalty.LoyaltyStatus.Regular);

        // THEN
        assertEquals(expected, actual);
    }


    @Test
    public void testAllStarApplyDiscount(){
        // GIVEN
        CustomerLoyalty loyalty = new CustomerLoyalty();
        double expected = 0.9;

        // WHEN
        double actual = loyalty.applyDiscount(CustomerLoyalty.LoyaltyStatus.AllStar);

        // THEN
        assertEquals(expected, actual);
    }
}
