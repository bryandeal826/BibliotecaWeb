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
import modelo.Material_B;

/**
 *
 * @author alejandrodb
 */
@WebServlet(name = "procesa_material", urlPatterns = {"/procesa_material"})
public class procesa_material extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String CodMate_biblio=request.getParameter("CodMate_biblio");
            String CodEsta_mate=request.getParameter("CodEsta_mate");
            String NomMate_biblio =request.getParameter("NomMate_biblio");
            String AutMate_biblio =request.getParameter("AutMate_biblio");
            String EditMate_biblio =request.getParameter("EditMate_biblio");
            String EdiMate_biblio =request.getParameter("EdiMate_biblio");
            String FePMate_biblio =request.getParameter("FePMate_biblio");
            Material_B m=new Material_B();
            
            
            if(request.getParameter("agregar_material")!=null){
                m.agregarMaterial(CodMate_biblio,CodEsta_mate,NomMate_biblio,AutMate_biblio,EditMate_biblio,EdiMate_biblio,FePMate_biblio);
                request.getRequestDispatcher("menubi.jsp").forward(request, response);
            }
            if(request.getParameter("editar_material")!=null)
            {
                m.editarMaterial(CodMate_biblio,CodEsta_mate,NomMate_biblio,AutMate_biblio,EditMate_biblio,EdiMate_biblio,FePMate_biblio);
                request.getRequestDispatcher("menubi.jsp").forward(request, response);
            }
            if(request.getParameter("eliminar_material")!=null)
            {   
                m.eliminarMaterial(CodMate_biblio);
                request.getRequestDispatcher("menubi.jsp").forward(request, response);
            }
        }
    }
}
