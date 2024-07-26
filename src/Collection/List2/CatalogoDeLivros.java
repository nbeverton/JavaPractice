package Collection.List2;

import java.util.ArrayList;

public class CatalogoDeLivros {

    static ArrayList<Livro> livros = new ArrayList<>();
    static Livro livro = new Livro();

    static Livro livro1 = new Livro("Teste1", "João Banana", 1995);
    static Livro livro2 = new Livro("Teste2", "Anais", 1996);
    static Livro livro3 = new Livro("Teste3", "Heitor", 1997);
    static Livro livro4 = new Livro("Teste4", "Heitor", 1998);
    static Livro livro5 = new Livro("Teste5", "Darwin", 1998);

    static void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    static void removerLivro(String titulo){
        ArrayList<Livro> livrosParaRemover = new ArrayList<>();
        for (Livro l: livros) {
            if(l.titulo.equals(titulo)){
                livrosParaRemover.add(l);
            }
        }
        livros.removeAll(livrosParaRemover);
    }


    public static void main(String[] args) {

        adicionarLivro(livro1);
        adicionarLivro(livro2);
        adicionarLivro(livro3);
        adicionarLivro(livro4);
        adicionarLivro(livro5);

        System.out.println(livros.size());

        removerLivro("Teste1");
        System.out.println(livros.size());

        System.out.println(livros);
    }
}
