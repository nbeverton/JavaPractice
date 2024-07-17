package ValidacaoProcessoSeletivo;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {

//        selecaoDeCandidatos();
        imprimirCandidatos();
    }

    static void imprimirCandidatos(){
        String[] candidatos = {"Ana", "Bia", "Carla", "Daniel", "Elton", "Fabi", "Gabi", "Heitor", "Irene", "João Banana"};

        for (String candidato: candidatos){
            System.out.println("O candidato selecionado foi: " + candidato);
        }
    }

    static void selecaoDeCandidatos(){
        String[] candidatos = {"Ana", "Bia", "Carla", "Daniel", "Elton", "Fabi", "Gabi", "Heitor", "Irene", "João Banana"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou o salário de: " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga!");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double pretensaoSalarial){
        double salarioBase = 5000.0;
        if (pretensaoSalarial < salarioBase){
            System.out.println("Ligar para o candidato");
        } else if (pretensaoSalarial == salarioBase) {
            System.out.println("Negociar com o candidato");
        } else {
            System.out.println("Aguardar novas propostas");
        }

    }
}
