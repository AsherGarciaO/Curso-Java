package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Clases.ConexionBD;

public class MySQLBD {
    //Instalar MySQL con Workbench
    //https://www.youtube.com/watch?v=_K2nOYwOq1E&pp=ygUOaW5zdGFsYXIgbXlzcWw%3D
    
    public static void main(String[] args){
        String comando = "";
        Connection conexion = ConexionBD.conectarBaseDatos();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            /*
            CRUD (Create, Read, Update, Delete)
            Crear, Leer, Actualizar, Borrar
            
            Ingresar un registro
            comando = "INSERT INTO alumnos VALUES(?, ?, ?);";
            ps = conexion.prepareStatement(comando);
            ps.setInt(1, 5);
            ps.setString(2, "María");
            ps.setString(3, "PHP");
            ps.execute();
            
            Eliminar un registro
            comando = "DELETE FROM alumnos WHERE alu_id = ?;";
            ps = conexion.prepareStatement(comando);
            ps.setInt(1, 5);
            ps.execute();
            
            Actualizar un registro
            comando = "UPDATE alumnos SET alu_nombre = ? WHERE alu_id = ? OR alu_id = ?;";
            ps = conexion.prepareStatement(comando);
            ps.setString(1, "Fernanda");
            ps.setInt(2, 4);
            ps.setInt(3, 3);
            ps.execute();
            */
            
            //Seleccionar todos los registros
            comando = "SELECT alu_id, alu_nombre, alu_curso FROM alumnos;";
            ps = conexion.prepareStatement(comando);
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("Id: "+rs.getInt(1)+"; Nombre: "+rs.getString(2)+"; Curso: "+rs.getString(3));
            }
        }
        catch(SQLException e){
            System.out.println("Error");
            System.out.println(e.getMessage());
        }
    }
}
