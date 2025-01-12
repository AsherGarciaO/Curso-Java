package Clases;

public class Trabajador extends Persona{
    private String empresa = "";
    
    public Trabajador(String nombre, String apellido, int edad, String empresa){
        super(nombre, apellido, edad);
        this.empresa = empresa;
    }
    
    public void cobrar(){
        System.out.println(this.nombre+" esta cobrando.");
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    @Override
    public void trabajar(){
        System.out.println(this.nombre+" esta trabajando en "+this.empresa);
    }
}