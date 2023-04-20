public class Main {
    public static void main(String[] args) {
        Persona alguien = new Persona("Pedrito","Perez",'M',24,"Azul");
        Auto tutu = new Auto("verde", "aaa111", 2014, "falcon",5000000);
        alguien.mostrarDatos();
        alguien.mayorDeEdad();
        Celular celu = new Celular("g7","motorola");
        celu.realizarLlamada();
        celu.cortarLlamada();
    }
}