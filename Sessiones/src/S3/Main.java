package S3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
    }

    private static void ejercicio1() {
        /*
         * El programa tiene que ordenar la lista y presentarla por pantalla.
         * Luego pide al usuario que introduzca un numero minimo y otro maximo. Entonces el programa elimina todos los
         * elementos de la lista que estén fuera de los límites, incluyendo estos. Y presenta los resultados por pantalla.
         * */
        List<Integer> listaNumeros = new ArrayList<Integer>();
        listaNumeros.add(51);
        listaNumeros.add(32);
        listaNumeros.add(79);
        listaNumeros.add(1);
        listaNumeros.add(47);
        listaNumeros.add(33);
        listaNumeros.add(49);
        listaNumeros.add(65);
        listaNumeros.add(107);
        listaNumeros.add(82);


    }

    private static void ejercicio2() {
        /*
          Escribe un programa en Java que permita al usuario ingresar una lista de números enteros. El programa debe
          proporcionar las siguientes funcionalidades:

          1. Agregar un número a la lista.
          2. Eliminar un número de la lista.
          3. Encontrar el número más grande y el más pequeño en la lista.
          4. Mostrar la lista en orden ascendente y descendente.

          Pista: aqui puede haber metodos q no hemos visto sobre las listas, asi que intenta buscar en internet.
          Son cosas q se encuentran con facilidad, sino usa esta pag: https://www.vogella.com/tutorials/JavaCollections/article.html
          */

        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Agregar número");
            System.out.println("2. Eliminar número");
            System.out.println("3. Mostrar número mayor y menor");
            System.out.println("4. Mostrar lista en orden ascendente");
            System.out.println("5. Mostrar lista en orden descendente");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}