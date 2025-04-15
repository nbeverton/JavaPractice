package LeetCode.Abril.PalidromeNumber_9;

public class PalidromeNumber_9 {
    public boolean isPalidrome(int x){

        if (x < 0){
            return false;
        }

        String xStringReversed = new StringBuilder(Integer.toString(x)).reverse().toString();
        int xReversed = Integer.parseInt(xStringReversed);
        return xReversed == x;
    }

    public static void main(String[] args) {
        PalidromeNumber_9 palidromeNumber9 = new PalidromeNumber_9();

        int input = 1234567892;
        System.out.println(palidromeNumber9.isPalidrome(input));
    }
}
