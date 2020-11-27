/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Reporte;
import modelo.Sanciones;

/**
 *
 * @author alejandrodb
 */
@WebServlet(name = "procesa_sancion", urlPatterns = {"/procesa_sancion"})
public class procesa_sancion extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
                Reporte r=new Reporte();
                LinkedList<Reporte> listaReporte; 
                listaReporte=r.listaReporte();
            String Cod_Sancion=request.getParameter("Cod_Sancion");
            String Cod_Reporte=request.getParameter("Cod_Reporte");
            String CodLector="";
            String CodEncargado =request.getParameter("CodEncargado");
            String Cod_Sanc =request.getParameter("Cod_Sanc");
            String Des_Sancion="";
            for(int i=0;i<listaReporte.size();i++){
                if(listaReporte.get(i).getCod_Reporte().equals(Cod_Reporte)){
                    CodLector=listaReporte.get(i).getCodLector();
                    Des_Sancion=listaReporte.get(i).getDes_Reporte();
                    
                }
            }
            
            Sanciones s=new Sanciones();
            
            if(request.getParameter("agregar_sancion")!=null){
                s.agregarSanciones(Cod_Sancion,Cod_Reporte, Cod_Sanc, CodEncargado, CodLector, Des_Sancion);
                r.eliminarReporte(Cod_Reporte);
                request.getRequestDispatcher("menuen.jsp").forward(request, response);
            }
            if(request.getParameter("editar_sancion")!=null)
            {
                s.editarSanciones(Cod_Sancion,Cod_Reporte, Cod_Sanc, CodEncargado, CodLector, Des_Sancion);
                request.getRequestDispatcher("menuen.jsp").forward(request, response);
            }
            if(request.getParameter("eliminar_sancion")!=null)
            {   
                s.eliminarSanciones(Cod_Sancion);
                request.getRequestDispatcher("menuen.jsp").forward(request, response);
            }
        }
    }
}
