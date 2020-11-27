

<%@page import="modelo.Usuario"%>
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
                background-image: url(imagenes/FondoLector2.jpg);
            }
            .card{
                width: 371px;
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
            Usuario u=new Usuario();
            LinkedList<Usuario> listaUsuario; 
            listaUsuario=u.listaUsuario();
            String CodUsuario=request.getParameter("CodLector");
            String DniLector="";
            String NomLector="";
            String ApeLector="";
            String TelLector="";
            String DirLector="";
            String FecLector="";
            String StaUsuario="";
            String PassUsuario="";
            int ud=0;
            for(int i=0;i<listaLector.size();i++){
                if(listaLector.get(i).getCodLector().equals(CodUsuario)){
                    DniLector=listaLector.get(i).getDniLector();
                    NomLector=listaLector.get(i).getNomLector();
                    ApeLector=listaLector.get(i).getApeLector();
                    TelLector=listaLector.get(i).getTelLector();
                    DirLector=listaLector.get(i).getDirLector();
                    FecLector=listaLector.get(i).getFecLector();
                    StaUsuario=listaLector.get(i).getStaLector();
                    ud=i;
                }
                if(listaUsuario.get(i).getCodUsuario().equals(CodUsuario)){
                    PassUsuario=listaUsuario.get(i).getPassUsuario();
                }
            }
        %>
        
        <div class="row">
            <div class="col-sm-3"></div>
            <div class="form-row">
                <div class="card text-white" style="width: 1000px">
                    <div class="card-body">
                        <form name="form-lector" method="post" action="procesa_lector">
                            <div class="form-row"><input name="StaUsuario" type="hidden" value="0">
                                <div class="col-md-3 mb-3">
                                  <label>Codigo</label>
                                  <input type="text" class="form-control" placeholder="LE#####" value="<%=CodUsuario%>" name="CodUsuario" readonly>
                                </div>
                                <div class="col-md-1 mb-1"></div>
                                <div class="col-md-3 mb-3">
                                  <label>Contraseña</label>
                                  <input type="text" class="form-control" value="<%=PassUsuario%>" name="PassUsuario" required>
                                </div>
                                <div class="col-md-4 mb-1"></div>
                                <div class="col-md-1 mb-1">
                                    <% if(autentica.Logeado!=null){
                                        if(autentica.Logeado.substring(0,2).equals("EN")){%>
                                        <a class="boton btn btn-danger btn-sm" method="post" href="menuen.jsp">Atras</a><%}%>
                                    <% if(autentica.Logeado.substring(0,2).equals("BI")){%>
                                        <a class="boton btn btn-danger btn-sm" method="post" href="menubi.jsp">Atras</a><%}%>
                                    <% }else{%><a class="boton btn btn-danger btn-sm" method="post" href="index.jsp">Atras</a><%}%>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="col-md-3 mb-4">
                                    <label>DNI</label>
                                    <input type="text" class="form-control" value="<%=DniLector%>" name="DniLector" required>
                                </div>
                                <div class="col-md-4 mb-3">
                                    <label>Nombre</label>
                                    <input type="text" class="form-control" value="<%=NomLector%>" name="NomLector" required>
                                </div>
                                <div class="col-md-4 mb-3">
                                    <label>Apellido</label>
                                    <input type="text" class="form-control" value="<%=ApeLector%>" name="ApeLector" required>
                                </div>
                                <div class="col-md-4 mb-3">
                                    <label>Telefono</label>
                                    <div class="input-group">
                                        <input type="text" class="form-control" value="<%=TelLector%>" name="TelLector" required>
                                    </div>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="col-md-7 mb-3">
                                    <label>Direccion</label>
                                    <input type="text" class="form-control" value="<%=DirLector%>" name="DirLector" required>
                                </div>
                                <div class="col-md-1 mb-4"></div>
                                <div class="col-md-3 mb-3">
                                    <label>Fecha de nacimiento</label>
                                    <input type="date" class="form-control" value="<%=FecLector%>" name="FecLector" required>
                                </div>
                            </div><br>
                            <input type="submit" name="editar_lector" value="Registrar" style="width: 100%" class="form-control btn btn-success text white"><br><br> 
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
