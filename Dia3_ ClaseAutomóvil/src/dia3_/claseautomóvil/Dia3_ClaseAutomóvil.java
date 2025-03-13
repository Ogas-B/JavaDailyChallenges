package dia3_.claseautomóvil;

public class Dia3_ClaseAutomóvil {

    public static void main(String[] args) {
        // Crear un objeto Automovil
        Automovil auto = new Automovil("Toyota", 2022, 2.0, 4, 5, 180, 100, TipoCombustible.GASOLINA, TipoAutomovil.SUV, Colores.AZUL);

        // Realizar operaciones con el automóvil
        System.out.println("\nEstado inicial del automóvil:");
        System.out.println(auto.toString());

        auto.acelerar(20);  // Aumentar velocidad
        auto.desacelerar(50);  // Disminuir velocidad
        //auto.frenar();  // Frenar completamente

        // Intentar calcular el tiempo de llegada con el auto frenado
        double distancia = 200;
        double tiempo = auto.tiempoEstimado(distancia);
        if (tiempo != -1) {
            System.out.println("Tiempo estimado de llegada: " + tiempo + " horas.");
        }

        // Mostrar los atributos del automóvil después de las modificaciones
        System.out.println("\nEstado final del automóvil:");
        System.out.println(auto.toString());
    }

}
