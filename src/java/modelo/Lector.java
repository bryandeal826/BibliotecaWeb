
package modelo;

import modelo.coneccion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

public class Lector {
    private String CodLector;
    private String DniLector;
    private String NomLector;
    private String ApeLector;
    private String TelLector;
    private String DirLector;
    private String FecLector;
    private String StaLector;
    
    private Connection conexion;

    public String getCodLector() {
        return CodLector;
    }

    public void setCodLector(String CodLector) {
        this.CodLector = CodLector;
    }

    public String getDniLector() {
        return DniLector;
    }

    public void setDniLector(String DniLector) {
        this.DniLector = DniLector;
    }

    public String getNomLector() {
        return NomLector;
    }

    public void setNomLector(String NomLector) {
        this.NomLector = NomLector;
    }

    public String getApeLector() {
        return ApeLector;
    }

    public void setApeLector(String ApeLector) {
        this.ApeLector = ApeLector;
    }

    public String getTelLector() {
        return TelLector;
    }

    public void setTelLector(String TelLector) {
        this.TelLector = TelLector;
    }

    public String getDirLector() {
        return DirLector;
    }

    public void setDirLector(String DirLector) {
        this.DirLector = DirLector;
    }

    public String getFecLector() {
        return FecLector;
    }

    public void setFecLector(String FecLector) {
        this.FecLector = FecLector;
    }

    public String getStaLector() {
        return StaLector;
    }

    public void setStaLector(String StaLector) {
        this.StaLector = StaLector;
    }
    
    public Lector() {
    }


    
    public LinkedList<Lector> listaLector(){
        try {
            conexion = coneccion.conectar();
            String query = "SELECT * FROM Lector";
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(query);
            LinkedList<Lector> lista3;
            lista3 = new LinkedList<Lector>();
            while(resultado.next()){
                Lector l = new Lector(); 
                l.setCodLector(resultado.getString("CodLector"));
                l.setDniLector(resultado.getString("DniLector"));
                l.setNomLector(resultado.getString("NomLector"));
                l.setApeLector(resultado.getString("ApeLector"));
                l.setTelLector(resultado.getString("TelLector"));
                l.setDirLector(resultado.getString("DirLector"));
                l.setFecLector(resultado.getString("FecLector"));
                l.setStaLector(resultado.getString("StaLector"));
                lista3.add(l);
            }
            conexion.close();
            return lista3;
        } catch (Exception e) {
            System.out.println("Problema de conexion...");
        }
        return null;
    }
    
    public void agregarLector(String CodLector, String DniLector,String NomLector,String ApeLector,String TelLector,String DirLector, String FecLector,String StaLector)
     {
        try {
            conexion = coneccion.conectar();
            String query = "INSERT INTO Lector VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1,CodLector);
            sentencia.setString(2,DniLector);
            sentencia.setString(3,NomLector);
            sentencia.setString(4,ApeLector);
            sentencia.setString(5,TelLector);
            sentencia.setString(6,DirLector);
            sentencia.setString(7,FecLector);
            sentencia.setString(8,StaLector);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de insercion...");
        }
    }
    
    public void editarLector(String CodLector, String DniLector,String NomLector,String ApeLector
    ,String TelLector,String DirLector, String FecLector,String StaLector){
        try {
            conexion = coneccion.conectar();
             String query="UPDATE Lector SET CodLector=?, DniLector=?, NomLector=?, ApeLector =?,"
                     + "TelLector=?, DirLector=?, FecLector=?, StaLector=? WHERE CodLector=?; ";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1,CodLector);
            sentencia.setString(2,DniLector);
            sentencia.setString(3,NomLector);
            sentencia.setString(4,ApeLector);
            sentencia.setString(5,TelLector);
            sentencia.setString(6,DirLector);
            sentencia.setString(7,FecLector);
            sentencia.setString(8,StaLector);
            sentencia.setString(9,CodLector);
       
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de actualizacion...");
        }
    }
    
    public void eliminarLector(String CodLector){
        try {
            conexion = coneccion.conectar();
            String query = "UPDATE Lector SET Status=? WHERE CodLector=?; ";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1,"2");
            sentencia.setString(2,CodLector);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de eliminacion...");
        }
    }  
    
    
    
}
