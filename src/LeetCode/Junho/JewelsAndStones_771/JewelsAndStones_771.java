package LeetCode.Junho.JewelsAndStones_771;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones_771 {
    public int numJewelsInStones(String jewels, String stones) {
//        Set<Character> jewelsSet = new HashSet<>();
        int res = 0;

        char[] stonesArray = stones.toCharArray();
        char[] jewelsArray = jewels.toCharArray();

        for (char c: stonesArray) {

            for (int i = 0; i < jewelsArray.length; i++) {
                if (jewelsArray[i] == c){
                    res++;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        JewelsAndStones_771 jewelsAndStones771 = new JewelsAndStones_771();

        String input1 = "aA";
        String input2 = "aAAbbbb";
        System.out.println(jewelsAndStones771.numJewelsInStones(input1, input2));
    }
}
