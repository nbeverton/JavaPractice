package LeetCode.Marco.VA242;

import java.util.Arrays;

public class VA242 {
    public boolean isAnagram(String s, String t){
        boolean result;

        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);

        char[] tArray = t.toCharArray();
        Arrays.sort(tArray);

        String tArranged = new String(tArray);
        String sArranged = new String(sArray);

        result = tArranged.equalsIgnoreCase(sArranged);

        return result;
    }

    public static void main(String[] args) {
        VA242 va242 = new VA242();
        System.out.println(va242.isAnagram("anagram", "nagaram"));
    }
}
