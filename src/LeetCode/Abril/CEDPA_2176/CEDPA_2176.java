package LeetCode.Abril.CEDPA_2176;

public class CEDPA_2176 {
    public int countPairs(int[] nums, int k){
        int res = 0;


        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && (i * j) % k == 0){
                    res++;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        CEDPA_2176 cedpa2176 = new CEDPA_2176();

        int[] nums = {3,1,2,2,2,1,3};
        int k = 2;
        System.out.println("Resultado: " + cedpa2176.countPairs(nums, k));
    }
}
