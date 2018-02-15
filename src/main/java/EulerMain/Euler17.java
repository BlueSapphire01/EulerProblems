package EulerMain;

import EulerSolution.Euler17Solution;

/**
 * Problem : If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
 * References : http://www.mathblog.dk/project-euler-17-letters-in-the-numbers-1-1000/
 */
public class Euler17 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        Euler17Solution euler17Solution = new Euler17Solution();
        int cntLetters = euler17Solution.countLettersOneToThousand();
        System.out.println("Number of letters in One to Thousand = " + cntLetters);

        long endTime = System.currentTimeMillis() - startTime;
        System.out.println("Time taken = " + endTime + " ms");
    }
}