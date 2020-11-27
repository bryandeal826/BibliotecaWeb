/*package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alejandrodb

@WebServlet(name = "procesa", urlPatterns = {"/procesa"})
public class procesa extends HttpServlet {
    public static String Logeado,modificar;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        if  (request.getParameter("confirmacion") != null){
            Properties propiedad = new Properties();
            propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
            propiedad.setProperty("mail.smtp.starttls.enable", "true");
            propiedad.setProperty("mail.smtp.port", "587");
            propiedad.setProperty("mail.smtp.auth","true");
            
            Session sesion = Session.getDefaultInstance(propiedad);
            
            String CorreoEnvia="";
            String CorreoContra="";
            String Destinatario=request.getParameter("Correo");
            String Asunto="Confirmacion";
            String Mensanje;
            
            MimeMessage mail=new MimeMessage(sesion);
            try{
                mail.setFrom(new InternetAddress(CorreoEnvia));
                mail.addRecipient(Message.RecipientType.TO,new InternetAddress (Destinatario));
            }catch (AddressException ex){
                
            } catch (MessagingException ex) {
                Logger.getLogger(procesa.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if(request.getParameter("rusuario")!=null)
            {
                request.getRequestDispatcher("usuario_lista.jsp").forward(request, response);

            }
        
        if(request.getParameter("rcliente")!=null)
            {
                request.getRequestDispatcher("cliente_lista.jsp").forward(request, response);

            }
        
        if(request.getParameter("rvuelo")!=null)
            { 
                request.getRequestDispatcher("aerolinea_lista.jsp").forward(request, response);

            }
        
    }


}
*/