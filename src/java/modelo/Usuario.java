package modelo;

import modelo.coneccion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;


public class Usuario {
    private String CodUsuario;
    private String PassUsuario;
    private String TipUsuario;
    private Connection conexion;

    public String getCodUsuario() {
        return CodUsuario;
    }

    public void setCodUsuario(String CodUsuario) {
        this.CodUsuario = CodUsuario;
    }
    
    public String getPassUsuario() {
        return PassUsuario;
    }

    public void setPassUsuario(String PassUsuario) {
        this.PassUsuario = PassUsuario;
    }

    public String getTipUsuario() {
        return TipUsuario;
    }

    public void setTipUsuario(String TipUsuario) {
        this.TipUsuario = TipUsuario;
    }

    public Usuario() {
    }
    
    
    public int autoriza(String usr, String psw,String stt){
        int log =0;
        try {
            conexion = coneccion.conectar();
            String query = "SELECT * FROM Usuario ";
            query = query + "WHERE CodUsuario='" + usr + "'";
            query = query + "AND PassUsuario='" + psw + "'";
            query = query + "AND StaUsuario='" + stt + "';";
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(query);
            LinkedList<Usuario> lista;
            lista = new LinkedList<Usuario>();
            while(resultado.next()){
                Usuario u = new Usuario();
                u.setCodUsuario(resultado.getString("CodUsuario"));
                u.setPassUsuario(resultado.getString("PassUsuario"));
                u.setPassUsuario(resultado.getString("StaUsuario"));
                lista.add(u);
            }
            conexion.close();
            if(lista.size()==1){
                log = 1;
            } else {
                log = 0;
            }
            
        } catch (Exception e) {
            
        }
        return log;
    }
     
    
    public LinkedList<Usuario> listaUsuario(){
        try {
            conexion = coneccion.conectar();
            String query = "SELECT * FROM Usuario; ";
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(query);
            LinkedList<Usuario> lista3;
            lista3 = new LinkedList<Usuario>();
            while(resultado.next()){
                Usuario t = new Usuario(); 
                t.setCodUsuario(resultado.getString("CodUsuario"));
                t.setPassUsuario(resultado.getString("PassUsuario"));
                t.setPassUsuario(resultado.getString("StaUsuario"));
                lista3.add(t);
            }
            conexion.close();
            return lista3;
        } catch (Exception e) {
            System.out.println("Problema de conexion...");
        }
        return null;
    }
        
    public void agregarUsuario(String CodUsuario,String PassUsuario,String StaUsuario)
     {
        try {
            conexion = coneccion.conectar();
            String query = "INSERT INTO Usuario VALUES(?,?,?)";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1, CodUsuario);
            sentencia.setString(2, PassUsuario);
            sentencia.setString(3, StaUsuario);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de insercion...");
        }
    }
    
    public void editarUsuario(String CodUsuario, String PassUsuario, String StaUsuario){
        try {
            conexion = coneccion.conectar();
             String query="UPDATE Usuario SET CodUsuario=?,PassUsuario=?,StaUsuario=? WHERE CodUsuario=?; ";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1,CodUsuario);
            sentencia.setString(2,PassUsuario);
            sentencia.setString(3,StaUsuario);
            sentencia.setString(4,CodUsuario);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de actualizacion...");
        }
    }
    
    public void eliminarUsuario(String CodUsuario){
        try {
            conexion = coneccion.conectar();
            String query = "UPDATE Usuario SET StaUsuario=? WHERE CodUsuario=?; ";
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1,"1");
            sentencia.setString(2,CodUsuario);
            sentencia.executeUpdate();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problemas de eliminacion...");
        }
    }  
}
