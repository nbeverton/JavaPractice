package LeetCode.Maio.BuidArrayfromPermutation_1920;

public class BuildArrayfromPermutation_1920 {

    public int[] buildArray(int[] nums){
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int num = nums[nums[i]];
            ans[i] = num;
        }
            return ans;
    }

    public static void main(String[] args) {
        BuildArrayfromPermutation_1920 buildArrayfromPermutation1920 = new BuildArrayfromPermutation_1920();

        int[] input = {5,0,1,2,3,4};
        System.out.println(buildArrayfromPermutation1920.buildArray(input));
    }
}
