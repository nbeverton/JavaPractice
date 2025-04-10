package LeetCode.LongestValidParentheses_32;

public class LongestValidParentheses_32 {

    public int longestValidParentheses(String s){
        int parAbrir = 0;
        int parFech = 0;

        char[] sArray = s.toCharArray();

        for (char element: sArray) {
            if (element == '(' ){
                parAbrir++;
            }

            if (element == ')' ){
                parFech++;
            }
        }

        if (parAbrir >= parFech){
            return parFech * 2;
        } else return parAbrir * 2;
    }

    public static void main(String[] args) {
        LongestValidParentheses_32 longes = new LongestValidParentheses_32();

        System.out.println(longes.longestValidParentheses("(()"));
    }
}
