package src.co.edu.sena.santiago.sema01;

public class Cliente {
    // Atributos
    private String codigo;
    private String nombre;
    private String email;
    private int serviciosSolicitados;

    // Constructor
    public Cliente(String codigo, String nombre, String email) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.email = email;
        this.serviciosSolicitados = 0;
    }

    // Método para mostrar información del cliente
    public void mostrarDatos() {
        System.out.println("=== CLIENTE ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Email: " + email);
        System.out.println("Servicios solicitados: " + serviciosSolicitados);
    }

    // Método para registrar una solicitud de servicio
    public void solicitarServicio() {
        serviciosSolicitados++;
    }

    // Método que verifica si el cliente es frecuente
    public boolean esClienteFrecuente() {
        return serviciosSolicitados >= 2;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }
}
