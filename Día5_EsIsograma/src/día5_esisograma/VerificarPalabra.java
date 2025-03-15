package día5_esisograma;

import java.util.ArrayList;
import java.util.List;

public class VerificarPalabra {

    private String palabra;

    public VerificarPalabra(String palabra) {
        this.palabra = palabra;
    }

    public void esIsograma() {
        ArrayList<String> ListaLetras = new ArrayList<>();
        ArrayList<Integer> repeticion = new ArrayList<>();
        boolean esIsograma = false;
        int repetidos = 0;
        char[] letras = palabra.toCharArray();
        for (char let : letras) {
            ListaLetras.add(String.valueOf(let));

        }
        int tamaño = ListaLetras.size() - 1;
        for (int i = 0; i < ListaLetras.size(); i++) {
            repetidos = 0;
            for (int j = 0; j < ListaLetras.size(); j++) {
                if (ListaLetras.get(i).equalsIgnoreCase(String.valueOf(letras[j]))) {
                    repetidos++;

                    repeticion.add(repetidos);
                }

            }
            System.out.println(letras[i]);
        }

        if (repeticion.contains(2)) {
            System.out.println("La palabra ingresada NO es un isograma.");
        } else {
            System.out.println("La palabra ingresada es un isograma.");
        }
    }

}
