
package com.mycompany.reto_5_g59.modelo.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection conectar=null;
    public Connection conectar(){
        
        try {
            Class.forName("org.sqlite.JDBC");
            conectar=DriverManager.getConnection("jdbc:sqlite:ProyectosConstruccion.db");
            System.out.println("Conexión Establecida");
        }
       catch(Exception e){
           System.out.println(e.getMessage());
        
     } 
        return conectar;
  
 }
    
}