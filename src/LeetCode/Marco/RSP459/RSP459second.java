package LeetCode.Marco.RSP459;

public class RSP459second {

    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        String modified = doubled.substring(1, doubled.length() - 1);
        return modified.contains(s);
    }

    public static void main(String[] args) {
        RSP459second rsp459second = new RSP459second();

        System.out.println(rsp459second.repeatedSubstringPattern("abcabcabc"));
    }
}

//abcabc abcabc