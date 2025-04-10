package LeetCode.LongestValidParentheses_32;

public class LongestValidParentheses_32 {

    public int longestValidParentheses(String s){
        int count = 0;

        for (int i = 0; i < s.length() - 1; i++) {

            String sRef = s.substring(i, i + 1);
            String sClose = s.substring(i + 1);

            if (sRef.equals("(") && sClose.contains(")")){
                count++;
            }

        }

        return count;
    }

    public static void main(String[] args) {
        LongestValidParentheses_32 longes = new LongestValidParentheses_32();

        System.out.println(longes.longestValidParentheses("(()"));
    }
}
