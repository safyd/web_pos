/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safyd.omr;



import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class ConexionDB
{
    private static ConexionDB conexionSingleton;//variable estatica para almacenar la conexion
    //protected Connection  conexion;
    
    protected Statement s;
    protected ResultSet rs;
    
    ConexionInterface conexionInterface;

    public ConexionDB() 
    {
        //conexion=null;
        //conectar();
    }
    
    //patron singleton para devolver un objeto de conexion unico para toda la aplicacion
    public static ConexionDB getConexion()
    {
        if(conexionSingleton==null)
        {
            conexionSingleton=new ConexionDB();
            return conexionSingleton;
        }
        return conexionSingleton;
    }
    
   
    
  //  public void conectar() 
  //  {
  //       try 
  //       {            
  //          Class.forName("com.mysql.jdbc.Driver"); //busca el driver para realizar la conexion con mysql
  //          conexion=  (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/virtualmalldb","root", "1234");//datos de la conexio
  //         // System.out.println("conexion ok");
            //JOptionPane.showMessageDialog(null,"conectado");
  //      } catch (Exception e) {
  //          System.out.println(e.getMessage());
            
  //      }
  //  }
    
    public void desconectar()
    {
        try {
            conexionInterface.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //TE DEVUELVE datos de la bases
    public ResultSet ejecutarConsulta(String consulta)
    {
        //conectar();
        try {
            s = conexionInterface.getConnection().createStatement();
            rs = s.executeQuery (consulta);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
       // desconectar();
        return null;
    }
    
    //ejecutar update,insert,delete
     public int ejecutarQuery(String consulta)
    {
        //conectar();
        try {
            s = conexionInterface.getConnection().createStatement();
            s.execute(consulta);
            
           
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
       // desconectar();
       // desconectar();
       // desconectar();
       // desconectar();
        return 1;
    }
    
    public Connection getConexionDB() {
        return conexionInterface.getConnection();
    }

    /**
     * Ingresa la interfaz con la conexion
     * para poder empezar a funcionar
     * @param conexionInterface 
     */
    public void setConexionInterface(ConexionInterface conexionInterface) {
        this.conexionInterface = conexionInterface;
    }

     
}
