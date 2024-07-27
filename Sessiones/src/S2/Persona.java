package S2;

public class Persona {
    int edad;
    String nombre;

    public Persona(String nombre, int edad){
        this.edad = edad;
        this.nombre = nombre;
    }

    private void cambiarNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void sumarEdad(int numero){
        this.edad += numero;
    }
}
