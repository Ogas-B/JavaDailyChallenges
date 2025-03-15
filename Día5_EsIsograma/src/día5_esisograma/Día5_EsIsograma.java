package día5_esisograma;

import java.text.Normalizer;
import java.util.Scanner;

public class Día5_EsIsograma {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String ingresoPalabra = teclado.nextLine();
        ingresoPalabra = ingresoPalabra.replaceAll("[^a-z]", "");
        VerificarPalabra palabra = new VerificarPalabra(ingresoPalabra);

        palabra.esIsograma();
    }

}
