public class Teste {
    public static void main(String[ ] args){
        Universidade uni1 = new Universidade();
        Aluno a1 = new Aluno();

        uni1.nome = "Unicentro";
        uni1.estado = "Parana";
        uni1.cidade = "Guarapuava";

        a1.nome = "Giovana";
        a1.curso = "Ciência da Computação";

        uni1.Exibir_dados();
        a1.Exibir_aluno();
    }
}
