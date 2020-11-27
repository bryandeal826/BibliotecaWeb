package modelo;

import modelo.coneccion;
import controlador.autentica;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;


public class Prestamo {
    private String CodPrestamo;
    private String CodMate_biblio;
    private String CodLector;
    private String FpPrestamo;
    private String FePrestamo;
    private String StaPrestamo;
    private String CodBiblio; 
    private Connection conexion;

    public String getCodPrestamo() {
        return CodPrestamo;
    }

    public String getCodLector() {
        return CodLector;
    }

    public void setCodLector(String CodLector) {
        this.CodLector = CodLector;
    }

    public void setCodPrestamo(String CodPrestamo) {
        this.CodPrestamo = CodPrestamo;
    }

    public String getCodMate_biblio() {
        return CodMate_biblio;
    }

    public void setCodMate_biblio(String CodMate_biblio) {
        this.CodMate_biblio = CodMate_biblio;
    }

    public String getFpPrestamo() {
        return FpPrestamo;
    }

    public void setFpPrestamo(String FpPrestamo) {
        this.FpPrestamo = FpPrestamo;
    }

    public String getFePrestamo() {
        return FePrestamo;
    }

    public void setFePrestamo(String FePrestamo) {
        this.FePrestamo = FePrestamo;
    }

    public String getStaPrestamo() {
        return StaPrestamo;
    }

    public void setStaPrestamo(String StaPrestamo) {
        this.StaPrestamo = StaPrestamo;
    }

    public String getCodBiblio() {
        return CodBiblio;
    }

    public void setCodBiblio(String CodBiblio) {
        this.CodBiblio = CodBiblio;
    }
    
    

    public Prestamo() {
    }
    

    public LinkedList<Prestamo> listaPrestamo(){
        try {
            conexion = coneccion.conectar();
            String query = "SELECT * FROM Prestamo; ";
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(query);
            LinkedList<Prestamo> lista3;
            lista3 = new LinkedList<Prestamo>();
            while(resultado.next()){
                Prestamo t = new Prestamo(); 
                t.setCodPrestamo(resultado.getString("CodPrestamo"));
                t.setCodMate_biblio(resultado.getString("CodMate_biblio"));
                t.setCodLector(resultado.getString("CodLector"));
                t.setFpPrestamo(resultado.getString("FpPrestamo"));
                t.setFePrestamo(resultado.getString("FePrestamo"));
                t.setStaPrestamo(resultado.getString("StaPrestamo"));
                lista3.add(t);
            }
            conexion.close();
            return lista3;
        } catch (Exception e) {
            System.out.println("Problema de conexion...");
        }
        return null;
    }
        
    public void agregarPrestamo(String CodPrestamo,String CodMate_biblio,String CodLector,String FpPrestamo,String FePrestamo,String StaPrestamo)
     {
        try {
            conexion = coneccion.conectar();
            String query = "INSERT INTO Prestamo VALUES(?,?,?,?,?,?)";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1, CodPrestamo);
            sentencia.setString(2, CodMate_biblio);
            sentencia.setString(3, CodLector);
            sentencia.setString(4, FpPrestamo);
            sentencia.setString(5, FePrestamo);
            sentencia.setString(6, StaPrestamo);
            sentencia.executeUpdate();//CodPrestamo CodMate_biblio CodLector FpPrestamo FePrestamo StaPrestamo
            sentencia.close(); 
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de insercion...");
        }
    }
    
    public void editarPrestamo(String CodPrestamo,String FePrestamo,String FpPrestamo,String MatPrestamo,String CodLector,String StaPrestamo){
        try {
            conexion = coneccion.conectar();
            String query="UPDATE Prestamo SET CodPrestamo=?,CodMate_biblio=?,FePrestamo=?,FpPrestamo=?,CodLector=?,StaPrestamo=? WHERE CodPrestamo=?; ";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1, CodPrestamo);
            sentencia.setString(2, MatPrestamo);
            sentencia.setString(3, CodLector);
            sentencia.setString(4, FpPrestamo);
            sentencia.setString(5, FePrestamo);
            sentencia.setString(6, StaPrestamo);
            sentencia.setString(7, CodPrestamo);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de actualizacion...");
        }
    }
    
    public void eliminarPrestamo(String CodPrestamo,String StaPrestamo){
        try {
            conexion = coneccion.conectar();
            String query = "UPDATE Prestamo SET StaPrestamo=? WHERE CodPrestamo=?; ";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1,"2");
            sentencia.setString(2,CodPrestamo);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de eliminacion...");
        }
    }  
}
