public class Tecnico {
    private String nombre;
    private int experiencia;
    private String certificado;

    public Tecnico(String nombre, int experiencia, String certificado) {
        this.nombre = nombre;
        this.experiencia = experiencia;
        this.certificado = certificado;
    }

    public String mostrarPerfil() {
        return nombre + " (" + experiencia + " años) - Certificado: " + certificado;
    }
}