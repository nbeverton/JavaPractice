package LeetCode.Fevereiro.FtIotFOiS28;

public class FtIotFOiS28 {

    public int strStr(String haystack, String needle){

        int occurrence = 0;

        if (haystack.contains(needle)){
            occurrence = haystack.indexOf(needle);
        } else {
            occurrence = -1;
        }

        return occurrence;
    }

    public static void main(String[] args) {
        FtIotFOiS28 ftIotFOiS28 = new FtIotFOiS28();
        
        System.out.println(ftIotFOiS28.strStr("everton", "ton"));
    }
}
