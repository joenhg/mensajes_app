/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platzi.mensajes_app;

import java.util.Scanner;
import static com.platzi.mensajes_app.MensajesDAO.*;

/**
 *
 * @author hernandezjoe
 */
public class MensajesService {
    public static void crearMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje. ");
        String mensaje = sc.nextLine();
        
        System.out.println("Tu nombre");
        String nombre = sc.nextLine();
        
        MensajesBean bean = new MensajesBean();
        bean.setMensaje(mensaje);
        bean.setAutorMensaje(nombre);
        crearmensajeDB(bean);
        //MensajesDAO.crearmensajeDB(bean);
    }
    
    public static void listarMensajes(){
        leerMensajesDB();
    }
    
    public static void borrarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el id del mensaje que desea eliminar. ");
        int idMensaje = sc.nextInt();
        
        borrarMensajeDB(idMensaje);
    }
    
    public static void editarMendaje(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe el id del mensaje a actualizar");
        int idMensaje = sc.nextInt();
        sc.nextLine();
        System.out.println("Escribe tu mensaje. ");
        String mensaje = sc.nextLine();
        
        MensajesBean bean = new MensajesBean();
        bean.setIdMensaje(idMensaje);
        bean.setMensaje(mensaje);
        actualizarMensajeDB(bean);
        
    }
    
}
