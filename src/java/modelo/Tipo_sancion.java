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
public class Tipo_sancion {
    String Cod_Sanc,Des_Sanc;
    double Pag_Sanc;
    
    Connection conexion;

    public String getCod_Sanc() {
        return Cod_Sanc;
    }

    public void setCod_Sanc(String Cod_Sanc) {
        this.Cod_Sanc = Cod_Sanc;
    }

    public String getDes_Sanc() {
        return Des_Sanc;
    }

    public void setDes_Sanc(String Des_Sanc) {
        this.Des_Sanc = Des_Sanc;
    }

    public double getPag_Sanc() {
        return Pag_Sanc;
    }

    public void setPag_Sanc(double Pag_Sanc) {
        this.Pag_Sanc = Pag_Sanc;
    }
    

    
    public LinkedList<Tipo_sancion> listaTipo_sancion(){
        try {
            conexion = coneccion.conectar();
            String query = "SELECT * FROM Tipo_sancion; ";
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(query);
            LinkedList<Tipo_sancion> lista3;
            lista3 = new LinkedList<Tipo_sancion>();
            while(resultado.next()){
                Tipo_sancion t = new Tipo_sancion(); 
                t.setCod_Sanc(resultado.getString("Cod_Sanc"));
                t.setDes_Sanc(resultado.getString("Des_Sanc"));
                t.setPag_Sanc(resultado.getDouble("Pag_Sanc"));
                lista3.add(t);
            }
            conexion.close();
            return lista3;
        } catch (Exception e) {
            System.out.println("Problema de conexion...");
        }
        return null;
    }
        
    public void agregarTipo_sancion(String Cod_Sanc,String Des_Sanc,String Pag_Sanc)
     {
        try {
            conexion = coneccion.conectar();
            String query = "INSERT INTO Tipo_sancion VALUES(?,?,?)";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1, Cod_Sanc);
            sentencia.setString(2, Des_Sanc);
            sentencia.setString(3, Pag_Sanc);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de insercion...");
        }
    }
    
    public void editarTipo_sancion(String Cod_Sanc, String Des_Sanc, String Pag_Sanc){
        try {
            conexion = coneccion.conectar();
             String query="UPDATE Tipo_sancion SET Cod_Sanc=?,Des_Sanc=?,Pag_Sanc=? WHERE Cod_Sanc=?; ";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1,Cod_Sanc);
            sentencia.setString(2,Des_Sanc);
            sentencia.setString(3,Pag_Sanc);
            sentencia.setString(4,Cod_Sanc);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de actualizacion...");
        }
    }
    
    public void eliminarTipo_sancion(String Cod_Sanc){
        try {
            conexion = coneccion.conectar();
            String query = "DELETE FROM Tipo_sancion WHERE Cod_Sanc=?; ";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1,"1");
            sentencia.setString(2,Cod_Sanc);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de eliminacion...");
        }
    }
    
}
