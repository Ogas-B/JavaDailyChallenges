
package día2_claseplaneta;

public class Día2_ClasePlaneta {

    public static void main(String[] args) {
        Planeta jupiter = new Planeta("Júpiter", 79, 1.898E27, 1.431E15, 139820, 778, tipoPlaneta.GASEOSO, true);
        Planeta marte = new Planeta("Marte", 2, 6.39E23, 1.6318E11, 6779, 228, tipoPlaneta.TERRESTRE, true);

    jupiter.mostrarInformacion();
    marte.mostrarInformacion();
    
    System.out.println("------------------------------------------------------------------");
    System.out.printf("Densidad de Júpiter: %.2f kg/km³\n", jupiter.calcularDensidad() );
    System.out.printf("Densidad de Marte: %.2f kg/km³\n" , marte.calcularDensidad() );
    
    System.out.println("------------------------------------------------------------------");
    System.out.println("¿Júpiter es un planeta exterior? " + jupiter.esPlanetaExterior());
    System.out.println("¿Marte es un planeta exterior? " + marte.esPlanetaExterior());
    
    }
    
}
