package día4figurasgeométricas;

public class Triangulo {

    private int base;
    private int altura;

    public Triangulo() {
    }

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // Métodos para calcular área y perímetro
    public double calcularArea() {
        return (base * altura) / 2.0;
    }

    public double calcularHipotenusa() {
        return Math.sqrt(base * base + altura * altura);
    }

    public double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }

    // Método para determinar el tipo de triángulo
    public String tipoTriangulo() {
        double hipote = calcularHipotenusa();
        if (base == altura && altura == hipote) {
            return "Triángulo Equilátero"; // No es válido, corregir lógica
        } else if (base == altura || base == hipote || altura == hipote) {
            return "Triángulo Isósceles";
        } else {
            return "Triángulo Escaleno";
        }
    }

}
