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
public class Devolucion {
    String CodDevolucion,CodPrestamo;
    String FenDevolucion;
    
    Connection conexion;

    public String getCodDevolucion() {
        return CodDevolucion;
    }

    public void setCodDevolucion(String CodDevolucion) {
        this.CodDevolucion = CodDevolucion;
    }

    public String getCodPrestamo() {
        return CodPrestamo;
    }

    public void setCodPrestamo(String CodPrestamo) {
        this.CodPrestamo = CodPrestamo;
    }

    public String getFenDevolucion() {
        return FenDevolucion;
    }

    public void setFenDevolucion(String FenDevolucion) {
        this.FenDevolucion = FenDevolucion;
    }
        
    
    public LinkedList<Devolucion> listaDevolucion(){
        try {
            conexion = coneccion.conectar();
            String query = "SELECT * FROM Devolucion; ";
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(query);
            LinkedList<Devolucion> lista3;
            lista3 = new LinkedList<Devolucion>();
            while(resultado.next()){
                Devolucion d = new Devolucion(); 
                d.setCodDevolucion(resultado.getString("CodDevolucion"));
                d.setFenDevolucion(resultado.getString("FenDevolucion"));
                d.setCodPrestamo(resultado.getString("CodPrestamo"));
                
                lista3.add(d);
            }
            conexion.close();
            return lista3;
        } catch (Exception e) {
            System.out.println("Problema de conexion...");
        }
        return null;
    }
        
    public void agregarDevolucion(String CodDevolucion,String FenDevolucion,String CodPrestamo){
        try {
            conexion = coneccion.conectar();
            String query = "INSERT INTO Devolucion VALUES(?,?,?)";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1, CodDevolucion);
            sentencia.setString(2, FenDevolucion);
            sentencia.setString(3, CodPrestamo);
            sentencia.executeUpdate();//CodPrestamo MatPrestamo CodLector FpPrestamo FePrestamo StaPrestamo
            sentencia.close(); 
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de insercion...");
        }
    }
    
    public void editarDevolucion(String CodDevolucion,String FenDevolucion,String CodPrestamo){
        try {
            conexion = coneccion.conectar();
            String query="UPDATE Devolucion SET CodDevolucion=?,CodPrestamo=?,FenDevolucion=? WHERE CodDevolucion=?; ";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1, CodDevolucion);
            sentencia.setString(2, FenDevolucion);
            sentencia.setString(3, CodPrestamo);
            sentencia.setString(4, CodDevolucion);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de actualizacion...");
        }
    }
    
    public void eliminarDevolucion(String CodDevolucion){
        try {
            conexion = coneccion.conectar();
            String query = "DELETE FROM Devolucion WHERE CodDevolucion=?; ";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1,"1");
            sentencia.setString(2,CodDevolucion);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de eliminacion...");
        }
    }
}
