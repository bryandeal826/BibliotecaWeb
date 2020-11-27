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
import modelo.Reporte;

/**
 *
 * @author alejandrodb
 */
@WebServlet(name = "procesa_reporte", urlPatterns = {"/procesa_reporte"})
public class procesa_reporte extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String Cod_Reporte=request.getParameter("Cod_Reporte");
            String CodLector=request.getParameter("CodLector");
            String CodBiblio=request.getParameter("CodBiblio");
            String Des_Reporte =request.getParameter("Des_Reporte");
            String Sta_Reporte =request.getParameter("Sta_Reporte");
                Reporte r=new Reporte();
            
            if(request.getParameter("agregar_reporte")!=null){
                r.agregarReporte(Cod_Reporte, CodLector , CodBiblio, Des_Reporte, Sta_Reporte);
                request.getRequestDispatcher("Reporte.jsp").forward(request, response);
            }
            if(request.getParameter("editar_reporte")!=null)
            {
                r.editarReporte(Cod_Reporte,CodBiblio, CodLector, Des_Reporte, Sta_Reporte);
                request.getRequestDispatcher("Reporte.jsp").forward(request, response);
            }
            if(request.getParameter("eliminar_reporte")!=null)
            {   
                r.eliminarReporte(Cod_Reporte);
                request.getRequestDispatcher("Reporte.jsp").forward(request, response);
            }
        }
    }
}
