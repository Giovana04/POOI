public class TestaPontos2D {
    public static void main (String[] args){
        Ponto2D p1 = new Ponto2D();
        System.out.println("Coordenadas p1: " + p1.getx() + ", " + p1.gety());
        System.out.println("Contador: " + Ponto2D.getContador());

        Ponto2D p2 = new Ponto2D(20, 70);
        System.out.println("Coordenadas p1: " + p2.getx() + ", " + p2.gety());
        System.out.println("Contador: " + p2.getContador());
    }
}
