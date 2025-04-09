package LeetCode.LPTriangle_976;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LPTriangle_976 {
    public int largestPerimeter(int[] nums){
        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 2; i--) {
            int a = nums[i - 2];
            int b = nums[i - 1];
            int c = nums[i];

            if (a + b > c) {
                return a + b + c;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        LPTriangle_976 triangle976 = new LPTriangle_976();

        int[] input1 = {1,2,2,4,18,8};
        System.out.println(triangle976.largestPerimeter(input1));
    }
}
