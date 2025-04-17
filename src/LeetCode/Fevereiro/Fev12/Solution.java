package LeetCode.Fevereiro.Fev12;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public int calculateDigitSum(int num){

        int digitSum = 0;

        while (num > 0){
            digitSum += num % 10;
            num /= 10;
        }

        return digitSum;
    }

    public int maximumSum(int[] nums){
        Pair<Integer, Integer>[] digitSumPairs = new Pair[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int digitSum = calculateDigitSum(nums[i]);
            digitSumPairs[i] = new Pair<>(digitSum, nums[i]);
        }

        Arrays.sort(
                digitSumPairs, Comparator.comparing(Pair<Integer, Integer>::getKey).thenComparing(
                        Pair<Integer, Integer>::getValue)
        );

        return 0;
    }
}
