package LeetCode.PO66;

import java.util.Arrays;

public class PO66_2 {

    public int[] plusOne(int[] digits){
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }
            else digits[i] = 0;
        }

        int[] result = new int[n + 1];
        result[0] = 1;

        return result;
    }

    public static void main(String[] args) {
        PO66_2 po66_2 = new PO66_2();

        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(po66_2.plusOne(digits)));
    }
}
