/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platzi.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author hernandezjoe
 */
public class MensajesDAO {
    
    public static void crearmensajeDB(MensajesBean mb){
        Conexion db_connect = new Conexion();
        try(Connection conn = db_connect.getConnection()) {
            PreparedStatement ps = null;
            
            try{
               String query = "INSERT INTO mensajes (mensaje, autor_mensaje) VALUES(?,?)"; 
               ps = conn.prepareStatement(query);
               ps.setString(1, mb.getMensaje());
               ps.setString(2, mb.getAutorMensaje());
               ps.executeUpdate();
               System.out.println("El mensaje fue creado correctamente");
               
            }catch(Exception ex){
                System.out.println(ex);
            }
            
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public static void leerMensajesDB(){
        
        Conexion db_connect = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try(Connection conn = db_connect.getConnection()) {    
            String query = "SELECT * FROM mensajes";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                System.out.println("ID: "+ rs.getInt("id_mensaje"));
                System.out.println("Mensaje: "+ rs.getString("mensaje"));
                System.out.println("Autor: "+ rs.getString("autor_mensaje"));
                System.out.println("Fecha: "+ rs.getString("fecha_mensaje"));
                System.out.println("");
            }
            
        }catch(SQLException e){
            System.out.println("No se pudieron recuoerar los mensajes");
            System.out.println(e);
        }
    }
    
    public static void borrarMensajeDB(int idMensaje){
         Conexion db_connect = new Conexion();
         PreparedStatement ps = null;
        try(Connection conn = db_connect.getConnection()) {
            String query = "delete from mensajes where id_mensaje = ?";
            ps = conn.prepareStatement(query);
            ps.setInt(1, idMensaje);
            int countRowsUpdate = ps.executeUpdate();
            if (countRowsUpdate != 0) {
                System.out.println("Mensaje elimiando");
            }else{
                System.out.println("Was not found");
            }
            
        }catch(SQLException e){
            System.out.println("No se pudo borrar el mensaje");
            System.out.println(e);
        }
    }

    public static void actualizarMensajeDB(MensajesBean mb){
        Conexion db_connect = new Conexion();
        try(Connection conn = db_connect.getConnection()) {
            PreparedStatement ps = null;
            
            try{
               String query = "update mensajes set mensaje = ? where id_mensaje = ?"; 
               ps = conn.prepareStatement(query);
               ps.setString(1, mb.getMensaje());
               ps.setInt(2, mb.getIdMensaje());
               ps.executeUpdate();
               System.out.println("El mensaje fue actualizado correctamente");
               
            }catch(SQLException ex){
                System.out.println("No se pudo actualizar el mensaje");
                System.out.println(ex);
            }
            
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
