package LeetCode.Fevereiro.Fev10;

public class Solution {
    public String clearDigits(String s){

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) && !answer.isEmpty()){
                answer.setLength(answer.length() - 1);
            } else {
                answer.append(s.charAt(i));
            }
        }
    return answer.toString();
    }

    public static void main(String[] args) {
        Solution solution1 = new Solution();

        String result = solution1.clearDigits("acb34");
        System.out.println(result);
    }
}




