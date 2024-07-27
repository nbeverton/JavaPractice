package Collection.OrdenacaoDeNumeros;

public class OrdenacaoNumeros {
    public static void main(String[] args) {
        Numero listaDeNumeros = new Numero();

        listaDeNumeros.adicionarNumero(3);
        listaDeNumeros.adicionarNumero(5);
        listaDeNumeros.adicionarNumero(1);
        listaDeNumeros.adicionarNumero(10);

        System.out.println(listaDeNumeros);

        System.out.println(listaDeNumeros.ordenarNumeroAsc());
        System.out.println(listaDeNumeros.ordenarNumeroDes());
    }
}
