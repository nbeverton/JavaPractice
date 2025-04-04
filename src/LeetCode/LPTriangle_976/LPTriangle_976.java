package LeetCode.LPTriangle_976;
import java.util.Arrays;

public class LPTriangle_976 {
    public int largestPerimeter(int[] nums){
        Arrays.sort(nums);

        int lastValueIndex = nums.length - 1;
        int lastValue = nums[nums.length - 1];

        System.out.println("lastValueIndex: " + lastValueIndex);
        System.out.println("lastValue: " + lastValue);

        for (int i = 0; i < nums.length - 2; i++) {

            if (nums.length == 3){
                if (nums[i] + nums[i + 1] > lastValue){
                    return lastValue + nums[i] + nums[i + 1];
                } else return 0;
            }

            if (lastValue < nums[lastValueIndex - 1] + nums[lastValueIndex - 2]){
                return lastValue + nums[lastValueIndex - 1] + nums[lastValueIndex - 2];
            } else if(lastValue - i < nums[lastValueIndex - 1 - i] + nums[lastValueIndex - 2 - i]) {
                return lastValue + nums[lastValueIndex - 1 - i] + nums[lastValueIndex - 2 - i];
            }

        }

        return 0;
    }

    public static void main(String[] args) {
        LPTriangle_976 triangle976 = new LPTriangle_976();

        int[] input1 = {3,6,2,3};
        int[] input2 = {2,1,2};
        int[] input3 = {1,2,1,10};
        System.out.println(triangle976.largestPerimeter(input1));
    }
}
