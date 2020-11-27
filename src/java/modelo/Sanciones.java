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
public class Sanciones {
    
    String Cod_Sancion,CodEncargado,Cod_Sanc,CodLector,Des_Sancion,Cod_Reporte;
    
    Connection conexion;

    public String getCod_Sancion() {
        return Cod_Sancion;
    }

    public void setCod_Sancion(String Cod_Sancion) {
        this.Cod_Sancion = Cod_Sancion;
    }

    public String getCodEncargado() {
        return CodEncargado;
    }

    public void setCodEncargado(String CodEncargado) {
        this.CodEncargado = CodEncargado;
    }

    public String getCod_Sanc() {
        return Cod_Sanc;
    }

    public void setCod_Sanc(String Cod_Sanc) {
        this.Cod_Sanc = Cod_Sanc;
    }

    public String getCodLector() {
        return CodLector;
    }

    public void setCodLector(String CodLector) {
        this.CodLector = CodLector;
    }

    public String getDes_Sancion() {
        return Des_Sancion;
    }

    public void setDes_Sancion(String Des_Sancion) {
        this.Des_Sancion = Des_Sancion;
    }

    public String getCod_Reporte() {
        return Cod_Reporte;
    }

    public void setCod_Reporte(String Cod_Reporte) {
        this.Cod_Reporte = Cod_Reporte;
    }
    
    
    public LinkedList<Sanciones> listaSanciones(){
        try {
            conexion = coneccion.conectar();
            String query = "SELECT * FROM Sanciones; ";
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(query);
            LinkedList<Sanciones> lista3;
            lista3 = new LinkedList<Sanciones>();
            while(resultado.next()){
                Sanciones c = new Sanciones(); 
                c.setCod_Sancion(resultado.getString("Cod_Sancion"));
                c.setCod_Sanc(resultado.getString("Cod_Sanc"));
                c.setCodEncargado(resultado.getString("CodEncargado"));
                c.setCodLector(resultado.getString("CodLector"));
                c.setDes_Sancion(resultado.getString("Des_Sancion"));
                c.setCod_Reporte(resultado.getString("Cod_Reporte"));
                lista3.add(c);
            }
            conexion.close();
            return lista3;
        } catch (Exception e) {
            System.out.println("Problema de conexion...");
        }
        return null;
    }
        
    public void agregarSanciones(String Cod_Sancion,String Cod_Reporte,String Cod_Sanc,String CodEncargado,String CodLector, String Des_Sancion)
     {
        try {
            conexion = coneccion.conectar();
            
            String query = "INSERT INTO Sanciones VALUES(?,?,?,?,?,?)";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            
            sentencia.setString(1, Cod_Sancion);
            sentencia.setString(2, Cod_Reporte);
            sentencia.setString(3, CodEncargado);
            sentencia.setString(4, Cod_Sanc);
            sentencia.setString(5, CodLector);
            sentencia.setString(6, Des_Sancion);
            
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de insercion...");
        }
    }
    
    public void editarSanciones(String Cod_Sancion,String Cod_Reporte, String Cod_Sanc, String CodEncargado, String CodLector, String Des_Sancion){
        try {
            conexion = coneccion.conectar();
             String query="UPDATE Sanciones SET Cod_Sancion=?,Cod_Sanc=?,CodEncargado=?,CodLector=?,Des_Sancion=? WHERE Cod_Sancion=?; ";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1, Cod_Sancion);
            sentencia.setString(2, Cod_Reporte);
            sentencia.setString(3, Cod_Sanc);
            sentencia.setString(4, CodEncargado);
            sentencia.setString(5, CodLector);
            sentencia.setString(6, Des_Sancion);
            sentencia.setString(7, Cod_Sancion);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de actualizacion...");
        }
    }
    
    public void eliminarSanciones(String Cod_Sancion){
        try {
            conexion = coneccion.conectar();
            String query = "DELETE FROM Sanciones WHERE Cod_Sancion=?; ";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1,"1");
            sentencia.setString(2,Cod_Sancion);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de eliminacion...");
        }
    }
}
