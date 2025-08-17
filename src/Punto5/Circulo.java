package Punto5;

public class Circulo extends Forma {
    private double radio;
    public Circulo(String nombreForma, double radio) {
        super(nombreForma);
        this.radio=radio;
    }


    public Circulo(String nombreForma) {
        super(nombreForma);
    }

    @Override
    public double area() {

        return Math.PI * radio * radio;
    }
    @Override
    public double perimetro() {

        return 2 * Math.PI * radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}