package src.co.edu.sena.santiago.sema01;

class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE FUMIGACIÓN ===\n");

        // Crear clientes
        Cliente cliente1 = new Cliente("C001", "Restaurante El Sabor", "contacto@elsabor.com");
        Cliente cliente2 = new Cliente("C002", "Conjunto Los Cedros", "admin@loscedros.com");

        // Crear servicios
        Principal servicio1 = new Principal("SF001", "Control de cucarachas", "Juan Pérez", 3);
        Principal servicio2 = new Principal("SF002", "Eliminación de roedores", "Carlos López", 4);

        // Mostrar clientes
        System.out.println("--- CLIENTES ---");
        cliente1.mostrarDatos();
        System.out.println();
        cliente2.mostrarDatos();

        // Mostrar servicios
        System.out.println("\n--- SERVICIOS ---");
        servicio1.mostrarInformacion();
        System.out.println("\nCosto total: $" + servicio1.calcularCostoTotal());

        System.out.println();
        servicio2.mostrarInformacion();
        servicio2.getClass(false);
        System.out.println("\n--- Después de completar el servicio ---");
        servicio2.mostrarInformacion();

        // Registrar solicitudes de servicio
        cliente1.solicitarServicio();
        cliente1.solicitarServicio(); // 2 servicios → cliente frecuente
        cliente2.solicitarServicio(); // 1 servicio

        System.out.println("\n--- ESTADO DE CLIENTES ---");
        System.out.println(cliente1.getNombre() + " es cliente frecuente: " +
                (cliente1.esClienteFrecuente() ? "Sí" : "No"));
        System.out.println(cliente2.getNombre() + " es cliente frecuente: " +
                (cliente2.esClienteFrecuente() ? "Sí" : "No"));
    }
}
