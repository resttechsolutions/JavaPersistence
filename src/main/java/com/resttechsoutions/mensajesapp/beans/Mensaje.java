/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.resttechsoutions.mensajesapp.beans;

import java.sql.Date;

/**
 *
 * @author Rafael Estrella
 */
public class Mensaje {
    private int idMsj;
    private String msj;
    private String autor;
    private Date fecha;

    public Mensaje() {
    }

    public Mensaje(int idMsj) {
        this();
        this.idMsj = idMsj;
    }

    public Mensaje(int idMsj, String msj) {
        this(idMsj);
        this.msj = msj;
    }

    public Mensaje(int idMsj, String msj, String autor) {
        this(idMsj, msj);
        this.autor = autor;
    }

    public Mensaje(int idMsj, String msj, String autor, Date fecha) {
        this(idMsj, msj, autor);
        this.fecha = fecha;
    }

    public int getIdMsj() {
        return idMsj;
    }

    public void setIdMsj(int idMsj) {
        this.idMsj = idMsj;
    }

    public String getMsj() {
        return msj;
    }

    public void setMsj(String msj) {
        this.msj = msj;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
