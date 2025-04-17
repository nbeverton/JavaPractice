package LeetCode.Marco.TLC_709;

public class TLC_709 {
    public String toLowerCase(String s){
        String result = "";
        char[] sCharArray = s.toCharArray();

        for (int i = 0; i < sCharArray.length; i++) {
            result += Character.toLowerCase(sCharArray[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        TLC_709 tlc709 = new TLC_709();
        System.out.println(tlc709.toLowerCase("TEstE"));
    }
}
