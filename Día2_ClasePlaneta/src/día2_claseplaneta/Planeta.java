package día2_claseplaneta;

enum tipoPlaneta {
    GASEOSO, TERRESTRE, ENANO
}

public class Planeta {

    private String nombre;
    private int cantidadSatelites;
    private double masa;
    private double volumen;
    private int diametro;
    private int distancia;
    private tipoPlaneta tipo;
    private boolean observable;

    public Planeta() {
    }

    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distancia, tipoPlaneta tipo, boolean observable) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distancia = distancia;
        this.tipo = tipo;
        this.observable = observable;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre del Planeta: " + nombre);
        System.out.println("Cantidad de satelites: " + cantidadSatelites);
        System.out.println("Masa: " + masa);
        System.out.println("Volumen: " + volumen);
        System.out.println("Diametro: " + diametro);
        System.out.println("Distancia: " + distancia);
        System.out.println("Tipo: " + tipo);
        System.out.println("Es observable: " + observable);

    }

    public double calcularDensidad() {
        return volumen != 0 ? masa / volumen : 0;
    }

    public boolean esPlanetaExterior() {
        int UA = 149597870;
        double distanciaKm = distancia * 1000000;
        double distanciaUA = distanciaKm / UA;

        return distanciaUA > 3.4;

    }

}
