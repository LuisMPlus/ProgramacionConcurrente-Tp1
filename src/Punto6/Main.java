package Punto6;

import Punto5.Circulo;

public class Main {
    public static void main(String[] args) {
        Cuadrilatero rectangulo = new Cuadrilatero("cuadrilatero 1", 2.4, 3);
        Cuadrilatero cuadrado= new Cuadrilatero("cuadrilatero 1", 2.4, 2.4);

        System.out.println(rectangulo.toString());
        System.out.println("Perimetro del cuadrilatero: " + rectangulo.perimetro());
        System.out.println("Area del cuadrilatero: " + rectangulo.area());

        System.out.println();
        System.out.println(cuadrado.toString());
        System.out.println("Perimetro del cuadrilatero: " + cuadrado.perimetro());
        System.out.println("Area del cuadrilatero: " + cuadrado.area());
    }
}
