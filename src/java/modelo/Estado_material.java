/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.coneccion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author ASUS
 */
public class Estado_material {
    String CodEsta_mate,DesEst_mate;
    
    Connection conexion;

    public String getCodEsta_mate() {
        return CodEsta_mate;
    }

    public void setCodEsta_mate(String CodEsta_mate) {
        this.CodEsta_mate = CodEsta_mate;
    }

    public String getDesEst_mate() {
        return DesEst_mate;
    }

    public void setDesEst_mate(String DesEst_mate) {
        this.DesEst_mate = DesEst_mate;
    }
    

    public LinkedList<Estado_material> listaEstado_material(){
        try {
            conexion = coneccion.conectar();
            String query = "SELECT * FROM Estado_material; ";
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(query);
            LinkedList<Estado_material> lista3;
            lista3 = new LinkedList<Estado_material>();
            while(resultado.next()){
                Estado_material c = new Estado_material(); 
                c.setCodEsta_mate(resultado.getString("CodEsta_mate"));
                c.setDesEst_mate(resultado.getString("DesEst_mate"));
                lista3.add(c);
            }
            conexion.close();
            return lista3;
        } catch (Exception e) {
            System.out.println("Problema de conexion...");
        }
        return null;
    }
        
    public void agregarEstado_material(String CodEsta_mate,String DesEst_mate)
     {
        try {
            conexion = coneccion.conectar();
            String query = "INSERT INTO Estado_material VALUES(?,?,?,?)";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1, CodEsta_mate);
            sentencia.setString(2, DesEst_mate);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de insercion...");
        }
    }
    
}
