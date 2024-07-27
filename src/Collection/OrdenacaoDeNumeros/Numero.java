package Collection.OrdenacaoDeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Numero{

    List<Integer> numeros = new ArrayList();

    public Numero(){
    }

    void adicionarNumero(Integer numero){
        numeros.add(numero);
    }

    List<Integer> ordenarNumeroAsc(){
        List<Integer> listaCrescente = new ArrayList(this.numeros);
        Collections.sort(listaCrescente);
        return listaCrescente;
    }

    List<Integer> ordenarNumeroDes(){
        List<Integer> listaDecrescente = new ArrayList(this.numeros);
        Collections.reverse(listaDecrescente);
        return listaDecrescente;
    }
    @Override
    public String toString() {
        return "numeros = " + numeros;
    }
}
