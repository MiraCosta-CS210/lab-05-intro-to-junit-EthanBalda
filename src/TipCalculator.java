/*
 * LAB 05: Intro to JUnit (PART 1)
 *
 * Below you will find a working calculateTip() method.
 *
 * Create JUnit tests which validate that calculateTip() method for the following scenarios:
 *
 *   TEST SCENARIO 1
 *   INPUTS: $100.00 bill, 20% tip
 *   EXPECTED OUTPUT: $20.00
 *
 *   TEST SCENARIO 2
 *   Your choice!
 */

public class TipCalculator {
{

    /*  This method takes the bill amount as a double and a tip percentage as an
     *  integer and returns a rounded amount for what to tip. Use a tip calculator
     *  online to write test data to test this method.
     *
     *  For tests results that are off by 1 cent, consider it a rounding issue
     *  and adjust your test data.
     */
    @Test
    public void testCalculateTip_Scenario1() {
        TipCalculator calculator = new TipCalculator();
        double bill = 100.00;
        int tipPercentage = 20;
        double expectedTip = 20.00;
        double actualTip = calculator.calculateTip(bill, tipPercentage);
        assertEquals(expectedTip, actualTip, 0.01);
    }

    @Test
    public void testCalculateTip_Scenario2() {
        TipCalculator calculator = new TipCalculator();
        double bill = 45.50;
        int tipPercentage = 18;
        double expectedTip = 8.19; // 45.50 * 0.18 = 8.19
        double actualTip = calculator.calculateTip(bill, tipPercentage);
        assertEquals(expectedTip, actualTip, 0.01);
    }
    public double calculateTip(double bill, int percentage) {
        float decimalPercent = ((float) percentage / 100); //turns our integer percentage into a decimal
        //with the true decimal calculated, the below calculates the tip and rounds to two decimal places
        return (double) Math.round((decimalPercent * bill) * 100) / 100;
    }
}
