package Clases;

public class Comprador extends Persona{
    
    // -> Constructor
    public Comprador(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }
    
    public void pagar(){
        System.out.println(this.nombre+" esta pagando.");
    }

    @Override
    public void trabajar() {
        System.out.println(this.nombre+" esta trabajando");
    }
}