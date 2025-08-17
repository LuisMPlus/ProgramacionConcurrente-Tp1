package Punto6;

public class Cuadrilatero implements Forma {
    private String nombreForma;
    private double base;
    private double altura;

    public Cuadrilatero(String nombreForma, double base, double altura) {
        this.nombreForma = nombreForma;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        double area = this.base * this.altura;
        return area;
    }
    @Override
    public double perimetro() {
        double perimetro = 2 * (this.base + this.altura);
        return perimetro;
    }

    @Override
    public String toString() {
        return "Cuadrilatero{" +
                "nombreForma='" + nombreForma + '\'' +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }
}