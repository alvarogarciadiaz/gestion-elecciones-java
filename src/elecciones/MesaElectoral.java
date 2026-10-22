package elecciones;

/** Mesa electoral de un municipio, con su censo y la participación registrada. */
public class MesaElectoral {

    private String codigo;
    private String municipio;
    private int censo;
    private int participacion;

    public MesaElectoral(String codigo, String municipio, int censo, int participacion) {
        setCodigo(codigo);
        setMunicipio(municipio);
        setCenso(censo);
        setParticipacion(participacion);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo.toUpperCase();
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio.toUpperCase();
    }

    public int getCenso() {
        return censo;
    }

    public void setCenso(int censo) {
        if (censo > 0) {
            this.censo = censo;
        }
    }

    public int getParticipacion() {
        return participacion;
    }

    public void setParticipacion(int participacion) {
        if (participacion >= 0 && participacion <= censo) {
            this.participacion = participacion;
        }
    }

    public String toString() {
        return "MESA: " + codigo + " <" + municipio + "> Censo: " + censo + ", Participación: " + participacion;
    }
}
