package LeetCode.Marco.MA_896;

public class MA_896 {

    public boolean isMonotonic(int[] nums){

        boolean increasing = true;
        boolean decreasing = true;

        int numsSize = nums.length;

        for (int i = 1; i < numsSize; i++) {
            if (nums[i] > nums[i - 1]){
                decreasing = false;
            }
            if (nums[i] < nums[i - 1]){
                increasing = false;
            }
        }

        return increasing || decreasing;
    }

    public static void main(String[] args) {
        MA_896 ma896 = new MA_896();

        int[] nums = {1, 3 ,2};
        System.out.println(ma896.isMonotonic(nums));
    }
}
