
<%@page import="controlador.autentica"%>
<%@page import="java.util.LinkedList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.Prestamo"%>
<%@page import="modelo.Lector"%>
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
                background-image: url(imagenes/fondobiblio.jpg);
            }
            .card{
                background-color: rgba(0,0,0,.315);
                box-shadow: 5px 8px 8px rgba(100,100,100,0.6);
            }
        </style>
        <%
            Prestamo p = new Prestamo();
            LinkedList<Prestamo> listaPrestamo;
            listaPrestamo = p.listaPrestamo();
            
            Lector l=new Lector();
            LinkedList<Lector> listaLector;
            listaLector=l.listaLector();
            
        %>
    </head>
    <body><br><br><br><br>
        <div class="row">
            <div class="col-sm-3"></div>
            <div class="form-row">
                <div class="card text-white" style="width: 500px" >
                    <form name="form-devolucion" method="post" action="procesa_devolucion">
                        <div class="card-header">
                            <h2 style="text-align: center">Registro de Devoluciones</h2>
                        </div>
                        <div class="card-body">
                            <div class="form-row">
                                <div class="col-md-6 mb-3">
                                  <label>Codigo</label>
                                  <input type="text" class="form-control" placeholder="DV#####" name="CodDevolucion" required>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="col-md-4 mb-3">
                                    <label>Prestamo</label>
                                    <select name="CodPrestamo" class="form-control" required="">
                                      <option value="">Seleccionar</option>
                                      <%for(int i=0;i<listaPrestamo.size();i++){%>
                                          <%if(listaPrestamo.get(i).getStaPrestamo().equals("0")){%>
                                              <option value="<%= listaPrestamo.get(i).getCodPrestamo()%>"><%= listaPrestamo.get(i).getCodPrestamo()%></option>
                                          <%}%>
                                      <%}%>
                                  </select>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="col-md-5 mb-3">
                                    <label>Fecha de Entrega</label>
                                    <input type="date" class="form-control" name="FenDevolucion" required>
                                </div>
                            </div>
                        </div>
                        <div class="card-footer">
                            <div class="form-row">
                                <div class="col-md-1 mb-4"></div>
                                <div class="col-md-6 mb-4">
                                    <input type="submit" name="agregar_devolucion" value="Ingresar"  class="form-control btn btn-success">
                                </div>
                                <div class="col-md-1 mb-4"></div>
                                <div class="col-md-4 mb-4">
                                    <a class="form-control btn btn-danger btn-sm " method="post" href="menubi.jsp">Atras</a>
                                </div>    
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
         <!--Scripts-->
        <script src="Bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="jquery/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="popper/popper.min.js" type="text/javascript"></script>                          
    </body>
</html>
