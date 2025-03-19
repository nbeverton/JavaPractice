package LeetCode.SotPoaA_1822;

public class SotPoaA_1822_2 {

    int negativeCount = 0;
    int result;

    public int arraySign(int[] nums) {

        for (int num : nums){

            if (num == 0){
                return 0;
            }

            if (num < 0){
                negativeCount++;
            }
        }

        return (negativeCount % 2 == 0) ? 1 : -1;
    }

    public static void main(String[] args) {
        SotPoaA_1822_2 finalResult = new SotPoaA_1822_2();

        int[] nums = {1,5,0,2,-3};
        System.out.println(finalResult.arraySign(nums));

    }
}
