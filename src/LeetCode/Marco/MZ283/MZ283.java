package LeetCode.Marco.MZ283;

import java.util.Arrays;

public class MZ283 {
    public void moveZeros(int[] nums){

        int numsLength = nums.length;
        int numsNomZeroPosition = 0;

        for (int i = 0; i < numsLength; i++) {

            if (nums[i] != 0){
                nums[numsNomZeroPosition] = nums[i];
                numsNomZeroPosition++;
            }
        }

        for (int i = numsNomZeroPosition; i < numsLength; i++) {
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        MZ283 mz283 = new MZ283();

        int[] nums = {0,1,0,3,12};
        mz283.moveZeros(nums);
    }
}
