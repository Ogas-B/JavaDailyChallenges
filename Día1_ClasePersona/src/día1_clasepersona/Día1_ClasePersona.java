package día1_clasepersona;

public class Día1_ClasePersona {

    public static void main(String[] args) {

        // Creación de objetos Persona con diferentes valores
        Persona perso1 = new Persona("Juan", "Pérez", "12345678", 1990);
        Persona perso2 = new Persona("María", "Gómez", "87654321", 1985);

        // Impresión de los datos de cada persona
        perso1.imprimir();
        perso2.imprimir();

    }

}
