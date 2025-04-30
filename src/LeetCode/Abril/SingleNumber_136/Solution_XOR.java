package LeetCode.Abril.SingleNumber_136;

public class Solution_XOR {
    public int singleNumber(int[] nums){
        int res = 0;

        for (int num : nums) {
            res ^= num;
            System.out.println(res);
        }

        return res;
    }
    public static void main(String[] args) {
        Solution_XOR solutionXor = new Solution_XOR();

        int[] input = {4,1,2,1,2};
        System.out.println("resultado: " + solutionXor.singleNumber(input));
    }
}
