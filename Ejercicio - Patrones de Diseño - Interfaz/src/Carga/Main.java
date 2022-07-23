package Carga;

public class Main {
    public static void main(String[] args) throws Exception {
        Barco barco = Barco.getInstance();

        System.out.println("---------- Prueba Carga simple ----------");

        Calculable c1 = barco.agregarCarga("Simple");
        System.out.println("El peso de la carga simple es : " + c1.calcularPeso());
        System.out.println(c1.toSring());

        System.out.println("---------- Prueba Contenedor ----------");

        Calculable c2 = barco.agregarCarga("Contenedor");
        System.out.println("El peso del contenedor es : " + c2.calcularPeso());
        System.out.println(c2.toSring());

    }
}
