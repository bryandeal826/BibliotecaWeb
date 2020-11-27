

<%@page import="java.util.LinkedList"%>
<%@page import="modelo.Reporte"%>
<%@page import="controlador.autentica"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">

	<!-- Bootstrap -->
        <link href="Bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        
        <!--CSS Propio-->
        <link href="Estilos/main.css" rel="stylesheet" type="text/css"/>
        
	<!-- Datatables -->
        <link href="DataTable/datatables.min.css" rel="stylesheet" type="text/css"/>
        <link href="DataTable/DataTables-1.10.22/css/dataTables.bootstrap4.min.css" rel="stylesheet" type="text/css"/>

        <!--font awesome con CDN-->  
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" 
              integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" 
              crossorigin="anonymous">  
	<script>
        	$(document).ready(function() {
            $('#tabla').DataTable();
	} );
            
	</script>

        <style>
            body{
                font-family: 'Fredoke One',cursive;
                background-image: url(imagenes/fondo-borroso-libros.jpg);
            }
            .table{
                background-color: rgba(0,0,0,.315);
                box-shadow: 5px 8px 8px rgba(100,100,100,0.6);
            }
	</style>
        <title>Discovery Books</title>
    </head>
    <body><br><br><br>
        <div class="container">
            <%
                Reporte r=new Reporte();
                LinkedList<Reporte> listaReporte; 
                listaReporte=r.listaReporte();
            %>
            <table id="tabla" class="table table-bordered table-light table-striped">
                <thead style="background: black" class="text-white">
                    <tr>
                    <%if(autentica.Logeado.substring(0,2).equals("LE")){%>
                        <td>Codigo</td>
                        <td>Bibliotecario</td>
                        <td>Observacion</td>
                    <%}else{%>
                        <td>Codigo</td>
                        <td>Lector</td>
                        <td>Bibliotecario</td>
                        <td>Observacion</td>
                    <%}%>
                    </tr>
                </thead>
                <tbody style="background: rgba(162,142,168,.75)" class=" bordered">
                    <%if(autentica.Logeado.substring(0,2).equals("LE")){
                        for (int i=0;i<listaReporte.size(); i++){%> 
                        <% if(listaReporte.get(i).getCodLector().equals(autentica.Logeado)){ %>
                                <tr>
                                    <td><%=listaReporte.get(i).getCod_Reporte()%></td>
                                    <td><%=listaReporte.get(i).getCodBiblio()%></td>
                                    <td><%=listaReporte.get(i).getDes_Reporte()%></td>
                                </tr>
                            <% } %>
                        <% } %>
                    <%}else{%>
                        <%for (int i=0;i<listaReporte.size(); i++){%> 
                            <tr>
                                <td><%=listaReporte.get(i).getCod_Reporte()%></td>
                                <td><%=listaReporte.get(i).getCodLector()%></td>
                                <td><%=listaReporte.get(i).getCodBiblio()%></td>
                                <td><%=listaReporte.get(i).getDes_Reporte()%></td>
                            </tr>
                        <%}%>
                    <%}%>
                </tbody>
            </table>
            <div class="row">
                <span style="margin-left: 45%">
                    <%if(autentica.Logeado.substring(0,2).equals("EN")){%>
                        <a class="btn btn-danger btn-sm" method="post" href="menuen.jsp">Atras</a>
                    <%}else{%>
                        <a class="btn btn-danger btn-sm" method="post" href="Reporte.jsp">Atras</a>
                    <%}%>
                </span>
            </div>
        </div>
                 <script src="jquery/jquery-3.3.1.min.js" type="text/javascript"></script>
                <script src="popper/popper.min.js" type="text/javascript"></script>
                <script src="Bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
                  
                <!--DataTables-->
                <script src="DataTable/datatables.min.js" type="text/javascript"></script>
                
                <!--Botones -->
                <script src="DataTable/Buttons-1.6.5/js/buttons.html5.min.js" type="text/javascript"></script>
                <script src="DataTable/Buttons-1.6.5/js/dataTables.buttons.min.js" type="text/javascript"></script>
                <script src="DataTable/JSZip-2.5.0/jszip.min.js" type="text/javascript"></script>
                <script src="DataTable/pdfmake-0.1.36/pdfmake.min.js" type="text/javascript"></script>
                <script src="DataTable/pdfmake-0.1.36/vfs_fonts.js" type="text/javascript"></script>
                
                <!--Script propio-->
                <script src="Estilos/main.js" type="text/javascript"></script>
    </body>
</html>
