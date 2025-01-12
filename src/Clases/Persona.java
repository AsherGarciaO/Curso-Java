package Clases;

public class Persona {
    //POO (Programación Orientada a Objetos)
    //Modificadores de acceso
    //public: acceso sin limitaciones a cierta variable o funcion o clase
    //protected: solo clases heredades pueden acceder a dichas opciones
    //private: no habra ningun acceso aparte del de la misma clase
    
    // -> Propiedades/Atributos (Variables)
    protected String nombre = "", apellido = "";
    protected int edad = 0;
    
    // -> Constructor
    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    // -> Funciones/Métodos (Funciones)
    public void presentarse(){
        System.out.println("Hola, me llamo "+this.nombre+" "+this.apellido+" y tengo "+this.edad+" años.");
    }
    
    // -> Metodo Abstracto (No tiene contenido, sin embargo esta declarada y existe)
    // -> public abstract void trabajar();
    
    protected void trabajar(){}
    
    // -> Setters(set => establecer) & Getters(get => obtener)
    //Setters:
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    //Getters:
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public int getEdad(){
        return this.edad;
    }
}