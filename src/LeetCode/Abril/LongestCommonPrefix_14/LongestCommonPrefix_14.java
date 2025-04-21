package LeetCode.Abril.LongestCommonPrefix_14;

public class LongestCommonPrefix_14 {
    public String longestCommonPrefix(String[] strs){
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        LongestCommonPrefix_14 longestCommonPrefix14 = new LongestCommonPrefix_14();

        String[] strs = {"abacate", "flo", "fli", "flu"};
        System.out.println(longestCommonPrefix14.longestCommonPrefix(strs));
    }
}
