package Carga;

public class Barco {
    private static Barco instancia;
    public static Barco getInstance(){
        if(instancia == null){
            instancia = new Barco();
        }
        return instancia;
    }

    public Calculable agregarCarga(String carga) throws Exception{
        if(carga.equalsIgnoreCase("Simple")){
            Simple s0 = new Simple("TV 32' LCD", "tecnologia", 3, false);
            return s0;
        }else if(carga.equalsIgnoreCase("Contenedor")){
            Simple s0 = new Simple("TV 32' LCD", "tecnologia", 3, false);
            Simple s1 = new Simple("Medicametos", "Medicina", 2, true);
            Contenedor contenedor = new Contenedor();

            contenedor.agregarContenedor(s0);
            contenedor.agregarContenedor(s1);

            return contenedor;
        } else throw new Exception("Ingrese un dato valido");

    }

}
