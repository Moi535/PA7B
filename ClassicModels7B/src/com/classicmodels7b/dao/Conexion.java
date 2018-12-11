
package com.classicmodels7b.dao;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MOISES
 */
public class Conexion {
    Connection con = null;
    
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
             String server = "jdbc:mysql://localhost:3306/classicmodels";
             String userName = "root";
             String password = "";
             
             con = (Connection) DriverManager.getConnection(server, userName, password);
             
             
        } catch (ClassNotFoundException e) {
            System.out.println("Error driver "+ e.getMessage());
        } catch (SQLException ex) {
            System.out.println("error de conexion " +ex.getMessage());
        } catch (InstantiationException ex) {
            System.out.println("error " +ex.getMessage());
        } catch (IllegalAccessException ex) {
            System.out.println("error " +ex.getMessage());
        }
        
        return con;
    }
}
