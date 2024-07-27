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

        List<Persona> personas = new ArrayList<>();

        Persona joan = new Persona(21, "Joan");
        Persona ricardo = new Persona(21, "Ricardo");

        personas.add(ricardo);
        personas.add(joan);
        printarPersonas(personas);

        Persona waldo = crearPersona(21, "Waldo");
        personas.add(waldo);

        printarPersonas(personas);

        personas.remove(ricardo);
        printarPersonas(personas);

        Map<String, Persona> mapaPersonas = new HashMap<>();

        mapaPersonas.put("Pollica", ricardo);
        mapaPersonas.put("Vicioso", joan);
        mapaPersonas.put("Coquero", waldo);

        Persona resultado = buscarPersona("Vicioso", mapaPersonas);
        printarPersona(resultado);

        mapaPersonas.remove("Pollica");

        Persona resultado2 = buscarPersona("Pollica", mapaPersonas);
        printarPersona(resultado2);

    }

    private static void printarPersona(Persona resultado) {
        System.out.println("---------------");
        System.out.println("Nombre: " + resultado.nombre + " Edad: " + resultado.edad);
    }

    private static Persona buscarPersona(String key, Map<String, Persona> mapa) {
        Persona ret = null;
        for (Map.Entry<String, Persona> p: mapa.entrySet()){
            if (p.getKey().equals(key)){
                ret = p.getValue();
            }
        }
        return ret;
    }

    public static Persona crearPersona(int edad, String nombre){
        return new Persona(edad, nombre);
    }

    private static void printarPersonas(List<Persona> personas) {
        System.out.println("---------------");
        for (Persona persona: personas){
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
