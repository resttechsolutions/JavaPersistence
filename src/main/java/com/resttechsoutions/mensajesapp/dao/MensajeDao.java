/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.resttechsoutions.mensajesapp.dao;

import com.resttechsoutions.mensajesapp.beans.Mensaje;
import com.resttechsoutions.mensajesapp.source.MySqlConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Rafael Estrella
 */
public class MensajeDao {
    
    private final MySqlConnection mc;
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    public MensajeDao(MySqlConnection mc) {
        this.mc = mc;
    }   
    
    public void createMsj(Mensaje msj) throws SQLException{
        con = mc.getConnection();
        
        ps = con.prepareStatement("Insert into mensajes (msj, autor, fecha) values (?,?,?)");
        
        ps.setString(1, msj.getMsj());
        ps.setString(2, msj.getAutor());
        ps.setDate(3, msj.getFecha());
        
        if(ps.executeUpdate() > 0)
            System.out.println("Messaje Inserted!");
        
        ps.close();
        mc.closeConnection();
    }
    
    public void readMsj() throws SQLException{
        con = mc.getConnection();
        
        ps = con.prepareStatement("SELECT * FROM MENSAJES");
        
        rs = ps.executeQuery();
        
        while (rs.next()) {  
            System.out.println("************************************************************************************************");
            System.out.println("ID: " + rs.getInt("id_msj") + ", MENSAJE: " + rs.getString("msj") +  ", AUTOR: " + rs.getString("autor")  + ", FECHA: " + rs.getDate("fecha"));
            System.out.println("************************************************************************************************");
        }
        
        ps.close();
        rs.close();
        mc.closeConnection();
    }
    
    public void deleteMsj(int idMsj) throws SQLException{
        con = mc.getConnection();
        
        ps = con.prepareStatement("DELETE FROM MENSAJES WHERE ID_MSJ= ?");
        
        ps.setInt(1, idMsj);
        
        if(ps.executeUpdate() > 0)
            System.out.println("Messaje Deleted!");
        
        ps.close();
        mc.closeConnection();
    }
    
    public void updateMsj(Mensaje msj) throws SQLException{
        con = mc.getConnection();
        
        ps = con.prepareStatement("UPDATE MENSAJES SET MSJ = ?, AUTOR = ?, FECHA = ? WHERE ID_MSJ = ?");
        
        ps.setString(1, msj.getMsj());
        ps.setString(2, msj.getAutor());
        ps.setDate(3, new Date(new java.util.Date().getTime()));
        ps.setInt(4, msj.getIdMsj());
        
        
        if(ps.executeUpdate() > 0)
            System.out.println("Messaje Updated!");
        
        ps.close();
        mc.closeConnection();
    }
}
