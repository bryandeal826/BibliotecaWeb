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
public class Bibliotecario {
    //CodBiblio,DniBiblio,NomBiblio,ApeBiblio,TelBiblio,DirBiblio,EdadBiblio,StaBiblio
    private String CodBiblio;
    private String DniBiblio;
    private String NomBiblio;
    private String ApeBiblio;
    private String TelBiblio;
    private String DirBiblio;
    private String FecBiblio;
    private String StaBiblio;
    
    private Connection conexion;

    public String getCodBiblio() {
        return CodBiblio;
    }

    public void setCodBiblio(String CodBiblio) {
        this.CodBiblio = CodBiblio;
    }

    public String getDniBiblio() {
        return DniBiblio;
    }

    public void setDniBiblio(String DniBiblio) {
        this.DniBiblio = DniBiblio;
    }

    public String getNomBiblio() {
        return NomBiblio;
    }

    public void setNomBiblio(String NomBiblio) {
        this.NomBiblio = NomBiblio;
    }

    public String getApeBiblio() {
        return ApeBiblio;
    }

    public void setApeBiblio(String ApeBiblio) {
        this.ApeBiblio = ApeBiblio;
    }

    public String getTelBiblio() {
        return TelBiblio;
    }

    public void setTelBiblio(String TelBiblio) {
        this.TelBiblio = TelBiblio;
    }

    public String getDirBiblio() {
        return DirBiblio;
    }

    public void setDirBiblio(String DirBiblio) {
        this.DirBiblio = DirBiblio;
    }

    public String getFecBiblio() {
        return FecBiblio;
    }

    public void setFecBiblio(String FecBiblio) {
        this.FecBiblio = FecBiblio;
    }

    public String getStaBiblio() {
        return StaBiblio;
    }

    public void setStaBiblio(String StaBiblio) {
        this.StaBiblio = StaBiblio;
    }
    
    
    public LinkedList<Bibliotecario> listaBibliotecario(){
        try {
            
            conexion = coneccion.conectar();
            String query = "SELECT * FROM Bibliotecario; ";
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(query);
            LinkedList<Bibliotecario> lista3;
            lista3 = new LinkedList<Bibliotecario>();
            while(resultado.next()){
                Bibliotecario b = new Bibliotecario(); 
                b.setCodBiblio(resultado.getString("CodBiblio"));
                b.setDniBiblio(resultado.getString("DniBiblio"));
                b.setNomBiblio(resultado.getString("NomBiblio"));
                b.setApeBiblio(resultado.getString("ApeBiblio"));
                b.setTelBiblio(resultado.getString("TelBiblio"));
                b.setDirBiblio(resultado.getString("DirBiblio"));
                b.setFecBiblio(resultado.getString("FecBiblio"));
                b.setStaBiblio(resultado.getString("StaBiblio"));
                lista3.add(b);
            }
            conexion.close();
            return lista3;
        } catch (Exception e) {
            System.out.println("Problema de conexion...");
        }
        return null;
    }
        
    public void agregarBibliotecario(String CodBiblio,String DniBiblio,String NomBiblio,String ApeBiblio,String TelBiblio,String DirBiblio,String FecBiblio,String StaBiblio)
     {
        try {
            conexion = coneccion.conectar();
            String query = "INSERT INTO Bibliotecario VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1,CodBiblio);
            sentencia.setString(2,DniBiblio);
            sentencia.setString(3,NomBiblio);
            sentencia.setString(4,ApeBiblio);
            sentencia.setString(5,TelBiblio);
            sentencia.setString(6,DirBiblio);
            sentencia.setString(7,FecBiblio);
            sentencia.setString(8,StaBiblio);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de insercion...");
        }
    }
    
    public void editarBibliotecario(String CodBiblio,String DniBiblio,String NomBiblio,String ApeBiblio,String TelBiblio,String DirBiblio,String FecBiblio,String StaBiblio){
        try {
            conexion = coneccion.conectar();
             String query="UPDATE Bibliotecario SET CodBiblio=?,DniBiblio=?,NomBiblio=?,ApeBiblio=?,TelBiblio=?,DirBiblio=?,FecBiblio=?,StaBiblio=? WHERE CodBiblio=?; ";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1,CodBiblio);
            sentencia.setString(2,DniBiblio);
            sentencia.setString(3,NomBiblio);
            sentencia.setString(4,ApeBiblio);
            sentencia.setString(5,TelBiblio);
            sentencia.setString(6,DirBiblio);
            sentencia.setString(7,FecBiblio);
            sentencia.setString(8,StaBiblio);
            sentencia.setString(9,CodBiblio);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de actualizacion...");
        }
    }
    
    public void eliminarBibliotecario(String CodBiblio){
        try {
            conexion = coneccion.conectar();
            String query = "UPDATE Bibliotecario SET StaUsuario=? WHERE CodBiblio=?; ";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1,"1");
            sentencia.setString(2,CodBiblio);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de eliminacion...");
        }
    }
    
}
