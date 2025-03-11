package día1_clasepersona;

public class Persona {

    // Atributos de la persona
    String nombre; // Nombre de la persona
    String apellido; // Apellido de la persona
    String dni; // Documento Nacional de Identidad
    int añoNacimiento; // Año de nacimiento de la persona

    /**
     * Constructor por defecto de la clase Persona.
     */
    public Persona() {
    }

    /**
     * Constructor con parámetros para inicializar una persona con sus datos.
     *
     * @param nombre Nombre de la persona.
     * @param apellido Apellido de la persona.
     * @param dni Documento Nacional de Identidad de la persona.
     * @param añoNacimiento Año de nacimiento de la persona.
     */
    public Persona(String nombre, String apellido, String dni, int añoNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.añoNacimiento = añoNacimiento;
    }

    /**
     * Método para imprimir en consola los datos de la persona.
     */
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("DNI: " + dni);
        System.out.println("Año de nacimiento: " + añoNacimiento);
    }
}
