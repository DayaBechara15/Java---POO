package Titulo;

public class Test {
    public static void main(String[] args) {
        Persona persona = new Persona("Dayanna","Bechara",111, 25);
        TituloTerciario terciario = new TituloTerciario(3,"Octubre 2021","Julio 2023",true,true,persona,"Nacional");
        System.out.println(terciario.toString());
        System.out.println(terciario.ejercerTitulo());

    }
}
