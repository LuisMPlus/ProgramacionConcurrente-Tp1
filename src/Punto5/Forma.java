package Punto5;

public abstract class Forma {
    private String nombreForma;

    public Forma(String nombreForma) {
        this.nombreForma = nombreForma;
    }
    public String getNombreForma() {
        return nombreForma;
    }
    public void setNombreForma(String nombreForma) {
        this.nombreForma = nombreForma;
    }
    public abstract double area();
    public abstract double perimetro() ;

}



