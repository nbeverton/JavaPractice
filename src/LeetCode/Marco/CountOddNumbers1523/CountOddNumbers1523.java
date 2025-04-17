package LeetCode.Marco.CountOddNumbers1523;

public class CountOddNumbers1523 {
    public int countOdds(int low, int high){
        int totalNumbers = high - low +1;

        if (totalNumbers %2 == 0){
            return totalNumbers / 2;
        } else  {
            return (low % 2 != 0) ? (totalNumbers / 2 + 1) : (totalNumbers / 2);
        }
    }

    public static void main(String[] args) {
        CountOddNumbers1523 countOddNumbers1523 = new CountOddNumbers1523();

        int low = 0;
        int high = 1000000000;
        System.out.println(countOddNumbers1523.countOdds(low, high));
    }
}
