package LeetCode.Junho.ArrayPartition_561;

import java.util.Arrays;

public class ArrayPartition_561 {
    public int arrayPairSum(int[] nums){
        int res = 0;
//        int[] numsSorted = Arrays.stream(nums).sorted().toArray();
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 1; i++) {
            System.out.println(nums[i]);
            res += nums[i];
            i++;
        }

        return res;
    }

    public static void main(String[] args) {
        ArrayPartition_561 arrayPartition561 = new ArrayPartition_561();

        int[] input = {6,2,6,5,1,2};
        System.out.println(arrayPartition561.arrayPairSum(input));
    }
}
