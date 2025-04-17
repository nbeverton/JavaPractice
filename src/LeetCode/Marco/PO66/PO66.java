package LeetCode.Marco.PO66;

import java.math.BigInteger;
import java.util.Arrays;

public class PO66 {
    public int[] plusOne(int[] digits){

        StringBuilder digitsTemp = new StringBuilder();

        for (int digit : digits) {
            digitsTemp.append(digit);
        }

        String numberString = digitsTemp.toString();
//        int number = Integer.parseInt(numberString);
        long numberLong = Long.parseLong(numberString);
        BigInteger number = BigInteger.valueOf(numberLong);

        String resultString = String.valueOf(number);

        int[] digitsFinal = new int[resultString.length()];
        for (int i = 0; i < resultString.length(); i++) {
            digitsFinal[i] = Character.getNumericValue(resultString.charAt(i));
        }

    return digitsFinal;
    }

    public static void main(String[] args) {
        PO66 po66 = new PO66();

        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(po66.plusOne(digits)));
    }
}
