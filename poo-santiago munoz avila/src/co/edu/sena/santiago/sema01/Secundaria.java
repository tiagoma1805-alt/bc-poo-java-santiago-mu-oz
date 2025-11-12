package src.co.edu.sena.santiago.sema01;

// Clase secundaria para Sistema de Fumigación (empresa de control de plagas)
public class Secundaria {
    // Atributos (4 mínimo)
    private String codigo;
    private String nombre;
    private String email;
    private int serviciosSolicitados;

    // Constructor
    public Secundaria(String codigo, String nombre, String email) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.email = email;
        this.serviciosSolicitados = 0;
    }

    // Métodos (3 mínimo)
    public void mostrarDatos() {
        System.out.println("=== CLIENTE ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Email: " + email);
        System.out.println("Servicios solicitados: " + serviciosSolicitados);
    }

    // Método que simula la contratación de un servicio
    public void solicitarServicio() {
        serviciosSolicitados++;
    }

    // Método que indica si el cliente es frecuente
    public boolean esClienteFrecuente() {
        boolean serv = false;
        return serv;
    }
}
