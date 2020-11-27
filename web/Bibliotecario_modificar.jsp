<%@page import="modelo.Bibliotecario"%>
<%@page import="modelo.Estado_material"%>
<%@page import="java.util.LinkedList"%>
<%@page import="modelo.Material_B"%>
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
            String CodBiblio =request.getParameter("CodBiblio");
            String NomBiblio   ="",
                   ApeBiblio ="",
                   DniBiblio="",
                   TelBiblio ="",
                   FecBiblio ="",
                   DirBiblio=null;
                Bibliotecario b=new Bibliotecario();
                LinkedList<Bibliotecario> listaBiblio; 
                listaBiblio=b.listaBibliotecario();
            int ub=-1;
            for (int i=0;i<listaBiblio.size();i++){
                if(listaBiblio.get(i).getCodBiblio().equals(CodBiblio)){
                    NomBiblio = listaBiblio.get(i).getNomBiblio();
                    ApeBiblio = listaBiblio.get(i).getApeBiblio();
                    DniBiblio = listaBiblio.get(i).getDniBiblio();
                    TelBiblio = listaBiblio.get(i).getTelBiblio();
                    FecBiblio = listaBiblio.get(i).getFecBiblio();
                    DirBiblio = listaBiblio.get(i).getDirBiblio();
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
                       <form name="form-bibliotecario" method="post" action="procesa_bibliotecario">
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
                                        <input type="text" class="form-control" value="<%=CodBiblio%>" name="CodBiblio" required>
                                    </div>
                                </div>
                                <div class="form-row">
                                   <div class="col-md-7 mb-3">
                                     <label>Nombre:</label>
                                     <input type="text" class="form-control" value="<%=NomBiblio%>" name="NomBiblio" required>
                                   </div>
                                </div>
                                <div class="form-row">
                                    <div class="col-md-7 mb-3">
                                        <label>Apellido:</label>
                                        <input type="text" class="form-control" value="<%=ApeBiblio%>" name="ApeBiblio" required>
                                    </div>
                                </div>
                                <div class="form-row">
                                    <div class="col-md-3 mb-3">
                                        <label>DNI:</label>
                                        <input type="text" class="form-control" value="<%=DniBiblio%>" name="DniBiblio" required>
                                    </div>
                                    <div class="col-md-6 mb-3">
                                        <label>Telefono:</label>
                                        <input type="text" class="form-control" value="<%=TelBiblio%>" name='TelBiblio'  required>
                                    </div>
                                </div>
                                <div class="form-row">
                                    <div class="col-md-6 mb-3">
                                        <label>Fecha de Nacimiento:</label>
                                        <input type="date" class="form-control" value="<%=FecBiblio%>" name='FecBiblio' required>
                                    </div>
                                    <div class="col-md-6 mb-3">
                                        <label>Direccion:</label>
                                        <input type="text" class="form-control" value="<%=DirBiblio%>" name='DirBiblio' required>
                                    </div>
                                </div>
                            </div>
                            <div class="card-footer">
                                <input type="submit" name="editar_bibliotecario" value="Registrar"  class="form-control btn btn-success text white">
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
    
