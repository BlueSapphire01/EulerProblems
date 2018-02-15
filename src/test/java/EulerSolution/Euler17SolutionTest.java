package EulerSolution;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class Euler17SolutionTest {
    Euler17Solution e17Solution = new Euler17Solution();

    @Test
    public void checkDigitsAdditionTest() {
        int response = e17Solution.countLettersOneToThousand();
        assertNotNull(response);
        assertEquals(21124, response);
    }
}
