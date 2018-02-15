package EulerSolution;

import com.google.common.annotations.VisibleForTesting;
import org.apache.commons.lang3.StringUtils;

public class Euler52Solution {

    public void getSmallestAnagramNumber() {
        int num = 0;
        for (int i = 1; i < 150000; i++) {
            num = getNumberWithSameDigits(i);
            if (num > 0) {
                break;
            }
        }

        if (num > 0) {
            System.out.println("The number is " + num);
        }

    }

    @VisibleForTesting
    int getNumberWithSameDigits(int num) {
        int doubleNum = 2 * num;
        int tripleNum = 3 * num;
        int fourOfNum = 4 * num;
        int fiveOfNum = 5 * num;
        int sixOfNum = 6 * num;
        if (isNumberAnagram(num, doubleNum)
                && isNumberAnagram(num, tripleNum)
                && isNumberAnagram(num, fourOfNum)
                && isNumberAnagram(num, fiveOfNum)
                && isNumberAnagram(num, sixOfNum)) {
            return num;
        }

        return -1;
    }

    private boolean isNumberAnagram(int originalNum, int numToCheck) {
        String strOriginalNum = String.valueOf(originalNum);
        String strNumToCheck = String.valueOf(numToCheck);

        if (strOriginalNum.length() != strNumToCheck.length()) {
            return false;
        }
        // checking if the digits exist
        char[] chars = strOriginalNum.toCharArray();
        for (char c : chars) {
            int index = strNumToCheck.indexOf(c);
            if (index != -1) {
                //taking out the number that matched
                strNumToCheck = strNumToCheck.substring(0, index).concat(strNumToCheck.substring(index + 1, strNumToCheck.length()));
            }
        }
        return StringUtils.isEmpty(strNumToCheck);
    }
}
