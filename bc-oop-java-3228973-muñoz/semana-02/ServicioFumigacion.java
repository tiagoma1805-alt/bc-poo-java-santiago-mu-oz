public class ServicioFumigacion {
    private Cliente cliente;
    private Tecnico tecnico;
    private String tipoPlaga;
    private double area;
    private double precio;

    public ServicioFumigacion(Cliente cliente, Tecnico tecnico, String tipoPlaga, double area, double precio) {
        this.cliente = cliente;
        this.tecnico = tecnico;
        this.tipoPlaga = tipoPlaga;
        this.area = area;
        this.precio = precio;
    }

    public String obtenerResumen() {
        return cliente.obtenerInfo() + " | " + tecnico.mostrarPerfil() + " | Plaga: " + tipoPlaga + " | Área: " + area;
    }
}