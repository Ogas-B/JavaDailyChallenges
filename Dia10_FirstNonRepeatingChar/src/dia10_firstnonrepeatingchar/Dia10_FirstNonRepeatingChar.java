package dia10_firstnonrepeatingchar;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dia10_FirstNonRepeatingChar {
    public static void main(String[] args) {
        Map<Character, Integer> caracteres = new HashMap<>();

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese una palabra o frase: ");
        String palabra = teclado.next();  // Si deseas permitir frases, usa nextLine()
        
        char[] letras = palabra.toCharArray();

        // Contar las apariciones de cada letra
        for (char letra : letras) {
            caracteres.put(letra, caracteres.getOrDefault(letra, 0) + 1);
        }

        // Buscar el primer carácter no repetido
        for (char letra : letras) {
            if (caracteres.get(letra) == 1) {
                System.out.println("Primer carácter no repetido: " + letra);
                teclado.close(); // Cerramos Scanner
                return; // Salimos del programa al encontrar el primero
            }
        }

        System.out.println("No hay caracteres no repetidos.");
        teclado.close();
    }
}
