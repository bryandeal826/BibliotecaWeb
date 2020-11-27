package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Usuario;

/**
 *
 * @author alejandrodb
 */
@WebServlet(name = "autentica", urlPatterns = {"/autentica"})
public class autentica extends HttpServlet {
    public static String Logeado;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
                 Usuario us = new Usuario();
        String usuario = request.getParameter("usuario");
        String Menu=usuario.substring(0,2);
        String password = request.getParameter("password");
        int log = us.autoriza(usuario,password,"0");
        if(log==1){
            HttpSession session = request.getSession();
            session.setAttribute("logueado", us);
            autentica.Logeado=usuario;
            request.getRequestDispatcher("menu.jsp").forward(request, response);/*
            if(Menu.equals("LE"))request.getRequestDispatcher("menule.jsp").forward(request, response);
            if(Menu.equals("BI"))request.getRequestDispatcher("menubi.jsp").forward(request, response);
            if(Menu.equals("EN"))request.getRequestDispatcher("menuen.jsp").forward(request, response);*/
        }else {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        }
    }

}
