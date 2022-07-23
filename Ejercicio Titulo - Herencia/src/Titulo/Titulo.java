package Titulo;

public abstract class Titulo {
    private int qMateriasCarrera;
    private String fechaInicioEstudios;
    private String fechaFinalizacionCarrera;
    private boolean selloMinisterio;
    private boolean selloInstituto;
    private Persona persona;

    public Titulo(int qMateriasCarrera, String fechaInicioEstudios, String fechaFinalizacionCarrera, boolean selloMinisterio, boolean selloInstituto, Persona persona) {
        this.qMateriasCarrera = qMateriasCarrera;
        this.fechaInicioEstudios = fechaInicioEstudios;
        this.fechaFinalizacionCarrera = fechaFinalizacionCarrera;
        this.selloMinisterio = selloMinisterio;
        this.selloInstituto = selloInstituto;
        this.persona = persona;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getqMateriasCarrera() {
        return qMateriasCarrera;
    }

    public void setqMateriasCarrera(int qMateriasCarrera) {
        this.qMateriasCarrera = qMateriasCarrera;
    }

    public String getFechaInicioEstudios() {
        return fechaInicioEstudios;
    }

    public void setFechaInicioEstudios(String fechaInicioEstudios) {
        this.fechaInicioEstudios = fechaInicioEstudios;
    }

    public String getFechaFinalizacionCarrera() {
        return fechaFinalizacionCarrera;
    }

    public void setFechaFinalizacionCarrera(String fechaFinalizacionCarrera) {
        this.fechaFinalizacionCarrera = fechaFinalizacionCarrera;
    }

    public boolean isSelloMinisterio() {
        return selloMinisterio;
    }

    public void setSelloMinisterio(boolean selloMinisterio) {
        this.selloMinisterio = selloMinisterio;
    }

    public boolean isSelloInstituto() {
        return selloInstituto;
    }

    public void setSelloInstituto(boolean selloInstituto) {
        this.selloInstituto = selloInstituto;
    }

    public abstract boolean ejercerTitulo();


    @Override
    public String toString() {
        return "Titulo{" +
                "qMateriasCarrera=" + qMateriasCarrera +
                ", fechaInicioEstudios='" + fechaInicioEstudios + '\'' +
                ", fechaFinalizacionCarrera='" + fechaFinalizacionCarrera + '\'' +
                ", selloMinisterio=" + selloMinisterio +
                ", selloInstituto=" + selloInstituto +
                ", persona=" + persona +
                '}';
    }
}
