package LeetCode.Junho.IntersectionTwoArrays_349;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionTwoArrays_349 {
    public int[] intersection(int[] nums1, int[] nums2) {

        int[] arrayMaior = (nums1.length > nums2.length) ? nums1 : nums2;
        int[] arrayMenor = (nums1.length > nums2.length) ? nums2 : nums1;

        Arrays.sort(arrayMaior);
        Arrays.sort(arrayMenor);

        Set<Integer> resSet = new HashSet<>();

        int indice = 0;

        for (int j : arrayMenor) {
            int index = Arrays.binarySearch(arrayMaior, j);

            if (index >= 0){
                resSet.add(j);
            }

        }

        int[] res = new int[resSet.size()];
        int i = 0;
        for (int num : resSet) {
            res[i++] = num;
        }

        for (int z: res) {
            System.out.println(z);
        }

        return res;
    }

    public static void main(String[] args) {
        IntersectionTwoArrays_349 intersectionTwoArrays349 = new IntersectionTwoArrays_349();

        int[] input1 = {4,9,5};
        int[] input2 = {9,4,9,8,4};

        intersectionTwoArrays349.intersection(input1, input2);

    }
}
