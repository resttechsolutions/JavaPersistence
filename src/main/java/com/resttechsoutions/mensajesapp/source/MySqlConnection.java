/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.resttechsoutions.mensajesapp.source;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rafael Estrella
 */
public class MySqlConnection {
    private Connection con;
    private final String URL;
    private final String USER;
    private final String PASS;

    public MySqlConnection() {
        this.URL = "jdbc:mysql://localhost:3306/mensajes_app";
        this.USER = "root";
        this.PASS = "10rafael10";
    }
    
    public Connection getConnection() throws SQLException{
        con = DriverManager.getConnection(URL,USER, PASS);
        
        return con;
    }
    
    public void closeConnection() throws SQLException{
        con.close();
    }
}
