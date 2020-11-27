
<%@page import="java.util.LinkedList"%>
<%@page import="modelo.Lector"%>
<%@page import="controlador.autentica"%>
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
                background-image: url(imagenes/fondobiblio.jpg);
            }
            .card{
                background-color: rgba(0,0,0,.315);
                box-shadow: 5px 8px 8px rgba(100,100,100,0.6);
            }
        </style>
    </head>
    <body><br><br><br><br>
        <%            
            Lector l=new Lector();
            LinkedList<Lector> listaLector;
            listaLector=l.listaLector();
        %>
        <div class="row">
                <div class="col-sm-4"></div>
            <div class="form-row">
                <div class="card text-white">
                    <form name="form-reporte" method="post" action="procesa_reporte">
                        <div class="card-header">
                            <h2 style="text-align: center">Registro de Reporte</h2>
                        </div>
                        <div class="card-body">
                            <div class="form-row">
                                <div class="col-md-5 mb-3">
                                  <label>Codigo del Reporte</label>
                                  <input type="text" class="form-control" placeholder="RE#####" name="Cod_Reporte" required>
                                </div>
                            </div>    
                            <div class="form-row">
                                <div class="col-md-6 mb-3">
                                  <label>Codigo Lector</label>
                                  <select name="CodLector" class="form-control">
                                      <option value="">Seleccionar</option>
                                      <%for(int i=0;i<listaLector.size();i++){%>
                                          <%if(listaLector.get(i).getStaLector().equals("0")){%>
                                              <option value="<%= listaLector.get(i).getCodLector()%>"><%= listaLector.get(i).getNomLector() %></option>
                                          <%}%>
                                      <%}%>
                                  </select>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="col-md-6 mb-4">
                                    <label>Codigo del Bibliotecario</label>
                                    <input type="text" class="form-control" value="<%=autentica.Logeado%>" name="CodBiblio" readonly="readonly">
                                </div>
                            </div>    
                            <div class="form-row">
                                <div class="col-md-12 mb-3">
                                    <label>Descripcion</label>
                                    <textarea class="form-control" name="Des_Reporte" required></textarea>
                                </div>
                                <input type="hidden" value="0" name="Sta_Reporte" required>
                            </div>
                            
                        </div>
                        <div class="card-footer">
                            <div class="form-row">
                                <div class="col-md-2 mb-4"></div>
                                <div class="col-md-4 mb-4">
                                    <input type="submit" name="agregar_reporte" value="Ingresar" class="form-control btn btn-success text white">
                                </div>
                                <div class="col-md-3 mb-4"></div>
                                <div class="col-md-1 mb-1">
                                    <a class="boton btn btn-danger btn-sm" method="post" href="menubi.jsp">Atras</a>
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
