/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platzi.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hernandezjoe
 */
public class Conexion {
    
    public Connection getConnection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","");
            
            if (conn != null) {
                System.out.println("Conexión exitosa");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return conn;
    }
    
}
