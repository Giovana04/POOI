public class Teste {
    public static void main(String[] args){
        Livro livro = new Livro();
        livro.setLivro("cv", "gui");

        System.out.println("Livro: " + livro.getTitulo() + " - " + livro.getAutor());
        livro.imprimir();
    }
}
