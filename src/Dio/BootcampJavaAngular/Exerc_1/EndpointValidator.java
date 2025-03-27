package Dio.BootcampJavaAngular.Exerc_1;

import java.util.Scanner;

public class EndpointValidator {

    public static String validateEndpoint(String endpoint) {
        // TODO: Verifique se o endpoint fornecido segue o formato padrão de endpoint de API:

        String regex = "^/api/\\w+(/\\w+)*$";

        return endpoint.matches(regex) ?  "Endpoint valido." :  "Endpoint invalido.";

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String endpoint = scanner.nextLine();
        System.out.println(validateEndpoint(endpoint));
    }

}
