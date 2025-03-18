
enum Genero {
    ACCIÓN, COMEDIA, DRAMA, SUSPENSO
}

public class Pelicula {

    private String nombre;
    private String director;
    private Genero generoPelicula;
    private int duracion;
    private int anio;
    private double calificacion;

    public Pelicula(String nombre, String director, Genero generoPelicula, int duracion, int anio, double calificacion) {
        this.nombre = nombre;
        this.director = director;
        this.generoPelicula = generoPelicula;
        this.duracion = duracion;
        this.anio = anio;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Genero getGeneroPelicula() {
        return generoPelicula;
    }

    public void setGeneroPelicula(Genero generoPelicula) {
        this.generoPelicula = generoPelicula;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }


    public void imprimir() {
               System.out.println("Nombre: " + nombre);
        System.out.println("Director: " + director);
        System.out.println("Género: " + generoPelicula);
        System.out.println("Duración: " + duracion + " min");
        System.out.println("Año: " + anio);
        System.out.println("Calificación: " + calificacion);
        System.out.println("¿Es épica? " + (esPeliculaEpica() ? "Sí" : "No"));
        System.out.println("Valoración: " + calcularValoracion());
        System.out.println("----------------------");
    }

    private boolean esPeliculaEpica() {
        return duracion >= 180;
    }

    private String calcularValoracion() {
        if (calificacion >= 0 && calificacion <= 2) {
            return "Muy mala";
        } else if (calificacion > 2 && calificacion <= 5) {
            return "Mala";
        } else if (calificacion > 5 && calificacion <= 7) {
            return "Regular";
        } else if (calificacion > 7 && calificacion <= 8) {
            return "Buena";
        } else {
            return "Excelente";
        }
    }

   public boolean esSimilar(Pelicula pelicula) {
    boolean sonSimilares = this.generoPelicula == pelicula.generoPelicula &&
                           this.calcularValoracion().equals(pelicula.calcularValoracion());

    if (sonSimilares) {
        System.out.println("Las películas '" + this.nombre + "' y '" + pelicula.nombre + "' son similares.");
    } else {
        System.out.println("Las películas '" + this.nombre + "' y '" + pelicula.nombre + "' NO son similares.");
    }
    return sonSimilares;
}


    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula("Gandhi", "Richard Attenborough", Genero.DRAMA, 191, 1982, 8.1);
        Pelicula pelicula2 = new Pelicula("Thor", "Kenneth Branagh", Genero.ACCIÓN, 115, 2011, 7.0);

        pelicula1.imprimir();
        pelicula2.imprimir();

        System.out.println("¿'Gandhi' es épica? " + pelicula1.esPeliculaEpica());
        System.out.println("¿'Thor' es épica? " + pelicula2.esPeliculaEpica());

        System.out.println("Valoración de 'Gandhi': " + pelicula1.calcularValoracion());
        System.out.println("Valoración de 'Thor': " + pelicula2.calcularValoracion());

        System.out.println("¿Son similares? " + pelicula1.esSimilar(pelicula2));
    }
}
