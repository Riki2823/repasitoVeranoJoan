package S2;

import java.io.OutputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        ejercicio3();
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

        for (Persona pActual : personas) {
            if (!personasPorEdad.containsKey(pActual.getEdad())) {
                List<Persona> aux = new ArrayList<>();
                aux.add(pActual);
                personasPorEdad.put(pActual.getEdad(), aux);
            } else {
                List<Persona> aux = personasPorEdad.get(pActual.getEdad());
                aux.add(pActual);
            }
        }

        for (Map.Entry<Integer, List<Persona>> entrySet:personasPorEdad.entrySet()) {
            System.out.println("Personas por edad: " + entrySet.getKey());
            for (Persona p : entrySet.getValue()) {
                System.out.println(p.getNombre());
            }
        }

    }

    private static void ejercicio3(){
        /*  Escribe un programa que gestione un inventario de productos y sus precios. Permite agregar, actualizar,
            eliminar y buscar productos en el inventario. Además, agrega funcionalidades para mostrar productos dentro
            de un rango de precios y calcular el valor total del inventario.
         */

        Map<String, Double> inventario = new HashMap<>();

        /*
        agregarProducto(inventario);
        System.out.println(inventario);
        agregarProducto(inventario);
        System.out.println(inventario);
        actualizarProducto(inventario);
        System.out.println(inventario);
        eliminarProducto(inventario);
        System.out.println(inventario);
        buscarProducto(inventario);
        */

        Integer opcion = 0;
        while (opcion != 9) {
            System.out.println("Bienvenido!");
            System.out.println("Eliga la opcion que desees");
            System.out.println("1. Agregar un producto, 2. Actualizar un producto, 3. Eliminar un producto, 4. Buscar un producto 9. Salir");

            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Cuantos productos desea añadir?");
                    int product1 = scanner.nextInt();
                    for (int i = 0; i < product1; i++) {
                        agregarProducto(inventario);
                    }
                    break;

                case 2:
                    System.out.println("Cuantos productos desea actualizar?");
                    int product = scanner.nextInt();
                    for (int i = 0; i < product; i++) {
                        actualizarProducto(inventario);
                    }
                    break;

                case 3:
                    System.out.println("Cuantos productos desea eliminar?");
                    int product2 = scanner.nextInt();
                    for (int i = 0; i < product2; i++) {
                        eliminarProducto(inventario);
                    }
                    break;

                case 4:
                    System.out.println("Cuantos productos desea buscar?");
                    int product3 = scanner.nextInt();
                    for (int i = 0; i < product3; i++) {
                        buscarProducto(inventario);
                    }
                    break;
            }
        }

    }

    private static void agregarProducto(Map<String, Double> inventario){

        System.out.println("Item: ");
        Scanner agregarItem = new Scanner(System.in);
        String item = agregarItem.nextLine();

        double precio;

        if (inventario.containsKey(item)){
            System.out.println("Este " + item + " ya esta en el inventario");
        } else {
            System.out.println("Precio: ");
            Scanner agregarPrecio = new Scanner(System.in);
            precio = agregarPrecio.nextDouble();
            inventario.put(item, precio);
        }
    }

    private static void actualizarProducto (Map<String, Double> inventario){

        System.out.println("Introduzca el producto que desea actualizar: ");
        Scanner buscaProducto = new Scanner(System.in);
        String producto = buscaProducto.nextLine();

        if (inventario.containsKey(producto)){
            System.out.println("Introduzca el nuevo precio: ");
            Scanner precioAct = new Scanner(System.in);
            double precio = precioAct.nextDouble();
            inventario.replace(producto, precio);
        } else {
            System.out.println("El producto no esta en el inventario o ha introducido mal el nombre del producto!");
        }
    }

    private static void eliminarProducto (Map<String, Double> inventario){
        String item;
        System.out.println("Ingrese el nombre del producto que desea eliminar: ");
        Scanner eliminarItem = new Scanner(System.in);
        item = eliminarItem.nextLine();
        if (inventario.containsKey(item)){
            inventario.remove(item);
        } else {
            System.out.println("El producto que desea eliminar no existe!");
        }
    }

    private static void buscarProducto (Map<String, Double> inventario){
        String item;

        System.out.println("Introduzca el nombre del producto que desea buscar: ");
        Scanner buscarItem = new Scanner(System.in);
        item = buscarItem.nextLine();

        if (inventario.containsKey(item)){
            System.out.println("El producto esta en el inventario!" + item);
        } else {
            System.out.println("El producto introducido no esta registrado o el nombre esta mal introducido!");
        }

    }

    private static void agruparProductosPorPrecio (Map<String, Double> inventario){
        System.out.println("Pon el rango de precios: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Primer numero: ");
        double num1 = scanner.nextDouble();
        System.out.println("Segundo numero: ");
        double num2 = scanner.nextDouble();

        for (Double pActual : inventario.values()){

        }
    }

}
