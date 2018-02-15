package EulerMain;

import EulerSolution.Euler52Solution;

/**
 * It can be seen that the number, 125874, and its double, 251748, contain exactly the same digits, but in a different order.
 * Find the smallest positive integer, x, such that 2x, 3x, 4x, 5x, and 6x, contain the same digits.
 */
public class Euler52 {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        Euler52Solution euler52Solution = new Euler52Solution();

        euler52Solution.getSmallestAnagramNumber();

        long endTime = System.currentTimeMillis() - startTime;
        System.out.println("Time taken = " + endTime + " ms");

    }


}
