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
import modelo.Prestamo;
import modelo.Material_B;

/**
 *
 * @author alejandrodb
 */
@WebServlet(name = "procesa_prestamo", urlPatterns = {"/procesa_prestamo"})
public class procesa_prestamo extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String CodPrestamo=request.getParameter("CodPrestamo");
            String CodMate_biblio=request.getParameter("CodMate_biblio");
            String CodLector =request.getParameter("CodLector");
            String FpPrestamo =request.getParameter("FpPrestamo");
            String FePrestamo =request.getParameter("FePrestamo");
            String StaPrestamo =request.getParameter("StaPrestamo");
            Prestamo p=new Prestamo();
            if(request.getParameter("agregar_prestamo")!=null){
                
                p.agregarPrestamo(CodPrestamo,CodMate_biblio,CodLector,FpPrestamo,FePrestamo,StaPrestamo);
                
                request.getRequestDispatcher("menubi.jsp").forward(request, response);
            }
            if(request.getParameter("editar_prestamo")!=null)
            {
                p.agregarPrestamo(CodPrestamo,CodMate_biblio,CodLector,FpPrestamo,FePrestamo,StaPrestamo);
                request.getRequestDispatcher("menubi.jsp").forward(request, response);
            }
            if(request.getParameter("eliminar_prestamo")!=null)
            {   
                p.eliminarPrestamo(CodPrestamo,StaPrestamo);
                request.getRequestDispatcher("menubi.jsp").forward(request, response);
            }
        }
    }
}
