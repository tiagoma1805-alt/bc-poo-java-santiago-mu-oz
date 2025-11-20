import java.util.ArrayList;

public class GestorServicios {
    private ArrayList<ServicioFumigacion> servicios;

    public GestorServicios() {
        servicios = new ArrayList<>();
    }
    public void agregarServicio(ServicioFumigacion s) { servicios.add(s); }
    public void mostrarServicios() {
        for (ServicioFumigacion s : servicios) {
            System.out.println(s.obtenerResumen());
        }
    }
    public int contarServicios() { return servicios.size(); }
}