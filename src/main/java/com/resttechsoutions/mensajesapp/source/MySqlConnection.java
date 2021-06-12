/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.resttechsoutions.mensajesapp.source;

import com.resttechsoutions.mensajesapp.services.MensajeService;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Rafael Estrella
 */
public class MySqlConnection {
    
    public Connection getConnection(){
        Connection con = null;
        Scanner sc = new Scanner(System.in);
        
        int opcion = 0;
        
        do{
            System.out.println("--------------");
            System.out.println("Msj App");
            System.out.println(" 1. Create Msj");
            System.out.println(" 2. Read Mesj");
            System.out.println(" 3. Edit Mesj");
            System.out.println(" 4. Delete Mesj");
            System.out.println(" 5. Quit");
            
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    MensajeService.createMsj();
                    break;
                case 2:
                    MensajeService.readMsj();
                    break;
                case 3:
                    MensajeService.updateMsj();
                    break;
                case 4:
                    MensajeService.deleteMsj();
                    break;
                default:
                    break;
                    
            }
        } while(opcion != 5);
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","10rafael10");
            
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return con;
    }
}
