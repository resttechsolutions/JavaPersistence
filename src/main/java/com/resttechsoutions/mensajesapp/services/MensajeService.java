/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.resttechsoutions.mensajesapp.services;

import com.resttechsoutions.mensajesapp.beans.Mensaje;
import com.resttechsoutions.mensajesapp.dao.MensajeDao;
import java.sql.SQLException;

/**
 *
 * @author Rafael Estrella
 */
public class MensajeService {
    private static MensajeDao dao;

    public MensajeService(MensajeDao dao) {
        this.dao = dao;
    }
    
    public static void createMsj(Mensaje msj){
        try {
            dao.createMsj(msj);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void readMsj(){
        try {
            dao.readMsj();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void deleteMsj(int idMsj){
        try {
            dao.deleteMsj(idMsj);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void updateMsj(Mensaje msj){
        try {
            dao.updateMsj(msj);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
