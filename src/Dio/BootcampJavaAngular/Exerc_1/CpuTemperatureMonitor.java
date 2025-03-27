package Dio.BootcampJavaAngular.Exerc_1;

import java.util.Scanner;

public class CpuTemperatureMonitor {
    public static String findHighestTemperature(String input) {
        String[] readings = input.split(",");
        int maxTemperature = Integer.MIN_VALUE;

        for (String reading : readings) {
            int temperature = Integer.parseInt(reading.trim());
            // TODO: Comparar a temperatura convertida com maxTemperature e atualizar maxTemperature se a leitura atual for maior.
            if (temperature > maxTemperature){
                maxTemperature = temperature;
            }
        }

        // TODO: Retorne a maior temperatura:
        return "Maior temperatura: " + maxTemperature + "°C";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = findHighestTemperature(input);
        System.out.println(output);
    }
}
