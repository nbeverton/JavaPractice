package LeetCode.Marco.RtI_13;

public class RoI_13_2 {

    public int romanToInt(String s){
        int result = 0;
        char[] sChar = s.toCharArray();

        for (int i = 0; i < sChar.length; i++) {
            if (i < sChar.length - 1){

                if ( sChar[i] == 'I' && sChar[i + 1] == 'V'  ) {
                    result += 4;
                    i++;
                    continue;
                }
                if (sChar[i] == 'I' && sChar[i + 1] == 'X') {
                    result  += 9;
                    i++;
                    continue;
                }
                if (sChar[i] == 'X' && sChar[i + 1] == 'L') {
                    result  += 40;
                    i++;
                    continue;
                }
                if (sChar[i] == 'X' && sChar[i + 1] == 'C') {
                    result  += 90;
                    i++;
                    continue;
                }
                if (sChar[i] == 'C' && sChar[i + 1] == 'D') {
                    result  += 400;
                    i++;
                    continue;
                }
                if (sChar[i] == 'C' && sChar[i + 1] == 'M') {
                    result  += 900;
                    i++;
                    continue;
                }

                }
                 switch (sChar[i]) {
                    case 'I' -> result += 1;
                    case 'V' -> result += 5;
                    case 'X' -> result += 10;
                    case 'L' -> result += 50;
                    case 'C' -> result += 100;
                    case 'D' -> result += 500;
                    case 'M' -> result += 1000;

            }
        }

        return result;
    }

    public static void main(String[] args) {
        RoI_13_2 roI_13_2 = new RoI_13_2();

        System.out.println(roI_13_2.romanToInt("III"));
    }
}
