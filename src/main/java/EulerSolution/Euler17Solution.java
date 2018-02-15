package EulerSolution;

import java.util.Arrays;
import java.util.List;

import static java.lang.String.valueOf;

public class Euler17Solution {
    private static final List<String> ONE_TO_NINE = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine");
    private static final List<String> TEN_TO_NINETEEN = Arrays.asList("ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen");
    private static final List<String> TWENTY_TO_NINETY_NINE = Arrays.asList("twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety");

    public int countLettersOneToThousand() {
        int letters = countOneToNine() + countTenToNineteen() + countTwentyToNinetyNine() + countHundredToNineHundreNinetyNine() + valueOf("onethousand").length();
        return letters;
    }

    private int countOneToNine() {
        int count = 0;
        for (String word : ONE_TO_NINE) {
            count += word.length();
        }
        return count;
    }

    private int countTenToNineteen() {
        int count = 0;
        for (String word : TEN_TO_NINETEEN) {
            count += word.length();
        }
        return count;
    }

    private int countTwentyToNinetyNine() {
        int count = 0;
        for (String word : TWENTY_TO_NINETY_NINE) {
            count += word.length();
        }
        //prefix will occur 10 times
        count = 10 * count;
        //one to nine will repeat 8 times
        count += 8 * countOneToNine();
        return count;
    }

    private int countHundredToNineHundreNinetyNine() {
        int countOneToNinetyNine = countOneToNine() + countTenToNineteen() + countTwentyToNinetyNine();
        // one to nine 100 times
        return (100 * countOneToNine()) + (9 * countOneToNinetyNine) + (9 * valueOf("hundred").length()) + (891 * valueOf("hundredand").length());
    }
}
