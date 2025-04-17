package LeetCode.Marco.CMAPFS1502;

import java.util.Arrays;

public class CMAPFS1502 {

    public boolean canMakeArithmeticProgression(int[] arr){

        Arrays.sort(arr);
        boolean result = true;

        for (int i = 0; i < arr.length - 1; i++) {

            int diffRef = arr[0] - arr[1];
            int diff = arr [i] - arr[i + 1];

            if (diff != diffRef) {
                result = false;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        CMAPFS1502 cmapfs1502 = new CMAPFS1502();

        int[] arr = {4, 2, 1};
        System.out.println(cmapfs1502.canMakeArithmeticProgression(arr));
    }
}
