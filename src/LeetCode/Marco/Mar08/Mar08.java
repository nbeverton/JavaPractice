package LeetCode.Marco.Mar08;

import java.util.Arrays;

public class Mar08 {
    public int minimumOperations(int[] nums){
        int numsLength = nums.length;
        int count = 0;

        while (Arrays.stream(nums).distinct().count() != numsLength && numsLength >= 3){
            nums = Arrays.copyOfRange(nums, 3, numsLength);
            numsLength = nums.length;
            count++;
        }

        if (Arrays.stream(nums).distinct().count() != numsLength && numsLength < 3){
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Mar08 mar08 = new Mar08();

        int[] input1 = {1,2,3,4,2,3,3,5,7}; // 2
        int[] input2 = {4,5,6,4,4}; // 2
        int[] input3 = {6,7,8,9}; // 0
        int[] input4 = {2}; // 0
        int[] input5 = {5, 5}; // 1
        int[] input6 = {3,7,12,12,3,14,1,1}; // 3
        int[] input7 = {65,22,64,22,71,67,82,40,32,100,39,91,40,34,95,79,5,75,80,62,23,11,36,32,32,16}; // 8
        System.out.println("Contagem 1: " + mar08.minimumOperations(input1));
        System.out.println("Contagem 2: " + mar08.minimumOperations(input2));
        System.out.println("Contagem 3: " + mar08.minimumOperations(input3));
        System.out.println("Contagem 4: " + mar08.minimumOperations(input4));
        System.out.println("Contagem 5: " + mar08.minimumOperations(input5));
        System.out.println("Contagem 6: " + mar08.minimumOperations(input6));
        System.out.println("Contagem 7: " + mar08.minimumOperations(input7));
    }
}
