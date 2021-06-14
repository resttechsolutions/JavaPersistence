/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.resttechsoutions.mensajesapp;

import com.resttechsoutions.mensajesapp.beans.Mensaje;
import com.resttechsoutions.mensajesapp.dao.MensajeDao;
import com.resttechsoutions.mensajesapp.services.MensajeService;
import com.resttechsoutions.mensajesapp.source.MySqlConnection;
import java.util.Scanner;

/**
 *
 * @author Rafael Estrella
 */
public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mensaje msj = null;
        MensajeService ms = new MensajeService(new MensajeDao(new MySqlConnection()));

        int opcion = 0;
        String m = "";
        String author = "";
        int id = 0;

        do {
            System.out.println("--------------");
            System.out.println("Msj App");
            System.out.println(" 1. Create Msj");
            System.out.println(" 2. Read Msj");
            System.out.println(" 3. Edit Msj");
            System.out.println(" 4. Delete Msj");
            System.out.println(" 5. Quit");

            System.out.println("Select an option: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Write a messaje: ");
                    m = sc.next();

                    System.out.println("Write your sign");
                    author = sc.next();

                    msj = new Mensaje();

                    msj.setMsj(m);
                    msj.setAutor(author);

                    ms.createMsj(msj);

                    break;
                case 2:
                    ms.readMsj();
                    break;
                case 3:
                    System.out.println("Write the message ID to update: ");
                    id = sc.nextInt();
                    
                    System.out.println("Write a messaje: ");
                    m = sc.next();

                    System.out.println("Write your sign");
                    author = sc.next();

                    msj = new Mensaje();

                    msj.setIdMsj(id);
                    msj.setMsj(m);
                    msj.setAutor(author);

                    ms.updateMsj(msj);
                    break;
                case 4:
                    System.out.println("Write the message ID to deleting");
                    id = sc.nextInt();
                    
                    ms.deleteMsj(id);
                    break;
                default:
                    break;
            }

            msj = null;

        } while (opcion != 5);

    }
}
