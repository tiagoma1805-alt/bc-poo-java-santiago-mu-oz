public class TecnicoEspecialista extends Tecnico {
    private String especialidad;

    public TecnicoEspecialista(String nombre, int experiencia, String certificado, String especialidad) {
        super(nombre, experiencia, certificado);
        this.especialidad = especialidad;
    }
}