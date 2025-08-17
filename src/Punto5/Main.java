package Punto5;

public class Main {
    public static void main(String[] args) {
        Circulo c1 = new Circulo("circulo", 2.4);

        c1.toString();
        System.out.println("Perimetro del circulo: " + c1.perimetro());
        System.out.println("Area del circulo: " + c1.area());

    }
}
