package LeetCode.Junho.JewelsAndStones_771;

public class JewelsAndStones_771 {
    public int numJewelsInStones(String jewels, String stones) {
        int res = 0;

        char[] stonesArray = stones.toCharArray();
        char[] jewelsArray = jewels.toCharArray();

        for (char s : stonesArray) {

            for (char j : jewelsArray) {
                if (j == s) {
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
