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
import modelo.Usuario;
/**
 *
 * @author alejandrodb
 */
@WebServlet(name = "procesa_bibliotecario", urlPatterns = {"/procesa_bibliotecario"})
public class procesa_bibliotecario extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String CodUsuario=request.getParameter("CodUsuario");
            String PassUsuario=request.getParameter("PassUsuario");
            String DniBiblio =request.getParameter("DniBiblio");
            String NomBiblio =request.getParameter("NomBiblio");
            String ApeBiblio =request.getParameter("ApeBiblio");
            String TelBiblio =request.getParameter("TelBiblio");
            String DirBiblio =request.getParameter("DirBiblio");
            String EdadBiblio =request.getParameter("EdadBiblio");
            String StaUsuario =request.getParameter("StaUsuario");
            Usuario u=new Usuario();
            Bibliotecario b=new Bibliotecario();
            
            if(request.getParameter("agregar_bibliotecario")!=null){
                u.agregarUsuario(CodUsuario, PassUsuario, StaUsuario);
                    b.agregarBibliotecario(CodUsuario,DniBiblio,NomBiblio,ApeBiblio,TelBiblio,DirBiblio,EdadBiblio,StaUsuario);
                    request.getRequestDispatcher("menuen.jsp").forward(request, response);

                if(autentica.Logeado==null){}
                else request.getRequestDispatcher("menule.jsp").forward(request, response);
            }
            if(request.getParameter("editar_bibliotecario")!=null)
            {
                u.agregarUsuario(CodUsuario, PassUsuario,StaUsuario);
               b.editarBibliotecario(CodUsuario, DniBiblio, NomBiblio,ApeBiblio,TelBiblio,DirBiblio,EdadBiblio,StaUsuario);
                request.getRequestDispatcher("menuen.jsp").forward(request, response);
            }
            if(request.getParameter("eliminar_bibliotecario")!=null)
            {   
                u.eliminarUsuario(CodUsuario);
                b.eliminarBibliotecario(CodUsuario);
                request.getRequestDispatcher("menuen.jsp").forward(request, response);
            }
        }
    }
}
