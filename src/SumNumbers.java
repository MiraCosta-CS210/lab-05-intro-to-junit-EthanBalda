/*
 * LAB 05: Intro to JUnit (PART 2)
 *
 * Below you will find a sumIsEven() method, but it has some logic problems!
 *
 * Create JUnit tests which validates the sumIsEven() method for the following scenarios:
 *
 *   TEST SCENARIO 1
 *   INPUTS: 1, 1
 *   EXPECTED OUTPUT: 1 (which represents "true" - meaning the sum of the two numbers is even)
 *
 *   TEST SCENARIO 2
 *   INPUTS: 1, 2
 *   EXPECTED OUTPUT: 0 (which represents "false" - meaning the sum of the two numbers is odd)
 *
 * You will find that your tests aren't passing as expected!  Fix the bug in the sumIsEven method so that
 * it is working the way it should, so that your JUnit tests all pass!
 */

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SumNumbers {

    /*   Define a function called sumIsEven() which takes two integer inputs
     *   and returns 1 for “true” if the sum of the two values is an even number.
     *   If the sum is an odd number, then return 0 for “false.”
     */

    @Test
    public void testSumIsEven_Scenario1() {
        SumNumbers sumNumbers = new SumNumbers();
        int result = sumNumbers.sumIsEven(1, 1);
        assertEquals(1, result); //expecting 1 (true) since 1 + 1 = 2 (even)
    }

    @Test
    public void testSumIsEven_Scenario2() {
        SumNumbers sumNumbers = new SumNumbers();
        int result = sumNumbers.sumIsEven(1, 2);
        assertEquals(0, result); //expecting 0 (false) since 1 + 2 = 3 (odd)
    }

    @Test
    public void testSumIsEven_ZeroCase() {
        SumNumbers sumNumbers = new SumNumbers();
        int result = sumNumbers.sumIsEven(0, 0);
        assertEquals(1, result); //expecting 1 (true) since 0 + 0 = 0 (even)
    }

    @Test
    public void testSumIsEven_NegativeNumbers() {
        SumNumbers sumNumbers = new SumNumbers();
        int result = sumNumbers.sumIsEven(-1, -1);
        assertEquals(1, result); //expecting 1 (true) since -1 + -1 = -2 (even)
    }

    @Test
    public void testSumIsEven_MixedSignNumbers() {
        SumNumbers sumNumbers = new SumNumbers();
        int result = sumNumbers.sumIsEven(-1, 2);
        assertEquals(0, result); //expecting 0 (false) since -1 + 2 = 1 (odd)
    }
    public int sumIsEven(int a, int b) {
        if ((a + b) % 2 == 0) {  //corrected condition
            return 1; //even sum
        } else {
            return 0; //odd sum
        }
    }
}
