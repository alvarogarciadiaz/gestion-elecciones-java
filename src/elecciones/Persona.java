package elecciones;

/** Persona genérica con nombre, DNI y edad. */
public abstract class Persona {

    private String nombre;
    private String dni;
    private int edad;

    public Persona(String nombre, String dni, int edad) {
        this.nombre = nombre;
        setDni(dni);
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni.toUpperCase();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }

    public String toString() {
        String cadena = "";
        cadena += nombre + " (" + dni + ") - " + edad + " años";
        return cadena;
    }
}
