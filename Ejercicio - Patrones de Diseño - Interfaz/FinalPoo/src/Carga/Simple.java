package Carga;

public class Simple extends Carga {
    private boolean refrigeracion;

    public Simple(String nombre, String descripcion, double peso, boolean refrigeracion) {
        super(nombre, descripcion, peso);
        this.refrigeracion = refrigeracion;
    }

    @Override
    public double calcularPeso() {
        if (refrigeracion){
            return getPeso() * 1.1;
        }else {
            return getPeso();
        }
    }

    @Override
    public String toSring() {
        return "Carga{" +
                "nombre='" + getNombre() + '\'' +
                ", peso=" + calcularPeso() +
                '}';
    }
}
