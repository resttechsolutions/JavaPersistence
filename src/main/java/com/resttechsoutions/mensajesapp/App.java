/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.resttechsoutions.mensajesapp;

import com.resttechsoutions.mensajesapp.source.MySqlConnection;
import java.sql.Connection;

/**
 *
 * @author Rafael Estrella
 */
public class App {
    public static void main(String[] args) {
        MySqlConnection con = new MySqlConnection();
        
        try (Connection cnx = con.getConnection()) {
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
