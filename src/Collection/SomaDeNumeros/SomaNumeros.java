package Collection.SomaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    List<Integer> listaNumeros = new ArrayList<>();

    @Override
    public String toString() {
        return "listaNumeros = " + listaNumeros;
    }

    void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    int calcularSoma(){
        int somaDaLista = 0;
        for (int s: listaNumeros) {
            somaDaLista += s;
        }
        return somaDaLista;
    }

    int encontrarMaiorNumero(){
        int maiorNumero = 0;
        for (int s: listaNumeros) {
            if(s > maiorNumero){
                maiorNumero = s;
            }
        }
        return maiorNumero;
    }

    int encontrarMenorNumero(){
        int menorNumero = 0;
        int maiorNumero = encontrarMaiorNumero();

        for (int s: listaNumeros) {
            if (s < maiorNumero){
                maiorNumero = s;
            }
        }
        menorNumero = maiorNumero;
        return menorNumero;
    }



    public static void main(String[] args) {

        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(2);

        System.out.println(somaNumeros);

        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
    }

}
