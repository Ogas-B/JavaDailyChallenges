package dia3_.claseautomóvil;

// Enumeradores para definir tipos específicos
enum TipoCombustible {
    GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL
}

enum TipoAutomovil {
    CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV
}

enum Colores {
    BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA
}

public class Automovil {

    // Atributos del automóvil
    private String marca;
    private int modelo;
    private double motor;
    private int numeroPuertas;
    private int cantidadAsientos;
    private double velocidadMaxima;
    private double velocidadActual;
    private TipoCombustible tCombustible;
    private TipoAutomovil tAutomovil;
    private Colores color;

    // Constructor con parámetros
    public Automovil(String marca, int modelo, double motor, int numeroPuertas, int cantidadAsientos, double velocidadMaxima, double velocidadActual, TipoCombustible tCombustible, TipoAutomovil tAutomovil, Colores color) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = velocidadActual;
        this.tCombustible = tCombustible;
        this.tAutomovil = tAutomovil;
        this.color = color;
    }

    // Método para acelerar el automóvil
    public void acelerar(int incremento) {
        if (velocidadActual + incremento <= velocidadMaxima) {
            velocidadActual += incremento;
            System.out.println("El automóvil ha acelerado. Velocidad actual: " + velocidadActual + " km/h");
        } else {
            velocidadActual = velocidadMaxima;
            System.out.println("No se puede exceder la velocidad máxima de " + velocidadMaxima + " km/h.");
        }
    }

    // Método para desacelerar el automóvil
    public void desacelerar(int decremento) {
        if (velocidadActual - decremento > 0) {
            velocidadActual -= decremento;
            System.out.println("El automóvil ha desacelerado. Velocidad actual: " + velocidadActual + " km/h");
        } else {
            velocidadActual = 0;
            System.out.println("El automóvil se ha detenido.");
        }
    }

    // Método para frenar completamente el automóvil
    public void frenar() {
        velocidadActual = 0;
        System.out.println("El automóvil se ha frenado por completo.");
    }

    // Método para calcular el tiempo estimado de llegada
    public double tiempoEstimado(double distancia) {
        if (velocidadActual == 0) {
            System.out.println("El automóvil está detenido. No se puede calcular el tiempo de llegada.");
            return -1;
        }
        return distancia / velocidadActual;
    }

    // Método toString para mostrar la información del automóvil
    @Override
    public String toString() {
        return "Automovil {"
                + "Marca='" + marca + '\''
                + ", Modelo=" + modelo
                + ", Motor=" + motor + "L"
                + ", Número de puertas=" + numeroPuertas
                + ", Cantidad de asientos=" + cantidadAsientos
                + ", Velocidad máxima=" + velocidadMaxima + " km/h"
                + ", Velocidad actual=" + velocidadActual + " km/h"
                + ", Tipo de combustible=" + tCombustible
                + ", Tipo de automóvil=" + tAutomovil
                + ", Color=" + color
                + '}';
    }

    // Métodos Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
}
