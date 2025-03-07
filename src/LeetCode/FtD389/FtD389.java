package LeetCode.FtD389;

import java.util.Arrays;
import java.util.HashMap;

public class FtD389 {

    public char findTheDifference(String s, String t){

        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);

        char[] tArray = t.toCharArray();
        Arrays.sort(tArray);


        for (int i = 0; i < sArray.length; i++) {
            if (sArray[i] != tArray[i]){
                return tArray[i];
            }
        }

        return tArray[tArray.length - 1];
    }

    public static void main(String[] args) {
        FtD389 ftD389 = new FtD389();

        char result = ftD389.findTheDifference("ajf", "fbaj");
        System.out.println(result);
    }
}
