package día4figurasgeométricas;

public class Cuadrado {

    private int longitud;

    public Cuadrado() {
    }

    public Cuadrado(int longitud) {
        this.longitud = longitud;
    }
    // Métodos para calcular área y perímetro

    public int calcularArea() {
        return longitud * longitud;
    }

    public int calcularPerimetro() {
        return 4 * longitud;
    }

}
