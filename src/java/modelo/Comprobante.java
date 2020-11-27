/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.coneccion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author ASUS
 */
public class Comprobante {
    private String Cod_Comprobante,Cod_Sancion;
    private double Sub_Comprobante;
    Date Fec_Comprobante; 
    
    private Connection conexion;

    public double getSub_Comprobante() {
        return Sub_Comprobante;
    }

    public void setSub_Comprobante(double Sub_Comprobante) {
        this.Sub_Comprobante = Sub_Comprobante;
    }

    public Date getFec_Comprobante() {
        return Fec_Comprobante;
    }

    public void setFec_Comprobante(Date Fec_Comprobante) {
        this.Fec_Comprobante = Fec_Comprobante;
    }

    public String getCod_comprobante() {
        return Cod_Comprobante;
    }

    public void setCod_comprobante(String Cod_comprobante) {
        this.Cod_Comprobante = Cod_comprobante;
    }

    public String getCod_Sancion() {
        return Cod_Sancion;
    }

    public void setCod_Sancion(String Cod_Sancion) {
        this.Cod_Sancion = Cod_Sancion;
    }
    
    
    public LinkedList<Comprobante> listaComprobante(){
        try {
            conexion = coneccion.conectar();
            String query = "SELECT * FROM Comprobante; ";
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(query);
            LinkedList<Comprobante> lista3;
            lista3 = new LinkedList<Comprobante>();
            while(resultado.next()){
                Comprobante c = new Comprobante(); 
                c.setCod_comprobante(resultado.getString("Cod_Comprobante"));
                c.setCod_Sancion(resultado.getString("Cod_Sancion"));
                c.setSub_Comprobante(resultado.getDouble("Sub_Comprobante"));
                c.setFec_Comprobante(resultado.getDate("Fec_Comprobante"));
                lista3.add(c);
            }
            conexion.close();
            return lista3;
        } catch (Exception e) {
            System.out.println("Problema de conexion...");
        }
        return null;
    }
        
    public void agregarComprobante(String Cod_Comprobante,String Cod_Sancion,String Sub_Comprobante,String Fec_Comprobante)
     {
        try {
            conexion = coneccion.conectar();
            String query = "INSERT INTO Comprobante VALUES(?,?,?,?)";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1, Cod_Comprobante);
            sentencia.setString(2, Cod_Sancion);
            sentencia.setString(3, Sub_Comprobante);
            sentencia.setString(4, Fec_Comprobante);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de insercion...");
        }
    }
}
