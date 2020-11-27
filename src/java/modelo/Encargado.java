
package modelo;

import modelo.coneccion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

public class Encargado {
    
    private String CodEncargado;
    private String DniEncargado;
    private String NomEncargado;
    private String ApeEncargado;
    private String TelEncargado;
    private String DirEncargado;
    private Date FecEncargado;
    private String StaEncargado;
    
    private Connection conexion;

    public String getCodEncargado() {
        return CodEncargado;
    }

    public void setCodEncargado(String CodEncargado) {
        this.CodEncargado = CodEncargado;
    }

    public String getDniEncargado() {
        return DniEncargado;
    }

    public void setDniEncargado(String DniEncargado) {
        this.DniEncargado = DniEncargado;
    }

    public String getNomEncargado() {
        return NomEncargado;
    }

    public void setNomEncargado(String NomEncargado) {
        this.NomEncargado = NomEncargado;
    }

    public String getApeEncargado() {
        return ApeEncargado;
    }

    public void setApeEncargado(String ApeEncargado) {
        this.ApeEncargado = ApeEncargado;
    }

    public String getTelEncargado() {
        return TelEncargado;
    }

    public void setTelEncargado(String TelEncargado) {
        this.TelEncargado = TelEncargado;
    }

    public String getDirEncargado() {
        return DirEncargado;
    }

    public void setDirEncargado(String DirEncargado) {
        this.DirEncargado = DirEncargado;
    }

    public Date getFecEncargado() {
        return FecEncargado;
    }

    public void setFecEncargado(Date FecEncargado) {
        this.FecEncargado = FecEncargado;
    }

    public String getStaEncargado() {
        return StaEncargado;
    }

    public void setStaEncargado(String StaEncargado) {
        this.StaEncargado = StaEncargado;
    }
    
    public Encargado() {
    }


    public LinkedList<Encargado> listaEncargado(){
        try {
            conexion = coneccion.conectar();
            String query = "SELECT * FROM Encargado;";
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(query);
            LinkedList<Encargado> lista3;
            lista3 = new LinkedList<Encargado>();
            while(resultado.next()){
                Encargado l = new Encargado(); 
                l.setCodEncargado(resultado.getString("CodEncargado"));
                l.setDniEncargado(resultado.getString("DniEncargado"));
                l.setNomEncargado(resultado.getString("NomEncargado"));
                l.setApeEncargado(resultado.getString("ApeEncargado"));
                l.setTelEncargado(resultado.getString("TelEncargado"));
                l.setDirEncargado(resultado.getString("DirEncargado"));
                l.setFecEncargado(resultado.getDate("FecEncargado"));
                l.setStaEncargado(resultado.getString("StaEncargado"));
                lista3.add(l);
            }
            conexion.close();
            return lista3;
        } catch (Exception e) {
            System.out.println("Problema de conexion...");
        }
        return null;
    }
    
    public void agregarEncargado(String CodEncargado, String DniEncargado,String NomEncargado,String ApeEncargado,String TelEncargado,String DirEncargado, Date FecEncargado,String StaEncargado)
     {
        try {
            conexion = coneccion.conectar();
            String query = "INSERT INTO Encargado VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1,CodEncargado);
            sentencia.setString(2,DniEncargado);
            sentencia.setString(3,NomEncargado);
            sentencia.setString(4,ApeEncargado);
            sentencia.setString(5,TelEncargado);
            sentencia.setString(6,DirEncargado);
            sentencia.setDate(7,FecEncargado);
            sentencia.setString(8,StaEncargado);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de insercion...");
        }
    }
    
    public void editarEncargado(String CodEncargado, String DniEncargado,String NomEncargado,String ApeEncargado
    ,String TelEncargado,String DirEncargado, Date FecEncargado,String StaEncargado){
        try {
            conexion = coneccion.conectar();
             String query="UPDATE Encargado SET CodEncargado=?, DniEncargado=?, NomEncargado=?, ApeEncargado =?,"
                     + "TelEncargado=?, DirEncargado=?, FecEncargado=?, StaEncargado=? WHERE CodEncargado=?; ";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1,CodEncargado);
            sentencia.setString(2,DniEncargado);
            sentencia.setString(3,NomEncargado);
            sentencia.setString(4,ApeEncargado);
            sentencia.setString(5,TelEncargado);
            sentencia.setString(6,DirEncargado);
            sentencia.setDate(7,FecEncargado);
            sentencia.setString(8,StaEncargado);
            sentencia.setString(9,CodEncargado);
       
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de actualizacion...");
        }
    }
    
    public void eliminarEncargado(String CodEncargado){
        try {
            conexion = coneccion.conectar();
            String query = "UPDATE Encargado SET Status=? WHERE CodEncargado=?; ";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1,"1");
            sentencia.setString(2,CodEncargado);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de eliminacion...");
        }
    }  
    
    
    
}
