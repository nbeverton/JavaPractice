package LeetCode.RSP459;

public class RSP459 {
    public boolean repeatedSubstringPattern(String s){

        boolean answer = false;
        int sLength = s.length();

        for (int i = 1; i < sLength / 2; i++) {
            if (sLength % i == 0){

                String sSubstring = s.substring(0, i);

                StringBuilder repeated = new StringBuilder();

                for (int j = 0; j < sLength / i; j++) {
                    repeated.append(sSubstring);
                }

                if (repeated.toString().equalsIgnoreCase(s)){
                    answer = true;
                }

            }

        }

        return answer;
        }

    public static void main(String[] args) {
        RSP459 rsp459 = new RSP459();

        System.out.println(rsp459.repeatedSubstringPattern("ababa"));
    }
}
