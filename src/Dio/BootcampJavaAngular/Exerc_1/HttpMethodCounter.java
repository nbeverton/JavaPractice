package Dio.BootcampJavaAngular.Exerc_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HttpMethodCounter {
    public static String findMostFrequentMethod(String input) {

        String[] methods = input.split(",");
        Map<String, Integer> methodCounts = new HashMap<>();
        // TODO: Contar a ocorrência de cada método HTTP e armazenar no mapa 'methodCounts'

        for (String method : methods){
            String cleanedMethod = method.trim().toUpperCase();
            methodCounts.put(cleanedMethod, methodCounts.getOrDefault(cleanedMethod, 0) + 1);
        }

        System.out.println("Method counts: " + methodCounts);

        // Encontrar o metodo com a maior contagem
        String mostFrequentMethod = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : methodCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentMethod = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        // Descricao do metodo
        String description = "";
        switch (mostFrequentMethod) {
            case "GET":
                description = "O GET solicita a representacao de um recurso.";
                break;
            case "POST":
                description = "O POST envia dados para processamento.";
                break;
            case "PUT":
                description = "O PUT atualiza todos os dados de um recurso.";
                break;
            case "DELETE":
                description = "O DELETE remove um recurso especifico.";
                break;
            default:
                description = "Metodo nao reconhecido.";
        }

        return mostFrequentMethod + ": " + maxCount + " - " + description;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = findMostFrequentMethod(input);
        System.out.println(output);
    }
}
