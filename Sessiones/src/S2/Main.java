package S2;

import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ejercicio1();
        //ejercicio2();
        //ejercicio3();
    }

    private static void ejercicio1(){
        /*  Escribe un programa que lea una lista de palabras y cuente cuántas veces aparece cada palabra.
            Usa un Map para almacenar las palabras y sus correspondientes conteos.

            Pista: En el mapa el valor de la palabra será la key y las veces q esta aparece el value del mapa
        */

        System.out.println("Este es el ejercicio 1 --------------------------------");
        List<String> palabras = Arrays.asList("hola", "mundo", "hola", "java", "mundo", "hola");
        Map<String, Integer> contadorPalabras = new HashMap<>();
        for (int i = 0; i < palabras.size(); i++) {
            String nombre = palabras.get(i);
            if (contadorPalabras.containsKey(nombre)){
                contadorPalabras.put(nombre, contadorPalabras.get(nombre) + 1);
            } else {
                contadorPalabras.put(nombre, 1);
            }
        }

        System.out.println(contadorPalabras);

    }

    private static void ejercicio2() {
            /*  Escribe un programa que agrupe una lista de personas por su edad. Cada persona tendrá un nombre
                y una edad. Usa un Map para agrupar las personas por edad.
             */

        List<Persona> personas = Arrays.asList(
                new Persona("Ana", 25),
                new Persona("Juan", 30),
                new Persona("Pedro", 25),
                new Persona("Maria", 30),
                new Persona("Lucia", 40)
        );
        Map<Integer, List<Persona>> personasPorEdad = new HashMap<>();
    }

    private static void ejercicio3(){
        /*  Escribe un programa que gestione un inventario de productos y sus precios. Permite agregar, actualizar,
            eliminar y buscar productos en el inventario. Además, agrega funcionalidades para mostrar productos dentro
            de un rango de precios y calcular el valor total del inventario.
         */

        Map<String, Double> inventario = new HashMap<>();

        agregarProducto(inventario,"Manzanas", 1.2);
        agregarProducto(inventario,"Naranjas", 0.8);
        agregarProducto(inventario,"Plátanos", 1.1);

    }

    private static void agregarProducto(Map<String, Double> inventario, String item, Double precio){
        inventario.put(item, precio);
    }


}
