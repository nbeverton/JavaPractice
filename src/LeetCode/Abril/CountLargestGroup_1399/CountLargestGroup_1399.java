package LeetCode.Abril.CountLargestGroup_1399;

import java.util.HashMap;
import java.util.Map;

public class CountLargestGroup_1399 {
    public int countLargestGroup(int n){

        // Chave = Soma dos dígitos
        // Valor = quantas vezes apareceu a soma
        Map<Integer, Integer> pairs = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            int sum = getDigitsSum(i);
            pairs.put(sum, pairs.getOrDefault(sum, 0) +1);
        }

        int maxGroupSize = 0;
        for (int value : pairs.values()) {
            if (value > maxGroupSize){
                maxGroupSize = value;
            }
        }

        int count = 0;
        for (int value : pairs.values()) {
            if (value == maxGroupSize){
                count++;
            }
        }

        return count;
    }

        public int getDigitsSum(int num){
            int sum = 0;

            while(num > 0){
                sum += num % 10;
                num /= 10;
            }
            return sum;
        }

    public static void main(String[] args) {
        CountLargestGroup_1399 countLargestGroup1399 = new CountLargestGroup_1399();

        int n = 13;
        System.out.println(countLargestGroup1399.countLargestGroup(n));
    }
}
