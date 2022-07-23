package Carga;

import java.util.ArrayList;

public class Contenedor extends Carga{

    private ArrayList<Simple> contenedor = new ArrayList<>();

    public Contenedor() {
        super();
    }

    public void agregarContenedor(Simple s){
        this.contenedor.add(s);
    }

    @Override
    public double calcularPeso() {
        double pesoTotal = 0;
        for (Simple s : this.contenedor){
            pesoTotal += s.calcularPeso();
        }
        return pesoTotal;
    }

    @Override
    public String toSring() {
        for (Simple c : this.contenedor){
            System.out.println(c.toSring());
        }
        return "";
    }
}
