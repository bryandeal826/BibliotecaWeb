package modelo;

import modelo.coneccion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;


public class Material_B {
    private String CodMate_biblio ,CodEsta_mate,AutMate_biblio,EditMate,EdiMate,NomMate_biblio,FePMate;

    public String getNomMate_biblio() {
        return NomMate_biblio;
    }

    public void setNomMate_biblio(String NomMate_biblio) {
        this.NomMate_biblio = NomMate_biblio;
    }

    public String getCodMate_biblio() {
        return CodMate_biblio;
    }

    public void setCodMate_biblio(String CodMate_biblio) {
        this.CodMate_biblio = CodMate_biblio;
    }

    public String getCodEsta_mate() {
        return CodEsta_mate;
    }

    public void setCodEsta_mate(String CodEsta_mate) {
        this.CodEsta_mate = CodEsta_mate;
    }

    public String getAutMate() {
        return AutMate_biblio;
    }

    public void setAutMate_biblio(String AutMate_biblio) {
        this.AutMate_biblio = AutMate_biblio;
    }

    public String getEditMate() {
        return EditMate;
    }

    public void setEditMate(String EditMate) {
        this.EditMate = EditMate;
    }

    public String getEdiMate() {
        return EdiMate;
    }

    public void setEdiMate(String EdiMate) {
        this.EdiMate = EdiMate;
    }

    public String getFePMate() {
        return FePMate;
    }

    public void setFePMate(String FePMate) {
        this.FePMate = FePMate;
    }
    
    
    
    private Connection conexion;

    public Material_B() {
    }
    public void habilitarMaterial(String CodMate_biblio)
     {
        try {
            conexion = coneccion.conectar();
            String query = "UPDATE MATERIAL_BIBLIOG SET CodEsta_mate=? WHERE CodMate_biblio=?; ";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1,"EM00000");
            sentencia.setString(2,CodMate_biblio);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de insercion...");
        }
    }
    
    public void deshabilitarMaterial(String CodMate_biblio)
     {
        try {
            conexion = coneccion.conectar();
            String query = "UPDATE MATERIAL_BIBLIOG SET CodEsta_mate=? WHERE CodMate_biblio=?; ";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1,"EM00001");
            sentencia.setString(2,CodMate_biblio);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de insercion...");
        }
    }
    
    
    public LinkedList<Material_B> listaMaterial(){
        try {
            conexion = coneccion.conectar();
            String query = "SELECT * FROM MATERIAL_BIBLIOG";
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(query);
            LinkedList<Material_B> lista3;
            lista3 = new LinkedList<Material_B>();
            while(resultado.next()){
                Material_B t = new Material_B(); 
                t.setCodMate_biblio(resultado.getString("CodMate_biblio"));
                t.setCodEsta_mate(resultado.getString("CodEsta_mate"));
                t.setNomMate_biblio(resultado.getString("NomMate_biblio"));
                t.setAutMate_biblio(resultado.getString("AutMate_biblio"));
                t.setEditMate(resultado.getString("EditMate_biblio"));
                t.setEdiMate(resultado.getString("EdiMate_biblio"));
                t.setFePMate(resultado.getString("FePMate_biblio"));
                lista3.add(t);
            }
            conexion.close();
            return lista3;
        } catch (Exception e) {
            System.out.println("Problema de conexion...");
        }
        return null;
    }
    
    public void agregarMaterial(String CodMate_biblio,String CodEsta_mate,String NomEsta_mate,String AutMate,String EditMate,String EdiMate,String FePMate){
        try {
            conexion = coneccion.conectar();
            String query = "INSERT INTO MATERIAL_BIBLIOG VALUES(?,?,?,?,?,?,?)";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1,CodMate_biblio);
            sentencia.setString(2,CodEsta_mate);
            sentencia.setString(3,NomEsta_mate);
            sentencia.setString(4,AutMate);
            sentencia.setString(5,EditMate);
            sentencia.setString(6,EdiMate);
            sentencia.setString(7,FePMate);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de insercion...");
        }
    }
    public void editarMaterial(String CodMate_biblio,String CodEsta_mate,String NomMate_biblio,String AutMate,String EditMate,String EdiMate,String FePMate)
     {
        try {
            conexion = coneccion.conectar();
            String query = "UPDATE MATERIAL_BIBLIOG SET CodMate_biblio=?, CodEsta_mate=?,NomMate_biblio=?, AutMate_biblio=?, EditMate_biblio=?, EdiMate_biblio=? ,FePMate_biblio=? WHERE CodMate_biblio=?; ";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1,CodMate_biblio);
            sentencia.setString(2,CodEsta_mate);
            sentencia.setString(3,NomMate_biblio);
            sentencia.setString(4,AutMate);
            sentencia.setString(5,EditMate);
            sentencia.setString(6,EdiMate);
            sentencia.setString(7,FePMate);
            sentencia.setString(8,CodMate_biblio);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de insercion...");
        }
    }
    
    public void eliminarMaterial(String CodMate_biblio){
        try {
            conexion = coneccion.conectar();
            String query = "UPDATE MATERIAL_BIBLIOG SET CodEsta_mate=? WHERE CodMate_biblio=?; ";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            
            /*
            0 Habilitado
            1 Deshabilitado por prestamo 
            2 Deshabilitado por estado del material  
            3 Deshabilitado permanente
            */
            sentencia.setString(1,"EM00003");
            sentencia.setString(2,CodMate_biblio);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de eliminacion...");
        }
    }
    
}
