/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.platzi.mensajes_app;

import java.sql.Connection;

/**
 *
 * @author hernandezjoe
 */
public class Inicio {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Conexion conexion = new Conexion();
        
        try (Connection conn = conexion.getConnection()) {
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
