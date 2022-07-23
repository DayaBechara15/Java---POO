package Carga;

public class Carga implements Calculable{
    private String nombre;
    private String descripcion;
    private double peso;

    public Carga(String nombre, String descripcion, double peso) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.peso = peso;
    }

    public Carga() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public double calcularPeso() {
        return 0;
    }

    @Override
    public String toSring() {
        return "Carga{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                '}';
    }

}
