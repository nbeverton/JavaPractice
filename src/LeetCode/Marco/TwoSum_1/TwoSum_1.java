package LeetCode.Marco.TwoSum_1;

import java.util.Arrays;

public class TwoSum_1 {

    public int[] twoSum(int[] nums, int target){
        int[] result = {0, 0};

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TwoSum_1 twoSum1 = new TwoSum_1();

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum1.twoSum(nums, target)));
    }
}
