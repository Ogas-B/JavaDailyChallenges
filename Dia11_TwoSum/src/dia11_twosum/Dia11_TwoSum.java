package dia11_twosum;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Dia11_TwoSum {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1️⃣ Leer la cantidad de elementos y los valores del array
        System.out.print("Ingrese la cantidad de números: ");
        int n = teclado.nextInt();
        int[] nums = new int[n];

        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            nums[i] = teclado.nextInt();
        }

        // 2️⃣ Leer el número objetivo
        System.out.print("Ingrese el número objetivo: ");
        int objetivo = teclado.nextInt();

        // 3️⃣ Resolver el problema usando un HashMap
        Map<Integer, Integer> mapa = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complemento = objetivo - nums[i];

            if (mapa.containsKey(complemento)) {
                System.out.println("Índices encontrados: [" + mapa.get(complemento) + ", " + i + "]");
                teclado.close();
                return;  // Terminamos al encontrar el primer par
            }

            mapa.put(nums[i], i); // Guardamos el número con su índice
        }

        // 4️⃣ Si no encontramos solución
        System.out.println("No hay pares que sumen el objetivo.");
        teclado.close();
    }
    
}
