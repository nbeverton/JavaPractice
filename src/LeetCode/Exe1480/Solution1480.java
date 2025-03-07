package LeetCode.Exe1480;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution1480 {
    public int[] runningSum(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        return nums;
    }

    public static void main(String[] args) {
        Solution1480 solution1480 = new Solution1480();

        int[] nums = {1,2,3,4};

        int[] result = solution1480.runningSum(nums);

        System.out.println(Arrays.toString(result));
    }
}

