package LeetCode.Junho.ReverseString_344;

public class ReverseString_344 {

    public void reverseString(char[] s){
        int init = 0;
        int fin = s.length - 1;

        while (init < fin){
            char temp = s[init];
            s[init] = s[fin];
            s[fin] = temp;

            init++;
            fin--;
        }
    }

    public static void main(String[] args) {
        ReverseString_344 reverseString344 = new ReverseString_344();

        char[] input = {'h','e','l','l','o'};
//        char[] input = {'a','b','c','d','e'};
        reverseString344.reverseString(input);

        for (char c : input) {
            System.out.println(c);
        }
    }
}
