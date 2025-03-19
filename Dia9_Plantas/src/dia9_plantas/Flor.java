package dia9_plantas;

public class Flor extends Planta{
    private String colorPetalos;
    private int cantPetalos;
    private String colorPistilo;
    private String estacion;

    public Flor() {
    }

    public Flor(String colorPetalos, int cantPetalos, String colorPistilo, String estacion, String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.colorPetalos = colorPetalos;
        this.cantPetalos = cantPetalos;
        this.colorPistilo = colorPistilo;
        this.estacion = estacion;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public int getCantPetalos() {
        return cantPetalos;
    }

    public void setCantPetalos(int cantPetalos) {
        this.cantPetalos = cantPetalos;
    }

    public String getColorPistilo() {
        return colorPistilo;
    }

    public void setColorPistilo(String colorPistilo) {
        this.colorPistilo = colorPistilo;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }
    
    
    
    @Override
    public void decirLoqueSoy() {
    System.out.println("Hola, soy un flor");    
    }
    
}
