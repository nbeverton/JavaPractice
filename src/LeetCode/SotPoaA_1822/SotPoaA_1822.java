package LeetCode.SotPoaA_1822;


// Funciona apenas para arrays pequenas. Quando há overflow de números, a função quebra.
public class SotPoaA_1822 {

    int total = 1;
    int result = 0;

    public int arraySign(int[] nums) {

        for (int num : nums){
            total = total * num;
        }

        if (total > 0){
            result = 1;
        } else if (total < 0) {
            result = -1;
        }

        return result;
    }


    public static void main(String[] args) {
        SotPoaA_1822 finalResult = new SotPoaA_1822();

        int[] nums = {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
        System.out.println(finalResult.arraySign(nums));

    }
}
