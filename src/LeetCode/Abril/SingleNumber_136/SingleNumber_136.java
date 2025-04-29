package LeetCode.Abril.SingleNumber_136;

import java.util.Arrays;

public class SingleNumber_136 {
    public int singleNumber(int[] nums){
        nums = Arrays.stream(nums).sorted().toArray();
        int res = 0;

            if (nums.length == 1){
                return nums[0];
            }

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == nums[i + 1]){
                i++;
            } else {
                return nums[i];
            }
        }
        return res == 0 ? nums[nums.length - 1] : res;
    }

    public static void main(String[] args) {
        SingleNumber_136 singleNumber136 = new SingleNumber_136();

        int[] input = {1,0,1};
        System.out.println(singleNumber136.singleNumber(input));
    }
}
