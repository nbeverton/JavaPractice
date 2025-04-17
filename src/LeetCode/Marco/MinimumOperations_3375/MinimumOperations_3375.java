package LeetCode.Marco.MinimumOperations_3375;
import java.util.Arrays;

public class MinimumOperations_3375 {
    public int minOperations(int[] nums, int k){
        Arrays.sort(nums);
        int result = 0;
        int refValue = nums[nums.length - 1];

        if (k <= nums[0]){

            for (int i = nums.length - 1; i >= 0; i--) {

                if (nums[i] < refValue){
                    refValue = nums[i];
                    result++;
                }
            }
            return (refValue > k) ? result + 1 : result;

        } else return -1;
    }

    public static void main(String[] args) {
        MinimumOperations_3375 minOpe = new MinimumOperations_3375();

        int[] input1 = {6, 9, 2, 2};
        int k1 = 5;

        int[] input2 = {2,1,2};
        int k2 = 2;

        int[] input3 = {9, 7, 5, 3};
        int k3 = 1;


        System.out.println("Result: " + minOpe.minOperations(input1, k1));
    }
}
