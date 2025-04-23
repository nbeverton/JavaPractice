package LeetCode.Abril.CountLargestGroup_1399;

import java.util.HashMap;
import java.util.Map;

public class CountLargestGroup_1399 {
    public int countLargestGroup(int n){

        // Chave = Soma dos dígitos
        // Valor = quantas vezes apareceu a soma
        Map<Integer, Integer> pairs = new HashMap<>();


        for (int i = 1; i < n; i++) {
            int sum = 0;
            sum += i % 10;
            System.out.println(sum);
        }


        return 0;
    }

    public static void main(String[] args) {
        CountLargestGroup_1399 countLargestGroup1399 = new CountLargestGroup_1399();

        int n = 13;
        System.out.println(countLargestGroup1399.countLargestGroup(n));
    }
}
