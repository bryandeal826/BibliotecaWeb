/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Bibliotecario;
import modelo.Encargado;

import modelo.Lector;
import modelo.Usuario;
/**
 *
 * @author alejandrodb
 */
@WebServlet(name = "procesa_lector", urlPatterns = {"/procesa_lector"})
public class procesa_lector extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String CodUsuario=request.getParameter("CodUsuario");
            String PassUsuario=request.getParameter("PassUsuario");
            String DniLector =request.getParameter("DniLector");
            String NomLector =request.getParameter("NomLector");
            String ApeLector =request.getParameter("ApeLector");
            String TelLector =request.getParameter("TelLector");
            String DirLector =request.getParameter("DirLector");
            String FecLector =request.getParameter("FecLector");
            String StaUsuario =request.getParameter("StaUsuario");
            Usuario u=new Usuario();
            Lector l=new Lector();
            
            if(request.getParameter("agregar_lector")!=null){
                u.agregarUsuario(CodUsuario, PassUsuario, StaUsuario);
                l.agregarLector(CodUsuario,DniLector,NomLector,ApeLector,TelLector,DirLector,FecLector,StaUsuario);
                if(autentica.Logeado!=null){request.getRequestDispatcher("menubi.jsp").forward(request, response);}
                else request.getRequestDispatcher("index.jsp").forward(request, response);
            }
            if(request.getParameter("editar_lector")!=null)
            {
                u.agregarUsuario(CodUsuario, PassUsuario,StaUsuario);
                l.editarLector(CodUsuario, DniLector, NomLector,ApeLector,TelLector,DirLector,FecLector,StaUsuario);
                request.getRequestDispatcher("menubi.jsp").forward(request, response);
            }
            if(request.getParameter("eliminar_lector")!=null)
            {   
                u.eliminarUsuario(CodUsuario);
                l.eliminarLector(CodUsuario);
                request.getRequestDispatcher("menubi.jsp").forward(request, response);
            }
        }
    }
}
