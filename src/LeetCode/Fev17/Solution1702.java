package LeetCode.Fev17;

public class Solution1702 {
    public int numTilePossibilities(String tiles){
        tiles = "ABC";
         int[] charCount = new int[26];

        for (char letter : tiles.toCharArray()) {
            charCount[letter - 'A']++;
        }
        return findSequences(charCount);
    }

    private int findSequences(int[] charCount){
        int total = 0;

        for (int i = 0; i < 26; i++){
            if(charCount[i] == 0){
                continue;
            }
            total++;
            charCount[i]--;
            total += findSequences(charCount);
            charCount[i]++;
        }
        return total;
    }
    public static void main(String[] args) {
        Solution1702 solution = new Solution1702();

        solution.numTilePossibilities("ABC");

    }
}
