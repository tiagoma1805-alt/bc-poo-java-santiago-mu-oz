package src.co.edu.sena.santiago.sema01;

// Ejemplo adaptado a una empresa de Fumigación y Control de Plagas
public class Principal {
    // 🔹 Atributos (mínimo 5)
    private String codigoServicio;
    private String tipoServicio;         // Tipo de fumigación (Ej: Cucarachas, Ratas, Termitas, etc.)
    private String tecnicoAsignado;      // Empleado encargado del servicio
    private double areaMetrosCuadrados;  // Área tratada
    private boolean completado;          // Si el servicio ya fue completado

    // 🔹 Constructor
    public Principal(String codigo, String tipo, String tecnico, double area) {
        this.codigoServicio = codigo;
        this.tipoServicio = tipo;
        this.tecnicoAsignado = tecnico;
        this.areaMetrosCuadrados = area;
        this.completado = false; // Por defecto, el servicio inicia pendiente
    }

    // 🔹 Método void (imprime información del servicio)
    public void mostrarInformacion() {
        System.out.println("=== SERVICIO DE FUMIGACIÓN ===");
        System.out.println("Código: " + codigoServicio);
        System.out.println("Tipo de servicio: " + tipoServicio);
        System.out.println("Técnico asignado: " + tecnicoAsignado);
        System.out.println("Área tratada: " + areaMetrosCuadrados + " m²");
        System.out.println("Estado: " + (completado ? "COMPLETADO" : "EN PROCESO"));
    }

    // 🔹 Método que retorna valor calculado
    public double calcularCostoTotal() {
        double precioPorMetro = 12_000; // Precio base por metro cuadrado
        double subtotal = areaMetrosCuadrados * precioPorMetro;
        double iva = subtotal * 0.19;
        return subtotal + iva; // Retorna total con IVA incluido
    }

    // 🔹 Getters
    public String getCodigoServicio() {
        return codigoServicio;
    }

    public boolean isCompletado(){
        return false;
    }

    public void getClass(boolean b) {

    }
}
