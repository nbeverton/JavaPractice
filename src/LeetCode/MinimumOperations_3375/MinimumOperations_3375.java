package LeetCode.MinimumOperations_3375;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumOperations_3375 {

    public int minOperations(int[] nums, int k){
        int result = 0;
        int refValue = 0;
        Arrays.sort(nums);

        List<Integer> numsList = new ArrayList<>();

        for (int num : nums) {
            numsList.add(num);
        }

        numsList.sort(Collections.reverseOrder());

        if (k <= nums[0]){

            for (int i = 0; i < nums.length; i++) {
                refValue = numsList.get(0);

                if (numsList.get(i) < refValue){
                    refValue = numsList.get(i);
                    result++;
                }
            }

        } else result = -1;

        return (refValue > k) ? result + 1 : result;
    }

    public static void main(String[] args) {
        MinimumOperations_3375 minOpe = new MinimumOperations_3375();

        int[] input1 = {9, 10 , 9};
        int k1 = 6;

        int[] input2 = {2,1,2};
        int k2 = 2;

        int[] input3 = {9, 7, 5, 3};
        int k3 = 1;


        System.out.println("Result: " + minOpe.minOperations(input1, k1));
    }
}
