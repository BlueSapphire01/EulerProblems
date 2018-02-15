package EulerSolution;

import EulerSolution.Euler52Solution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class Euler52SolutionTest {
    Euler52Solution euler52Solution = new Euler52Solution();

    @Test
    public void checkSameDigitNumbersHappyPathTest() {
        int response = euler52Solution.getNumberWithSameDigits(142857);
        assertNotNull(response);
        assertEquals(142857, response);
    }

    @Test
    public void checkSameDigitNumbersFailureTest() {
        int response = euler52Solution.getNumberWithSameDigits(125878);
        assertNotNull(response);
        assertEquals(-1, response);
    }

    @Test
    public void checkSameDigitNumbersWithNegativeNumberTest() {
        int response = euler52Solution.getNumberWithSameDigits(-1);
        assertNotNull(response);
        assertEquals(-1, response);
    }

    @Test
    public void checkSameDigitNumbersWithZeroTest() {
        int response = euler52Solution.getNumberWithSameDigits(0);
        assertNotNull(response);
        assertEquals(0, response);
    }
}
