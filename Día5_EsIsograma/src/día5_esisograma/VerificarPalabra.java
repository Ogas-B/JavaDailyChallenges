package día5_esisograma;

import java.util.ArrayList;
import java.util.List;

public class VerificarPalabra {
    private String palabra;

    public VerificarPalabra(String palabra) {
        this.palabra = palabra;
    }
    
    public void esIsograma(){
        ArrayList<Character> ListaLetras = new ArrayList<>();
        ArrayList<Integer> repeticiones  = new ArrayList<>();
        boolean esIsograma = false;
        char [] letras = palabra.toCharArray();
        boolean[] seen = new boolean[256]; // Array para todos los caracteres ASCII
        for (char let : letras){
            ListaLetras.add(let);
        }
       for (int i = 0 ; i <ListaLetras.size() ; i++ ){
       if(ListaLetras.contains(letras[i]) ){
           System.out.println(letras[i]);
       }
       }
            
        if (esIsograma){System.out.println("La palabra ingresada es un isograma." );}
            System.out.println(palabra);
        }

        
    
    
}
