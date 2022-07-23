package Titulo;

import java.util.Date;

public class TituloTerciario extends Titulo{
    private String validacion;

    public TituloTerciario(int qMateriasCarrera, String fechaInicioEstudios, String fechaFinalizacionCarrera, boolean selloMinisterio, boolean selloInstituto, Persona persona, String validacion) {
        super(qMateriasCarrera, fechaInicioEstudios, fechaFinalizacionCarrera, selloMinisterio, selloInstituto, persona);
        this.validacion = validacion;
    }

    public String getValidacion() {
        return validacion;
    }

    public void setValidacion(String validacion) {
        this.validacion = validacion;
    }

    public boolean ejercerTitulo(){
        if (this.isSelloInstituto() && this.isSelloMinisterio()) {
            return true;
            }
        else {
            return false;
        }

      // Otra forma de hacer el retorno de ejercerTitulo:   return this.isSelloMinisterio() && this.isSelloInstituto();


    }

    @Override
    public String toString() {
        return "TituloTerciario{" + super.toString() + " " +
                "validacion='" + validacion + '\'' +
                '}';
    }
}
