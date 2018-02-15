package EulerMain;

import EulerSolution.Euler55Solution;

/**
 * <p>
 * How many Lychrel numbers are there below ten-thousand?
 */
public class Euler55 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        Euler55Solution euler55Solution = new Euler55Solution();
        int count = euler55Solution.getNumberOfLyrchrel();
        System.out.println("Lychrel Number below ten-thousand are " + count);

        long endTime = System.currentTimeMillis() - startTime;
        System.out.println("Time taken = " + endTime + " ms");
    }
}
