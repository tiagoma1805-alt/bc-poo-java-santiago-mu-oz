public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Juan Perez", "kennedy", "300123");
        Tecnico t1 = new Tecnico("Carlos Ruiz", 5, "Certificado A");
        ServicioFumigacion s1 = new ServicioFumigacion(c1, t1, "Cucarachas", 120.0, 200000);

        GestorServicios gestor = new GestorServicios();
        gestor.agregarServicio(s1);

        gestor.mostrarServicios();
        System.out.println("Total servicios: " + gestor.contarServicios());
    }
}