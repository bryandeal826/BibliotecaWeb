
<%@page import="modelo.Devolucion"%>
<%@page import="modelo.Encargado"%>
<%@page import="modelo.Lector"%>
<%@page import="modelo.Sanciones"%>
<%@page import="java.util.LinkedList"%>
<%@page import="modelo.Tipo_sancion"%>
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
        <%
            Devolucion d=new Devolucion();
            LinkedList<Devolucion> listaDevolucion; 
            listaDevolucion=d.listaDevolucion();
            String CodDevolucion=request.getParameter("CodDevolucion");
            String CodPrestamo="";
            String FenDevolucion="";
            int ud=0;
            for(int i=0;i<listaDevolucion.size();i++){
                if(listaDevolucion.get(i).getCodDevolucion().equals(CodDevolucion)){
                    CodPrestamo=listaDevolucion.get(i).getCodPrestamo();
                    FenDevolucion=listaDevolucion.get(i).getFenDevolucion();
                    ud=i;
                }
            }
            
        %>
    </head>
    <body><br><br>
        <div class="container justify-content-xl-center">
        <div class="row-title">
            <div class="col-12 text-center">
                <div class="container cont-title">
                    <h1 class="text-white display-4">Devolucion de Material</h1>
                </div>                
            </div>
            
        </div><br><br>
         <div class="row ">
             <span style="margin-left: 13%"></span>
            <div class="col-sm-1 col-12"></div>
                <div class="card text-white" style="width: 650px; height: 450px">
                    <div class="card-body">
                        <form name="form-devolucion" method="post" action="procesa_devolucion">
                            <div class="form-row">
                                <div class="col-md-4 mb-3">
                                  <label>Codigo:</label>
                                  <input type="text" class="form-control" value="<%=CodDevolucion%>" name="CodDevolucion" required>
                                </div>
                                <div class="col-md-6 mb-1"></div>
                                <div class="col-md-1 mb-1">
                                <a class="boton btn btn-danger btn-sm" method="post" href="menubi.jsp">Atras</a>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="col-md-10 mb-3">
                                  <label>Prestamo</label>
                                    <select name="CodPrestamo" class="form-control" required>
                                        <option value="<%=CodPrestamo%>"><%=listaDevolucion.get(ud).getCodPrestamo()%></option>
                                        <%for(int i=0;i<listaDevolucion.size();i++){%>
                                            <%if(i!=ud){%>
                                                <option value="<%=listaDevolucion.get(i).getCodPrestamo()%>"><%=listaDevolucion.get(i).getCodPrestamo()%></option>
                                            <%}%>
                                        <%}%>
                                    </select>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="col-md-6 mb-3">
                                  <label>Fecha de Entrega</label>
                                  <input type="date" name="FenDevolucion" class="form-control" value="<%=FenDevolucion%>" required>
                                </div>
                            </div><br>
                            <input type="submit" name="editar_devolucion" value="Ingresar"  class="form-control btn btn-success text white"><br><br> 
                        </form>
                    </div>
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
