package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD{   
    public static Connection conectarBaseDatos(){
        String nombreBaseDatos = "cursos"; //Nombre de la base de datos
        String pass = "130406"; // Contraseña para iniciar sesion
        String servidor = "localhost"; //Servidor donde se aloja la BD
        String puerto = "3306"; // Puerto
        String user = "root"; //Usuario
        
        String autoReconnect = "true"; 
        String publicKey = "true"; 
        String useSSL = "false"; 
        Connection conn = null; 
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } 
        catch(Exception ex){
            System.out.println("Mensaje: " + ex.getMessage());
            ex.getMessage();
        }
        
        try{
            conn = DriverManager.getConnection("jdbc:mysql://"+servidor+":"+puerto+"/"+nombreBaseDatos+"?user="+user+"&password="+pass+"&autoReconnect="+autoReconnect+"&allowPublicKeyRetrieval="+publicKey+"&useSSL="+useSSL);
        } 
        catch (SQLException ex){
            System.out.println("--------> Excepción SQL: " + ex.getMessage());
            System.out.println("--------> Estado SQL: " + ex.getSQLState());
            System.out.println("--------> Error del Proveedor: " + ex.getErrorCode());
        }
        
        return conn;
    }
}