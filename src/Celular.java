public class Celular {
    private String Modelo;
    private String Marca;
    private int memoria;
    private boolean radio;
    private int nroCelular;

    public Celular(){}
    public Celular(String modelo, String marca) {
        Modelo = modelo;
        Marca = marca;
    }
    public void realizarLlamada(){
        System.out.println("Llamando...");
    }
    public void cortarLlamada(){
     System.out.println("Llamada Terminada");
    }
}
