public class Dia8_Película {

    public static void main(String[] args) {
        // Crear las películas según la tabla
        Pelicula pelicula1 = new Pelicula("Gandhi", "Richard Attenborough", Genero.DRAMA, 191, 1982, 8.1);
        Pelicula pelicula2 = new Pelicula("Thor", "Kenneth Branagh", Genero.ACCIÓN, 115, 2011, 7.0);

        // Imprimir información de las películas
        pelicula1.imprimir();
        pelicula2.imprimir();

        // Comparar si son similares
        pelicula1.esSimilar(pelicula2);
    }
    
}
