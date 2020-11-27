

<%@page import="modelo.Estado_material"%>
<%@page import="java.util.LinkedList"%>
<%@page import="modelo.Lector"%>
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
            
            String CodLector =request.getParameter("CodLector");
            String NomLector   ="",
                   ApeLector ="",
                   DniLector="",
                   TelLector ="",
                   DirLector ="",
                   FecLector=null;
                Lector l=new Lector();
                LinkedList<Lector> listaLector; 
                listaLector=l.listaLector();
            int ub=-1;
        
            for (int i=0;i<listaLector.size();i++){
                if(listaLector.get(i).getCodLector().equals(CodLector)){
                    NomLector = listaLector.get(i).getNomLector();
                    ApeLector = listaLector.get(i).getApeLector();
                    DniLector = listaLector.get(i).getDniLector();
                    TelLector = listaLector.get(i).getTelLector();
                    DirLector = listaLector.get(i).getDirLector();
                    FecLector = listaLector.get(i).getFecLector();
                }
            }
            
            Estado_material em = new Estado_material();
            LinkedList<Estado_material> listaEstado;
            listaEstado = em.listaEstado_material();
                %>

        
        <div class="row">
            <div class="col text-center">
                    <h1 class="text-white display-4">Material Bibliografico</h1>
            </div>
            
        </div><br>
        <div class="container">    
            <div class="row">
               <div class="col-sm-3"></div>
                   <div class="card text-white">
                       <form name="form-lector" method="post" action="procesa_lector">
                            <div class="card-header">
                               <div class="row">
                                   <span style="margin-left: 89%">
                                       <a class="btn btn-danger btn-sm" method="post" href="Material.jsp">Atras</a>
                                   </span>
                               </div>
                            </div>
                            <div class="card-body">
                                <div class="form-row">
                                    <div class="col-sm-4 mb-2">
                                        <label>Codigo:</label>
                                        <input type="text" class="form-control" value="<%=CodLector%>" name="CodMate_biblio" required>
                                    </div>
                                </div>
                                <div class="form-row">
                                   <div class="col-md-10 mb-3">
                                     <label>Titulo del libro:</label>
                                     <input type="text" class="form-control" value="<%=NomLector%>" name="NomMate_biblio" required>
                                   </div>
                                </div>
                                <div class="form-row">
                                    <div class="col-md-5 mb-3">
                                        <label>Autor:</label>
                                        <input type="text" class="form-control" value="<%=ApeLector%>" name="AutMate_biblio" required>
                                    </div>
                                    <div class="col-md-3 mb-3">
                                        <label>Edición:</label>
                                        <input type="text" class="form-control" value="<%=DniLector%>" name="EdiMate_biblio" required>
                                    </div>
                                </div>
                                <div class="form-row">
                                    <div class="col-md-8 mb-3">
                                        <label>Estado:</label>
                                        <select name="CodEsta_mate" class="form-control">
                                            <%for(int i=0;i<listaEstado.size();i++){%>
                                                <option value="<%= listaEstado.get(i).getCodEsta_mate()%>"><%= listaEstado.get(i).getDesEst_mate()%></option>
                                            <%}%>
                                        </select>
                                    </div>
                                </div>
                                
                                <div class="form-row">
                                    <div class="col-md-3 mb-3">
                                        <label>Editorial:</label>
                                        <input type="text" class="form-control" value="<%=TelLector%>" name='EditMate_biblio'  required>
                                    </div>
                                    <div class="col-md-6 mb-3">
                                        <label>Editorial:</label>
                                        <input type="text" class="form-control" value="<%=DirLector%>" name='EditMate_biblio'  required>
                                    </div>
                                    
                                </div>
                                <div class="form-row">
                                    <div class="col-md-6 mb-3">
                                        <label>Fecha de Publicacion:</label>
                                        <input type="date" class="form-control" value="<%=FecLector%>" name='FePMate_biblio' required>
                                    </div>
                                </div>
                            </div>
                            <div class="card-footer">
                                <input type="submit" name="eliminar_lector" value="Registrar"  class="form-control btn btn-success text white">
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
    
