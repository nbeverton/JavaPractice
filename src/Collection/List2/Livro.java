package Collection.List2;

public class Livro {

    String titulo;
    String autor;
    int anoPublicacao;

    Livro(){
    }

    Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return  titulo + " " + " " + autor + " " + anoPublicacao;
    }
}
