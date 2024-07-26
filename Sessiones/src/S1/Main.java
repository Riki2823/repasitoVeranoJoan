package S1;

public class Main {
    public static void main(String[] args) {

        ejercicio1();
        ejercicio2();
        ejercicio3();

    }

    private static void ejercicio1() {
        /*
        Escribe un programa que muestre por consola (con un print) los
        números de 1 a 100 (ambos incluidos y con un salto de línea entre
        cada impresión), sustituyendo los siguientes:
        Múltiplos de 3 por la palabra "fizz".
        Múltiplos de 5 por la palabra "buzz".
        Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
        */
        System.out.println("Este es el ejercicio 1 --------------------------------");

        for (int numero = 1; numero < 101; numero++) {

            if (numero % 3 == 0){
                System.out.println("fizz");
            } else if (numero % 5 == 0){
                System.out.println("buzz");
            }

            if (numero % 3 == 0 && numero % 5 == 0){
                System.out.println("fizzbuzz");
            }

            System.out.println(numero + "\n");
        }

    }


    private static void ejercicio2() {
        /*
        Escribe un programa que imprima los 50 primeros números de la sucesión
        de Fibonacci empezando en 0.
        La serie Fibonacci se compone por una sucesión de números en
        la que el siguiente siempre es la suma de los dos anteriores.
        0, 1, 1, 2, 3, 5, 8, 13...
        */
        System.out.println("Este es el ejercicio 2 --------------------------------");


        int numero2 = 0;
        int numero3 = 1;
        System.out.println(numero2);
        System.out.println(numero3);
        for (int contador = 0; contador < 51; contador++) {
            Integer res = null;
            res = numero2 + numero3;
            System.out.println(res);
            numero2 = numero3;
            numero3 = res;

        }


    }

    private static void ejercicio3() {
        /*
        Escribe un programa que se encargue de comprobar si un número es o no primo.
        Hecho esto, imprime los números primos entre 1 y 100.
        */
        System.out.println("Este es el ejercicio 3 --------------------------------");
        for (int numero = 1; numero < 101; numero++) {

            boolean esPrimo = false;

            for (int i = 1; i < 101; i++) {

                if (numero == i || i == 1){
                    if (numero % i == 0 && numero % 1 == 0){
                        esPrimo = true;
                    }
                } else if (numero % i == 0){
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo){
                System.out.println(numero);
            }
        }

    }
}
