package LeetCode.LemonadeChange_860;

public class LemonadeChange_860 {
    public boolean lemonadeChange(int[] bills){
        int changeControl_5 = 0;
        int changeControl_10 = 0;

        for (int bill : bills) {

            if (bill == 5) {
                changeControl_5++;

            } else if (bill == 10) {
                changeControl_10++;
                changeControl_5--;

            } else if (bill == 20) {
                if (changeControl_10 > 0){
                    changeControl_10--;
                    changeControl_5--;
                } else {
                    changeControl_5--;
                    changeControl_5--;
                    changeControl_5--;
                }
            }

            if (changeControl_5 < 0 || changeControl_10 < 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LemonadeChange_860 lemonadeChange860 = new LemonadeChange_860();

        int[] input = {5,5,5,5,20,20,5,5,5,5};
        System.out.println(lemonadeChange860.lemonadeChange(input));
    }
}
