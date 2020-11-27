
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
            
            String CodMate_biblio =request.getParameter("CodMate_biblio");
            String CodEsta_mate   ="",
                   AutMate_biblio ="",
                   EditMate_biblio="",
                   EdiMate_biblio ="",
                   NomMate_biblio ="",
                   FePMate_biblio=null;
                Material_B m=new Material_B();
                LinkedList<Material_B> listaMaterial_B; 
                listaMaterial_B=m.listaMaterial();
                int ub=-1;
            for (int i=0;i<listaMaterial_B.size();i++){
                if(listaMaterial_B.get(i).getCodMate_biblio().equals(CodMate_biblio)){
                    CodEsta_mate  = listaMaterial_B.get(i).getCodEsta_mate();
                    AutMate_biblio = listaMaterial_B.get(i).getAutMate();
                    EditMate_biblio= listaMaterial_B.get(i).getEditMate();
                    EdiMate_biblio = listaMaterial_B.get(i).getEdiMate();
                    NomMate_biblio = listaMaterial_B.get(i).getNomMate_biblio();
                    FePMate_biblio=listaMaterial_B.get(i).getFePMate();
                }
            }
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
                       <form name="form-material" method="post" action="procesa_material">
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
                                        <input type="text" class="form-control" value="<%=CodMate_biblio%>" name="CodMate_biblio" readonly>
                                    </div>
                                </div>
                                <div class="form-row">
                                   <div class="col-md-10 mb-3">
                                     <label>Titulo del libro:</label>
                                     <input type="text" class="form-control" value="<%=NomMate_biblio%>" name="NomMate_biblio" readonly>
                                   </div>
                                </div>
                                <div class="form-row">
                                    <div class="col-md-8 mb-3">
                                        <label>Estado:</label>
                                        <input name="CodEsta_mate" value="<%=CodEsta_mate%>" class="form-control" readonly>
                                    </div>
                                </div>
                                <div class="form-row">
                                    <div class="col-md-5 mb-3">
                                        <label>Autor:</label>
                                        <input type="text" class="form-control" value="<%=AutMate_biblio%>" name="AutMate_biblio" readonly>
                                    </div>
                                    <div class="col-md-3 mb-3">
                                        <label>Edición:</label>
                                        <input type="text" class="form-control" value="<%=EdiMate_biblio%>" name="EdiMate_biblio" readonly>
                                    </div>
                                </div>
                                <div class="form-row">
                                    <div class="col-md-6 mb-3">
                                        <label>Editorial:</label>
                                        <input type="text" class="form-control" value="<%=EditMate_biblio%>" name='EditMate_biblio'  readonly>
                                    </div>
                                    <div class="col-md-6 mb-3">
                                        <label>Fecha de Publicacion:</label>
                                        <input type="date" class="form-control" value="<%=FePMate_biblio%>" name='FePMate_biblio' readonly>
                                    </div>
                                </div>
                            </div>
                            <div class="card-footer">
                                <input type="submit" name="eliminar_material" value="Registrar"  class="form-control btn btn-success text white">
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
    
