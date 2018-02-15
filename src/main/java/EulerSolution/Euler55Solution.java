package EulerSolution;

import com.google.common.annotations.VisibleForTesting;

import java.math.BigInteger;

public class Euler55Solution {
    public int getNumberOfLyrchrel() {
        int count = 0;
        for (int i = 0; i < 10000; i++) {
            if (isPalindrome(i)) {
                count++;
            }
        }
        return count;
    }

    @VisibleForTesting
    boolean isPalindrome(int num) {
        //integer value ran out of range, hence BigInteger
        BigInteger bigInteger = BigInteger.valueOf(num);
        for (int i = 0; i < 50; i++) {
            StringBuffer sb = new StringBuffer(String.valueOf(bigInteger));
            //adding the number and its reverse
            BigInteger result = BigInteger.valueOf(num).add(BigInteger.valueOf(Integer.parseInt(sb.reverse().toString())));
            StringBuffer sb2 = new StringBuffer(String.valueOf(result)).reverse();
            //checking if the result of addition matches the reverse
            if (String.valueOf(result).equals(sb2.toString())) {
                return true;
            }
            bigInteger = result;
        }
        return false;
    }
}
