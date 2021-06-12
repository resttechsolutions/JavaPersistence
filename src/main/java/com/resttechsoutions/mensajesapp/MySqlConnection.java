/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.resttechsoutions.mensajesapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rafael Estrella
 */
public class MySqlConnection {
    
    public Connection getConnection(){
        Connection con = null;
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","10rafael10");
            
            if(con != null)
                System.out.println("ConnectionSuccesfull");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return con;
    }
}
