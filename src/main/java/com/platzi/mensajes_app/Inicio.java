/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.platzi.mensajes_app;

import java.sql.Connection;
import java.util.Scanner;
import static com.platzi.mensajes_app.MensajesService.*;

/**
 *
 * @author hernandezjoe
 */
public class Inicio {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner sc = new Scanner(System.in);
        
        int opc = 0;
        do {            
            System.out.println("------------------");
            System.out.println("Aplicación de mensajes");
            System.out.println("1. Crear mensajes");
            System.out.println("2. Listar mensajes");
            System.out.println("3. Eliminar mensaje");
            System.out.println("4. Editar mensaje");
            System.out.println("5. Salir.");
            
            // Leemos la opcion del usuario
            
            opc=sc.nextInt();
            
            switch (opc) {
                case 1:
                    crearMensaje();
                    break;
                case 2:
                    listarMensajes();
                    break;
                case 3:
                    borrarMensaje();
                    break;
                case 4:
                    editarMendaje();
                default:
                    break;
            }
        } while (opc != 5);
        
        
    }
}
