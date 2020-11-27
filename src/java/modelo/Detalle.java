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
public class Detalle {
    String CodDetalle,CodMate_biblio,CodPrestamo,CodDevolucion,CodLector,CodEncargado,CodBiblio,Cod_sanc;
    
    Connection conexion;

    public String getCodDetalle() {
        return CodDetalle;
    }

    public void setCodDetalle(String CodDetalle) {
        this.CodDetalle = CodDetalle;
    }

    public String getCodMate_biblio() {
        return CodMate_biblio;
    }

    public void setCodMate_biblio(String CodMate_biblio) {
        this.CodMate_biblio = CodMate_biblio;
    }

    public String getCodPrestamo() {
        return CodPrestamo;
    }

    public void setCodPrestamo(String CodPrestamo) {
        this.CodPrestamo = CodPrestamo;
    }

    public String getCodDevolucion() {
        return CodDevolucion;
    }

    public void setCodDevolucion(String CodDevolucion) {
        this.CodDevolucion = CodDevolucion;
    }

    public String getCodLector() {
        return CodLector;
    }

    public void setCodLector(String CodLector) {
        this.CodLector = CodLector;
    }

    public String getCodEncargado() {
        return CodEncargado;
    }

    public void setCodEncargado(String CodEncargado) {
        this.CodEncargado = CodEncargado;
    }

    public String getCodBiblio() {
        return CodBiblio;
    }

    public void setCodBiblio(String CodBiblio) {
        this.CodBiblio = CodBiblio;
    }

    public String getCod_sanc() {
        return Cod_sanc;
    }

    public void setCod_sanc(String Cod_sanc) {
        this.Cod_sanc = Cod_sanc;
    }
    
    
    public LinkedList<Detalle> listaDetalle(){
        try {
            conexion = coneccion.conectar();
            String query = "SELECT * FROM Detalle; ";
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(query);
            LinkedList<Detalle> lista3;
            lista3 = new LinkedList<Detalle>();
            while(resultado.next()){
                Detalle d = new Detalle(); 
                d.setCodDetalle(resultado.getString("CodDetalle"));
                d.setCodMate_biblio(resultado.getString("CodMate_biblio"));
                d.setCodDevolucion(resultado.getString("CodDevolucion"));
                d.setCodLector(resultado.getString("CodLector"));
                d.setCodEncargado(resultado.getString("CodEncargado"));
                d.setCodBiblio(resultado.getString("CodBiblio"));
                d.setCod_sanc(resultado.getString("Cod_sanc"));
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
        
    public void agregarDetalle(String CodDetalle,String CodMate_biblio,String CodDevolucion,String CodLector,String CodEncargado,String CodBiblio,String Cod_sanc,String CodPrestamo)
     {
        try {
            conexion = coneccion.conectar();
            String query = "INSERT INTO Detalle VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1, CodDetalle);
            sentencia.setString(2, CodMate_biblio);
            sentencia.setString(3, CodDevolucion);
            sentencia.setString(4, CodLector);
            sentencia.setString(5, CodEncargado);
            sentencia.setString(6, CodBiblio);
            sentencia.setString(7, Cod_sanc);
            sentencia.setString(8, CodPrestamo);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de insercion...");
        }
    }
    
    public void editarDetalle(String CodDetalle,String CodMate_biblio,String CodDevolucion,String CodLector,String CodEncargado,String CodBiblio,String Cod_sanc,String CodPrestamo){
        try {
            conexion = coneccion.conectar();
             String query="UPDATE Tipo_sancion SET CodDetalle=?,CodMate_biblio=?,CodDevolucion=?,CodLector=?,CodEncargado=?,CodBiblio=?,Cod_sanc=?,CodPrestamo=? WHERE CodDetalle=?; ";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1, CodDetalle);
            sentencia.setString(2, CodMate_biblio);
            sentencia.setString(3, CodDevolucion);
            sentencia.setString(4, CodLector);
            sentencia.setString(5, CodEncargado);
            sentencia.setString(6, CodBiblio);
            sentencia.setString(7, Cod_sanc);
            sentencia.setString(8, CodPrestamo);
            sentencia.setString(9, CodDetalle);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de actualizacion...");
        }
    }
    
    public void eliminarDetalle(String CodDetalle){
        try {
            conexion = coneccion.conectar();
            String query = "DELETE FROM Detalle WHERE CodDetalle=?; ";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1,"1");
            sentencia.setString(2,CodDetalle);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de eliminacion...");
        }
    }
}
