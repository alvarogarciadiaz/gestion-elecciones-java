package elecciones;

/** Sistema que reúne las provincias y las mesas electorales. */
public class SistemaElecciones {

    private Provincia[] provincias;
    private MesaElectoral[] mesas;
    private int contadorProvincias;
    private int contadorMesas;

    public SistemaElecciones(int maxProvincias, int maxMesas) {
        this.provincias = new Provincia[maxProvincias];
        this.mesas = new MesaElectoral[maxMesas];
    }

    public void añadirProvincia(Provincia p) {
        if (contadorProvincias < provincias.length) {
            provincias[contadorProvincias] = p;
            contadorProvincias++;
        } else {
            System.out.println("No hay espacio para añadir otra provincia");
        }
    }

    public void añadirMesa(MesaElectoral m) {
        if (contadorMesas < mesas.length) {
            mesas[contadorMesas] = m;
            contadorMesas++;
        } else {
            System.out.println("No hay espacio para añadir otra mesa electoral");
        }
    }

    public void mostrarSistema() {

        System.out.println("=== SISTEMA DE ELECCIONES AL PARLAMENTO DE ANDALUCÍA ===\n");

        System.out.println("PROVINCIAS REGISTRADAS:");
        for (int i = 0; i < contadorProvincias; i++) {
            System.out.println(provincias[i].toString());
        }

        System.out.println("MESAS ELECTORALES REGISTRADAS:");
        for (int i = 0; i < contadorMesas; i++) {
            System.out.println(mesas[i].toString());
        }
    }
}
