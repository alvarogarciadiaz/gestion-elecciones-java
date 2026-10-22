package elecciones;

/** Contrato de todo lo que puede recibir votos. */
public interface Votable {

    public static final int MAXVOTOS = 5000000;

    public String getNombre();
    public int getVotos();
}
