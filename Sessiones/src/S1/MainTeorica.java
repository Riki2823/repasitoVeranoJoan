package S1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainTeorica {
    public static void main(String[] args) {
        int[] numero = {1,2,4,5};

        for (int n: numero){
            System.out.println(n);
        }

        numero[1] = 7;


        for (int i = 0 ; i< numero.length; i++){
            System.out.println(numero[i]);
        }

        List<Integer> numero2 = new ArrayList<>();

        numero2.add(5);
        printarNumeros(numero2);

        numero2.add(15);
        printarNumeros(numero2);

        numero2.remove(1);
        printarNumeros(numero2);


        List<String> strings = new ArrayList<>();

        strings.add("Poll");

        List<Perona> personas = new ArrayList<>();

        Perona joan = new Perona(21, "Joan");
        Perona ricardo = new Perona(21, "Ricardo");

        personas.add(ricardo);
        personas.add(joan);
        printarPersonas(personas);

        Perona waldo = crearPersona(21, "Waldo");
        personas.add(waldo);

        printarPersonas(personas);

        personas.remove(ricardo);
        printarPersonas(personas);

        Map<String, Perona> mapaPersonas = new HashMap<>();

        mapaPersonas.put("Pollica", ricardo);
        mapaPersonas.put("Vicioso", joan);
        mapaPersonas.put("Coquero", waldo);

        Perona resultado = buscarPersona("Vicioso", mapaPersonas);
        printarPersona(resultado);

        mapaPersonas.remove("Pollica");

        Perona resultado2 = buscarPersona("Pollica", mapaPersonas);
        printarPersona(resultado2);

    }

    private static void printarPersona(Perona resultado) {
        System.out.println("---------------");
        System.out.println("Nombre: " + resultado.nombre + " Edad: " + resultado.edad);
    }

    private static Perona buscarPersona(String key, Map<String, Perona> mapa) {
        Perona ret = null;
        for (Map.Entry<String, Perona> p: mapa.entrySet()){
            if (p.getKey().equals(key)){
                ret = p.getValue();
            }
        }
        return ret;
    }

    public static Perona crearPersona(int edad, String nombre){
        return new Perona(edad, nombre);
    }

    private static void printarPersonas(List<Perona> personas) {
        System.out.println("---------------");
        for (Perona persona: personas){
            System.out.println("Nombre: " + persona.nombre + " Edad: " + persona.edad);
        }
    }

    public static void printarNumeros(List<Integer> input){
        System.out.println("---------------");
        for (int numero : input){
            System.out.println(numero);
        }
    }
}
