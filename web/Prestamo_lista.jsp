<%@page import="java.util.LinkedList"%>
<%@page import="modelo.Prestamo"%>
<%@page import="modelo.Material_B"%>
<%@page import="modelo.Devolucion"%>
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
            .table{
                background-color: rgba(0,0,0,.315);
            }
	</style>
        <title>Discovery Books</title>
    </head>
    <body><br><br><br>
        <div class="container">
            <%
                Prestamo p=new Prestamo();
                LinkedList<Prestamo> listaPrestamo; 
                listaPrestamo=p.listaPrestamo();
            
                Material_B m=new Material_B();
                LinkedList<Material_B> listaMaterial_B; 
                listaMaterial_B=m.listaMaterial();
            
                Devolucion d=new Devolucion();
                LinkedList<Devolucion> listaDevolucion; 
                listaDevolucion=d.listaDevolucion();
            %>
            <table id="tabla" class="table table-bordered table-light table-striped">
                <thead style="background: black" class="text-white">
                    <tr>
                   <!--%if(autentica.Logeado.substring(0,2).equals("LE")){%-->
                        <td>Codigo de Prestamo</td>
                        <td>Codigo de libro</td>
                        <td>Titulo</td>
                        <td>Fecha Prestamo</td>
                        <td>Fecha Entrega</td>
                        <td>Estado</td>
                    <!--%}else{%-->
                    <%if(autentica.Logeado.substring(0,2).equals("BI")){%>
           
                        <td>Codigo de Lector</td>
                        <td>Accion</td>
                    <%}%>
                    </tr>
                </thead>
                <tbody style="background: rgba(162,142,168,.75)" class=" bordered">
                    <%if(autentica.Logeado.substring(0,2).equals("LE")){%>
                        <%for (int i=0;i<listaPrestamo.size(); i++){%> 
                            <% if(!listaPrestamo.get(i).getStaPrestamo().equals("2")){ %>
                                <% if(listaPrestamo.get(i).getCodLector().equals(autentica.Logeado)){ %>
                                        <tr>
                                            <td><%=listaPrestamo.get(i).getCodPrestamo()%></td>
                                            <td><%=listaPrestamo.get(i).getCodMate_biblio()%></td>
                                            <%for (int f=0;f<listaMaterial_B.size(); f++){%>

                                                <%if(listaMaterial_B.get(f).getCodMate_biblio().equals(listaMaterial_B.get(i).getCodMate_biblio())){%>
                                                    <td><%=listaMaterial_B.get(f).getNomMate_biblio()%></td>
                                                <%}%>
                                            <%}%>
                                            <td><%=listaPrestamo.get(i).getFpPrestamo()%></td>
                                            <td><%=listaPrestamo.get(i).getFePrestamo()%></td>

                                            <% if(listaPrestamo.get(i).getStaPrestamo().equals("1")){ %>
                                                <td>Devuelto</td>
                                            <% }else{ %>
                                                <td>Prestado</td>
                                            <% } %>
                                        </tr>
                                <% } %>
                            <% } %>
                        <% } %>
                    <%}else{%>
                        <%for (int i=0;i<listaPrestamo.size(); i++){%> 
                            <% if(!listaPrestamo.get(i).getStaPrestamo().equals("2")){ %>
                                    <tr>
                                        <td><%=listaPrestamo.get(i).getCodPrestamo()%></td>
                                        <td><%=listaPrestamo.get(i).getCodMate_biblio()%></td>
                                        <%for (int f=0;f<listaMaterial_B.size(); f++){%>

                                                <%if(listaMaterial_B.get(f).getCodMate_biblio().equals(listaMaterial_B.get(i).getCodMate_biblio())){%>
                                                    <td><%=listaMaterial_B.get(f).getNomMate_biblio()%></td>
                                                <%}%>
                                            <%}%>
                                        <td><%=listaPrestamo.get(i).getFpPrestamo()%></td>
                                        <td><%=listaPrestamo.get(i).getFePrestamo()%></td>
                                        <% if(listaPrestamo.get(i).getStaPrestamo().equals("1")){ %>
                                                <td style="color: lime">Devuelto</td>
                                            <% }else{ %>
                                                <td style="color: yellow">Prestado</td>
                                            <% } %>
                                        <td><%=listaPrestamo.get(i).getCodLector()%></td>
                                        
                                            
                                        
                                            
                                            
                                        <td>
                                            <a class="boton btn btn-warning btn-sm" href="Bibliotecario_modificar.jsp?CodBiblio=<%=listaPrestamo.get(i).getCodPrestamo()%>">Editar</a>
                                            <a class="boton btn btn-warning btn-sm" href="Bibliotecario_eliminar.jsp?CodBiblio=<%=listaPrestamo.get(i).getCodPrestamo()%>">Eliminar</a>
                                        </td>   
                                    </tr>
                                <%}%>
                            <%}%>
                        <%}%>
                </tbody>
            </table>
            <div class="row">
                <span style="margin-left: 45%">
                    <%if(autentica.Logeado.substring(0,2).equals("BI")){%>
                        <a class="btn btn-danger btn-sm" method="post" href="Prestamo.jsp">Atras</a>
                    <%}else{%>
                        <a class="btn btn-danger btn-sm" method="post" href="menule.jsp">Atras</a>
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
