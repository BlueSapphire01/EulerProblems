package EulerSolution;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class Euler55SolutionTest {

    Euler55Solution euler55Solution = new Euler55Solution();

    @Test
    public void checkCountLychrelTest() {
        int response = euler55Solution.getNumberOfLyrchrel();
        assertNotNull(response);
        assertEquals(4585, response);
    }

    @Test
    public void isPalindromePositiveTest() {
        boolean result = euler55Solution.isPalindrome(121);
        assertNotNull(result);
        assertTrue(result);
    }

    @Test
    public void isPalindromeNegativeTest() {
        boolean result = euler55Solution.isPalindrome(879);
        assertNotNull(result);
        assertFalse(result);
    }
}
