public class Auto {
    private String color;
    private String patente;
    private int anio;
    private String modelo;
    private int km;


    public Auto(String color, String patente, int anio, String modelo, int km) {
        this.color = color;
        this.patente = patente;
        this.anio = anio;
        this.modelo = modelo;
        this.km = km;
    }

    public void encender(){
        System.out.println("Se encendio el " + modelo);
    }
    public void kilometrajeMayor(){
        if (this.km >= 100000){
            System.out.println("Este auto tiene mas de 100.000 km");
        }
    }
}
