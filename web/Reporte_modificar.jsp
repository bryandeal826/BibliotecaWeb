
<%@page import="modelo.Reporte"%>
<%@page import="java.util.LinkedList"%>
<%@page import="java.sql.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <!--Bootstrap CSS-->
        <link href="Bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>Discovery Books</title>
        <style>
            body{
                font-family: 'Fredoke One',cursive;
                background-image: url(imagenes/MaterialFondo.jpg);
            }
            .card{
                background-color: rgba(255,255,255,.315);
                box-shadow: 5px 8px 8px rgba(100,100,100,0.6);
            }
        </style>
                </head>
                <body><br><br>
        <%
            String Cod_Reporte =request.getParameter("Cod_Reporte");
            String CodLector ="",
                   CodBiblio ="",
                   Des_Reporte ="";
                Reporte r=new Reporte();
                LinkedList<Reporte> listaReporte; 
                listaReporte=r.listaReporte();
            for (int i=0;i<listaReporte.size();i++){
                if(listaReporte.get(i).getCodBiblio().equals(Cod_Reporte)){ 
                    CodLector = listaReporte.get(i).getCodLector();
                    CodBiblio = listaReporte.get(i).getCodBiblio();
                    Des_Reporte = listaReporte.get(i).getDes_Reporte();
                }
            }%>

        
        <div class="row">
            <div class="col text-center">
                    <h1 class="text-white display-4">Material Bibliografico</h1>
            </div>
            
        </div><br>
        <div class="container">    
            <div class="row">
               <div class="col-sm-3"></div>
                   <div class="card text-white">
                       <form name="form-reporte" method="post" action="procesa_reporte">
                            <div class="card-header">
                               <div class="row">
                                   <span style="margin-left: 89%">
                                       <a class="btn btn-danger btn-sm" method="post" href="Bibliotecario.jsp">Atras</a>
                                   </span>
                               </div>
                            </div>
                            <div class="card-body">
                                <div class="form-row">
                                    <div class="col-sm-4 mb-2">
                                        <label>Codigo:</label>
                                        <input type="text" class="form-control" value="<%=CodBiblio%>" name="Cod_Reporte" readonly>
                                    </div>
                                </div>
                                <div class="form-row">
                                   <div class="col-md-7 mb-3">
                                     <label>Lector:</label>
                                     <input type="text" class="form-control" value="<%=CodLector%>" name="CodLector" required>
                                   </div>
                                </div>
                                <div class="form-row">
                                    <div class="col-md-7 mb-3">
                                        <label>Bibliotecario:</label>
                                        <input type="text" class="form-control" value="<%=CodBiblio%>" name="CodBiblio" required>
                                    </div>
                                </div>
                                <div class="form-row">
                                    <div class="col-md-3 mb-3">
                                        <label>Descripcion</label>
                                        <textarea class="form-control" name="Des_Reporte" rows="3" cols="5"><%=Des_Reporte%></textarea>
                                    </div>
                                </div>
                            </div>
                            <div class="card-footer">
                                <input type="submit" name="editar_reporte" value="Registrar"  class="form-control btn btn-success text white">
                            </div>
                        </form>
                    </div>
               <div class="col-sm-1"></div>
           </div>
        </div>
         <!--Scripts-->
        <script src="Bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="jquery/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="popper/popper.min.js" type="text/javascript"></script>                            
    </body>
</html>
    
