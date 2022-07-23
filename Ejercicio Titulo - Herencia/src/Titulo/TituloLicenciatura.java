package Titulo;

import java.util.Date;

public class TituloLicenciatura extends Titulo{
    private String temaDeTesis;
    private String fechaEntregaTesis;
    private Integer qTrabajosDeInvestigacion;

    public TituloLicenciatura(int qMateriasCarrera, String fechaInicioEstudios, String fechaFinalizacionCarrera, boolean selloMinisterio, boolean selloInstituto, Persona persona, String temaDeTesis, String fechaEntregaTesis, Integer qTrabajosDeInvestigacion) {
        super(qMateriasCarrera, fechaInicioEstudios, fechaFinalizacionCarrera, selloMinisterio, selloInstituto, persona);
        this.temaDeTesis = temaDeTesis;
        this.fechaEntregaTesis = fechaEntregaTesis;
        this.qTrabajosDeInvestigacion = qTrabajosDeInvestigacion;
    }

    public String getTemaDeTesis() {
        return temaDeTesis;
    }

    public void setTemaDeTesis(String temaDeTesis) {
        this.temaDeTesis = temaDeTesis;
    }

    public String getFechaEntregaTesis() {
        return fechaEntregaTesis;
    }

    public void setFechaEntregaTesis(String fechaEntregaTesis) {
        this.fechaEntregaTesis = fechaEntregaTesis;
    }

    public Integer getqTrabajosDeInvestigacion() {
        return qTrabajosDeInvestigacion;
    }

    public void setqTrabajosDeInvestigacion(Integer qTrabajosDeInvestigacion) {
        this.qTrabajosDeInvestigacion = qTrabajosDeInvestigacion;
    }

    public boolean ejercerTitulo(){
        if (this.isSelloInstituto() && this.isSelloMinisterio()) {
            return true;
        }
        else {
            return false;
        }
    }

    public int compareTo(TituloLicenciatura t){

        if (this.qTrabajosDeInvestigacion > t.qTrabajosDeInvestigacion) {
            return 1;

        }
        if (this.qTrabajosDeInvestigacion < t.qTrabajosDeInvestigacion) {
            return -1;
    }
        TituloLicenciatura t2 = (TituloLicenciatura) t;
        return 0;
    }
    @Override
    public String toString() {
        return "TituloLicenciatura{" + super.toString() + " " +
                "temaDeTesis='" + temaDeTesis + '\'' +
                ", fechaEntregaTesis=" + fechaEntregaTesis +
                ", qTrabajosDeInvestigacion=" + qTrabajosDeInvestigacion +
                '}';
    }
}
