package LeetCode.Abril.PalidromeNumber_9;

public class PalidromeNumber_9 {
    public boolean isPalidrome(int x){

        if (x < 0) return false;
        if (x == 0) return true;

        StringBuilder xString = new StringBuilder();

        int value = x;
        while(value > 0){
            xString.append(value % 10);
            value = value / 10;
        }

        return Integer.toString(x).contentEquals(xString);
    }

    public static void main(String[] args) {
        PalidromeNumber_9 palidromeNumber9 = new PalidromeNumber_9();

        int input = 1234321;
        System.out.println(palidromeNumber9.isPalidrome(input));
    }
}
