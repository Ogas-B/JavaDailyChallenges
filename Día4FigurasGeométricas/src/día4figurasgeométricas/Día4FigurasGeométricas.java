package día4figurasgeométricas;

public class Día4FigurasGeométricas {

    public static void main(String[] args) {
        // Crear un círculo
        Circulo circulo = new Circulo(5);
        System.out.println("Círculo -> Área: " + circulo.calcularArea() + ", Perímetro: " + circulo.calcularPerimetro());

        // Crear un rectángulo
        Rectangulo rectangulo = new Rectangulo(4, 6);
        System.out.println("Rectángulo -> Área: " + rectangulo.calcularArea() + ", Perímetro: " + rectangulo.calcularPerimetro());

        // Crear un cuadrado
        Cuadrado cuadrado = new Cuadrado(4);
        System.out.println("Cuadrado -> Área: " + cuadrado.calcularArea() + ", Perímetro: " + cuadrado.calcularPerimetro());

        // Crear un triángulo rectángulo
        Triangulo triangulo = new Triangulo(3, 4);
        System.out.println("Triángulo Rectángulo -> Área: " + triangulo.calcularArea() + ", Perímetro: " + triangulo.calcularPerimetro());
        System.out.println("Hipotenusa: " + triangulo.calcularHipotenusa());
        System.out.println("Tipo de Triángulo: " + triangulo.tipoTriangulo());
    }

}
