package LeetCode.LoLW_58;

public class LoLW_58 {

    public int lengthOfLastWord(String s){

        int result = 0;
        int firstSpace;

        String sNoSpace = s.strip();
        char[] sChar = sNoSpace.toCharArray();

        for (int i = sChar.length -1; i >= 0; i--) {
            char tempChar = sChar[i];

            if(Character.isSpace(tempChar)){
                firstSpace = i;
                result = sNoSpace.length() - firstSpace - 1;
                break;
            } else {
                result = sNoSpace.length();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        LoLW_58 loLW58 = new LoLW_58();

        System.out.println(loLW58.lengthOfLastWord("   fly me   to   the moon  "));
    }
}
