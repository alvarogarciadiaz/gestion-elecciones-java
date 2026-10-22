package elecciones;

/** Provincia con un número de escaños y un máximo de candidaturas registradas. */
public class Provincia {

    private String nombre;
    private int numEscanos;
    private Candidatura[] candidaturas;
    private int contadorCandidaturas;

    // Constructor importante porque aqui no controlamos las condiciones en los setters
    public Provincia(String nombre, int numEscanos, int maxCandidaturas) {
        this.nombre = nombre.toUpperCase();
        this.numEscanos = numEscanos;
        this.candidaturas = new Candidatura[maxCandidaturas]; // Vector con el tamaño máximo que nos dicen
        this.contadorCandidaturas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumEscanos() {
        return numEscanos;
    }

    public void añadirCandidatura(Candidatura c) {
        if (contadorCandidaturas < candidaturas.length) {
            candidaturas[contadorCandidaturas] = c;
            contadorCandidaturas++;
        } else {
            System.out.println("No hay suficiente espacio para añadir la candidatura");
        }
    }

    public String toString() {
        String cadena = "";
        cadena += "- PROVINCIA: " + nombre + " <" + numEscanos + " escaños>\n";
        if (contadorCandidaturas == 0) {
            cadena += "<Aún no hay candidaturas registradas en esta provincia>\n";
        } else {
            for (int i = 0; i < contadorCandidaturas; i++) {

                Candidatura candidatura = candidaturas[i];

                cadena += "-> CANDIDATURA: " + candidatura.getNombre() + " (" + candidatura.getDni() + ") - " + candidatura.getEdad() + " años\n ---> Partido: " + candidatura.getPartido() + "\n ---> Votos: " + candidatura.getVotos() + "\n";
            }
        }
        return cadena;
    }
}
