package elecciones;

/** Partido político. Se ordena por siglas y, si empatan, por nombre. */
public class Partido implements Comparable {

    private String nombre;
    private String siglas;
    private String ideologia;

    public Partido(String nombre) {
        setNombre(nombre);
    }

    public Partido(Partido p) {
        this.nombre = p.nombre;
        this.siglas = p.siglas;
        this.ideologia = p.ideologia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas.toUpperCase();
    }

    public String getIdeologia() {
        return ideologia;
    }

    public void setIdeologia(String ideologia) {
        this.ideologia = ideologia.toUpperCase();
    }

    public boolean equals(Object objeto) {
        boolean resultado = false;
        if (objeto instanceof Partido) {
            Partido p = (Partido) objeto;
            resultado = (nombre.equalsIgnoreCase(p.nombre)) && (siglas.equalsIgnoreCase(p.siglas));
        }
        return resultado;
    }

    public int compareTo(Object o) {
        Partido p = (Partido) o;
        int cmp = this.siglas.compareToIgnoreCase(p.siglas);
        if (cmp == 0) {                                       // En caso de empate en las siglas, comparamos por los nombres
            cmp = this.nombre.compareToIgnoreCase(p.nombre);  // <0 this antes, 0 iguales, >0 this despues
        }
        return cmp;
    }

    public String toString() {
        return siglas + " - " + nombre;
    }
}
