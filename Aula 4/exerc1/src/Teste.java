public class Teste {
    public static void main(String[] args){
        Turma turma = new Turma();
        turma.setCurso("CC");
        turma.setDisciplina("POO-I");

        System.out.println("Curso: " + turma.getCurso() + "\nDisciplina: " + turma.getDisciplina());

        turma.imprimir();
    }
}
