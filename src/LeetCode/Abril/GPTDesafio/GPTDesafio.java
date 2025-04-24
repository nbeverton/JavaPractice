package LeetCode.Abril.GPTDesafio;

import java.util.HashMap;
import java.util.Map;

public class GPTDesafio {

    public int countLargestFrequencyGroups(int n){
        int biggerGroup = 0;

        for (int i = 1; i <= n; i++) {
            int freq = countDigitFreq(i);

            System.out.println("Número: " + i + " → Maior frequência de dígitos: " + freq);

            if (freq > biggerGroup){
                biggerGroup = freq;
            }
        }

        return biggerGroup;
    }

    public int countDigitFreq(int num){
        Map<Integer, Integer> map = new HashMap<>();

        while(num > 0){
            int digit = num % 10;

            // Incrementa a frequência do dígito
            map.put(digit, map.getOrDefault(digit, 0) + 1);

            num = num / 10;
        }

        // Encontra a maior frequência entre os dígitos
        int maxFreq = 0;
        for (int freq : map.values()) {
            if (freq > maxFreq) {
                maxFreq = freq;
            }
        }

        return maxFreq;
    }

    public static void main(String[] args) {
        GPTDesafio gptDesafio = new GPTDesafio();

        int input = 1223;
        int resultado = gptDesafio.countLargestFrequencyGroups(input);
        System.out.println("\nMaior frequência encontrada entre os números de 1 a " + input + ": " + resultado);
    }
}
