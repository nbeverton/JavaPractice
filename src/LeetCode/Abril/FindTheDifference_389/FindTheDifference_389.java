package LeetCode.Abril.FindTheDifference_389;

import java.util.Arrays;

public class FindTheDifference_389 {
    public char findTheDifference(String s, String t){
        char xor = 0;

        for (char sChar : s.toCharArray()) {
            xor ^= sChar;
        }

        for (char tChar : t.toCharArray()) {
            xor ^= tChar;
        }

        return xor;
    }

    public static void main(String[] args) {
        FindTheDifference_389 findTheDifference389 = new FindTheDifference_389();


        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference389.findTheDifference(s, t));
    }
}
