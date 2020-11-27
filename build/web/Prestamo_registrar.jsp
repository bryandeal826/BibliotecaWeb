

<%@page import="modelo.Lector"%>
<%@page import="java.util.LinkedList"%>
<%@page import="modelo.Material_B"%>
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
                background-image: url(imagenes/descarga.png);
            }
            .card{
                background-color: rgba(0,0,0,.315);
                box-shadow: 5px 8px 8px rgba(100,100,100,0.6);
            }
        </style>
    </head>
    <body>
        <%
            Material_B m=new Material_B();
            LinkedList<Material_B> listaMaterial_B;
            listaMaterial_B=m.listaMaterial();
            
            Lector l=new Lector();
            LinkedList<Lector> listaLectora;
            listaLectora=l.listaLector();
        %>
        <br><br><br><br>
        <div class="row">
            <div class="col-sm-3"></div>
            <div class="form-row">
                <div class="card text-white" style="width: 700px">
                    <div class="card-body">
                        <form name="form-prestamo" method="post" action="procesa_prestamo">
                            <div class="form-row">
                                <div class="col-md-4 mb-3">
                                  <label>Codigo</label>
                                  <input type="text" class="form-control" placeholder="PR#####" name="CodPrestamo" required>
                                </div>
                                <div class="col-md-7 mb-1"></div>
                                <div class="col-md-1 mb-1">
                                <a class="boton btn btn-danger btn-sm" method="post" href="Prestamo.jsp">Atras</a>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="col-md-6 mb-3">
                                  <label>Material</label>
                                  <select name="CodMate_biblio" class="form-control">
                                      <option value="">Seleccionar</option>
                                      <%for(int i=0;i<listaMaterial_B.size();i++){%>
                                          <%if(listaMaterial_B.get(i).getCodEsta_mate().equals("EM00000")){%>
                                              <option value="<%= listaMaterial_B.get(i).getCodMate_biblio()%>"><%= listaMaterial_B.get(i).getNomMate_biblio() %></option>
                                          <%}%>
                                      <%}%>
                                  </select>
                                </div>
                                <div class="col-md-6 mb-3">
                                  <label>Codigo Lector</label>
                                  <select name="CodLector" class="form-control">
                                      <option value="">Seleccionar</option>
                                      <%for(int i=0;i<listaLectora.size();i++){%>
                                          <%if(listaLectora.get(i).getStaLector().equals("0")){%>
                                              <option value="<%= listaLectora.get(i).getCodLector()%>"><%= listaLectora.get(i).getNomLector() %></option>
                                          <%}%>
                                      <%}%>
                                      <%--for(int j=0;j<listaLectora.size();j++){%>
                                          <%if(listaLectora.get(j).getStaLector().equals("0")){%>
                                              <option value="<%= listaLectora.get(j).getCodLector()%>"><%= listaLectora.get(j).getNomLector() %></option>
                                          <%}%>
                                      <%}--%>
                                  </select>
                                </div>
                            </div>
                            <div class="form-row">
                                <input type="hidden" name="CodBiblio" value="<%=autentica.Logeado%>">
                                <div class="col-md-4 mb-3">
                                    <label>Fecha de Prestamo</label>
                                  <input type="date" class="form-control"  name='FpPrestamo'  required>
                                </div>
                                <div class="col-md-2 mb-1"></div>
                                <div class="col-md-4 mb-3">
                                    <label>Fecha de Entrega</label>
                                  <input type="date" class="form-control" name='FePrestamo' required>
                                </div>
                                <input type="hidden" value="0" name="StaPrestamo">
                            </div><br>
                            <input type="submit" name="agregar_prestamo" value="Ingresar" style="width: 100%" class="form-control btn btn-success text white"><br><br> 
                        </form>
                    </div>
                </div>
            </div>
        </div>
         <!--Scripts-->
        <script src="Bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="jquery/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="popper/popper.min.js" type="text/javascript"></script>                        
    </body>
</html>
