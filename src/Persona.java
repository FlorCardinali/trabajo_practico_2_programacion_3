public class Persona {
    private String nombre;
    private String apellido;
    private char sexo;
    private int edad;
    private String ciudad;


    public Persona(String nombre, String apellido, char sexo, int edad, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.ciudad = ciudad;
    }
     public void mostrarDatos (){
        System.out.println("Hola mi nombre es "
                + nombre + " "
                + apellido + " y tengo "
                + edad + " años de edad, Soy "
                + (sexo == 'M' ? "hombre" : "mujer")
                + " y soy de " + ciudad);
     }
     public void mayorDeEdad(){
        if (this.edad >= 18){
            System.out.println(this.nombre + " es mayor de edad");
        }
     }
}
