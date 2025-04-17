package LeetCode.Marco.MSA1768;

public class MSA1768 {
    public String mergeAlternately(String word1, String word2){

        String result = "";
        int size = Math.max(word1.length(), word2.length());

        for (int i = 0; i < size; i++) {

            if (i < word1.length()){
                result += word1.charAt(i);
            }

            if (i < word2.length()){
                result += word2.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        MSA1768 msa1768 = new MSA1768();

        String result =  msa1768.mergeAlternately("abcd", "pq");

        System.out.println(result);
    }
}
