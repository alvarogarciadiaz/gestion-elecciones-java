package elecciones;

/** Candidatura de una persona por un partido, con sus votos y escaños. */
public class Candidatura extends Persona implements Votable {

    private String partido;
    private String siglas;
    private int votos;
    private int escanos;

    public Candidatura(String nombre, String dni, int edad, String partido, String siglas, int votos, int escanos) {
        super(nombre, dni, edad);
        setPartido(partido);
        setSiglas(siglas);
        setVotos(votos);
        setEscanos(escanos);
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido.toUpperCase();
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas.toUpperCase();
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        if (votos >= 0 && votos <= MAXVOTOS) {
            this.votos = votos;
        }
    }

    public int getEscanos() {
        return escanos;
    }

    public void setEscanos(int escanos) {
        if (escanos >= 0) {
            this.escanos = escanos;
        }
    }

    public void sumarVotos(int cantidad) {
        if (cantidad > 0 && (votos + cantidad) <= MAXVOTOS) {
            votos += cantidad;
        }
    }

    public String toString() {
        return "- CANDIDATURA: " + super.toString() + "\n" + "-- Partido: " + partido + "\n" + "-- Siglas: " + siglas + "\n" + "-- Votos: " + votos + "\n" + "-- Escaños: " + escanos;
    }
}
