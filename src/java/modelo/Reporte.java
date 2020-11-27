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
public class Reporte {
    private String Cod_Reporte,CodLector,CodBiblio,Des_Reporte,Sta_Reporte;
    
    private Connection conexion;

    public String getCod_Reporte() {
        return Cod_Reporte;
    }

    public void setCod_Reporte(String Cod_Reporte) {
        this.Cod_Reporte = Cod_Reporte;
    }

    public String getCodLector() {
        return CodLector;
    }

    public void setCodLector(String CodLector) {
        this.CodLector = CodLector;
    }

    public String getCodBiblio() {
        return CodBiblio;
    }

    public void setCodBiblio(String CodBiblio) {
        this.CodBiblio = CodBiblio;
    }

    public String getDes_Reporte() {
        return Des_Reporte;
    }

    public void setDes_Reporte(String Des_Reporte) {
        this.Des_Reporte = Des_Reporte;
    }

    public String getSta_Reporte() {
        return Sta_Reporte;
    }

    public void setSta_Reporte(String Sta_Reporte) {
        this.Sta_Reporte = Sta_Reporte;
    }
    
    
    public LinkedList<Reporte> listaReporte(){
        try {
            conexion = coneccion.conectar();
            String query = "SELECT * FROM Reporte; ";
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(query);
            LinkedList<Reporte> lista3;
            lista3 = new LinkedList<Reporte>();
            while(resultado.next()){
                Reporte r = new Reporte(); 
                r.setCod_Reporte(resultado.getString("Cod_Reporte"));
                r.setCodLector(resultado.getString("CodLector"));
                r.setCodBiblio(resultado.getString("CodBiblio"));
                r.setDes_Reporte(resultado.getString("Des_Reporte"));
                r.setSta_Reporte(resultado.getString("Sta_Reporte"));
                lista3.add(r);
            }
            conexion.close();
            return lista3;
        } catch (Exception e) {
            System.out.println("Problema de conexion...");
        }
        return null;
    }
        
    public void agregarReporte(String Cod_Reporte,String CodLector,String CodBiblio,String Des_Reporte,String Sta_Reporte)
     {
        try {
            conexion = coneccion.conectar();
            String query = "INSERT INTO Reporte (Cod_Reporte, CodLector, CodBiblio, Des_Reporte, Sta_Reporte) VALUES (?,?,?,?,? );";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1,Cod_Reporte);
            sentencia.setString(2,CodLector);
            sentencia.setString(3,CodBiblio);
            sentencia.setString(4,Des_Reporte);
            sentencia.setString(5,Sta_Reporte);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de insercion...");
        }
    }
    
    public void editarReporte(String Cod_Reporte,String CodBiblio,String CodLector,String Des_Reporte,String Sta_Reporte){
        try {
            conexion = coneccion.conectar();
             String query="UPDATE Reporte SET Cod_Reporte=?,CodLector=?,CodBiblio=?,Des_Reporte=?,Sta_Reporte=? WHERE Cod_Reporte=?; ";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1,Cod_Reporte);
            sentencia.setString(2,CodLector);
            sentencia.setString(3,CodBiblio);
            sentencia.setString(4,Des_Reporte);
            sentencia.setString(5,Sta_Reporte);
            sentencia.setString(6,Cod_Reporte);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de actualizacion...");
        }
    }
    
    public void eliminarReporte(String Cod_Reporte){
        try {
            conexion = coneccion.conectar();
            String query = "UPDATE Reporte SET Sta_Reporte=? WHERE Cod_Reporte=?; ";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1,"1");
            sentencia.setString(2,Cod_Reporte);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de eliminacion...");
        }
    }
    
    
}
