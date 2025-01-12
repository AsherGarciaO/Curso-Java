package main;

//Importar Clases
import Clases.Persona;
import Clases.Trabajador;
import Clases.Comprador;

public class main {
    public static void main(String[] args){
        //Estructura para crear variables -> Objetos        
        //NombreClase nombreVariable = new NombreClase(parametros);
        
        Persona octavio = new Persona("Octavio", "Olea", 27);
        
        Trabajador asher = new Trabajador("Asher", "García", 18, "Atex IT Solutions");
        //System.out.println(asher.getNombre());
        //asher.setNombre("Akin");
        //asher.presentarse();
        asher.trabajar();
        //System.out.println(asher.getNombre());
        //System.out.println(asher.getEdad());
        
        Comprador victor = new Comprador("Victor", "Hernández", 25);
        victor.trabajar();
        //victor.setNombre("Alejandro");
        //victor.presentarse();
        
        
    }
}