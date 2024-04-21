public class Livro {
    private String titulo, autor;

    public void setLivro(String titulo1, String autor1){
        titulo = titulo1;
        autor = autor1;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }

    public void imprimir(){
        System.out.println("Titulo: " + titulo + "\nAutor: " + autor);
    }
}
