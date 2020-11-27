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
import modelo.Devolucion;
import modelo.Prestamo;

/**
 *
 * @author alejandrodb
 */
@WebServlet(name = "procesa_devolucion", urlPatterns = {"/procesa_devolucion"})
public class procesa_devolucion extends HttpServlet {
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String CodPrestamo=request.getParameter("CodPrestamo");
            String CodDevolucion=request.getParameter("CodDevolucion");
            String FenDevolucion =request.getParameter("FenDevolucion");
            Prestamo p=new Prestamo();
            Devolucion d=new Devolucion();
            
            if(request.getParameter("agregar_devolucion")!=null){
                p.eliminarPrestamo(CodPrestamo,"1");
                d.agregarDevolucion(CodDevolucion,FenDevolucion,CodPrestamo);
                request.getRequestDispatcher("menubi.jsp").forward(request, response);
            }
            if(request.getParameter("editar_devolucion")!=null)
            {
                d.editarDevolucion(CodDevolucion,CodPrestamo,FenDevolucion);
                request.getRequestDispatcher("menibi.jsp").forward(request, response);
            }
            if(request.getParameter("eliminar_devolucion")!=null)
            {   
                p.eliminarPrestamo(CodPrestamo,"0");
                d.eliminarDevolucion(CodPrestamo);
                request.getRequestDispatcher("menibi.jsp").forward(request, response);
            }
        }
    }
}
