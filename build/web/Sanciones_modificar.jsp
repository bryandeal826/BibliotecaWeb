
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
            Tipo_sancion ts=new Tipo_sancion();
            LinkedList<Tipo_sancion> listaTipo_sancion; 
            listaTipo_sancion=ts.listaTipo_sancion();
            
            Sanciones s=new Sanciones();
            LinkedList<Sanciones> listaSanciones; 
            listaSanciones=s.listaSanciones();
            
            Lector l=new Lector();
            LinkedList<Lector> listaLector; 
            listaLector=l.listaLector();
            
            Encargado en=new Encargado();
            LinkedList<Encargado> listaEncargado; 
            listaEncargado=en.listaEncargado();
            
            String  Cod_Sancion=request.getParameter("Cod_Sancion");
            int ul=-1,ue=-1,uts=-1;
            String CodLector  = "",
                  Cod_Sanc = "",
                  CodEncargado   = "";
            for(int a=0;a<listaSanciones.size();a++){
                if(listaSanciones.get(a).getCod_Sancion().equals(Cod_Sancion)){
                    CodLector=listaSanciones.get(a).getCodLector();
                    CodEncargado=listaSanciones.get(a).getCodEncargado();
                    Cod_Sanc=listaSanciones.get(a).getCod_Sanc();
                    for(int b=0;b<listaLector.size();b++){
                        if(listaLector.get(b).getCodLector().equals(CodLector)){
                            ul=b;
                        }
                    }
                    for(int c=0;c<listaTipo_sancion.size();c++){
                        if(listaTipo_sancion.get(c).getCod_Sanc().equals(Cod_Sanc)){
                            uts=c;
                        }
                    }
                    for(int d=0;d<listaEncargado.size();d++){
                        if(listaEncargado.get(d).getCodEncargado().equals(CodEncargado)){
                            ue=d;
                        }
                    }
                }
            }
        %>
    </head>
    <body><br><br>
        <div class="container justify-content-xl-center">
        <div class="row-title">
            <div class="col-12 text-center">
                <div class="container cont-title">
                    <h1 class="text-white display-4">Material Bibliografico</h1>
                </div>                
            </div>
            
        </div><br><br>
         <div class="row ">
             <span style="margin-left: 13%"></span>
            <div class="col-sm-1 col-12"></div>
                <div class="card text-white" style="width: 650px; height: 450px">
                    <div class="card-body">
                        <form name="form-sancion" method="post" action="procesa_sancion">
                            <div class="form-row">
                                <div class="col-md-4 mb-3">
                                  <label>Codigo:</label>
                                  <input type="text" class="form-control" value="<%=Cod_Sancion%>" name="Cod_Sancion" required>
                                </div>
                                <div class="col-md-6 mb-1"></div>
                                <div class="col-md-1 mb-1">
                                <a class="boton btn btn-danger btn-sm" method="post" href="menuen.jsp">Atras</a>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="col-md-10 mb-3">
                                  <label>Lector</label>
                                    <select name="CodLector" class="form-control" required>
                                        <option value="<%=listaLector.get(ul).getCodLector()%>"><%=listaLector.get(ul).getNomLector()%></option>
                                        <%for(int i=0;i<listaLector.size();i++){%>
                                            <%if(i!=ul){%>
                                                <option value="<%=listaLector.get(i).getCodLector()%>"><%=listaLector.get(i).getNomLector()%></option>
                                            <%}%>
                                        <%}%>
                                    </select>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="col-md-6 mb-3">
                                    <label>Tipo de Sancion:</label>
                                    <select>
                                        <option value="<%=listaTipo_sancion.get(uts).getCod_Sanc()%>"><%=listaTipo_sancion.get(uts).getDes_Sanc()%></option>
                                        <%for(int i=0;i<listaTipo_sancion.size();i++){%>
                                            <%if(i!=uts){%>
                                                <option value="<%=listaTipo_sancion.get(i).getCod_Sanc()%>"><%=listaTipo_sancion.get(i).getDes_Sanc()%></option>
                                            <%}%>
                                        <%}%>
                                    </select>
                                </div>
                                <div class="col-md-6 mb-3">
                                    <label>Encargado:</label>
                                    <select>
                                        <option value="<%=listaEncargado.get(ue).getCodEncargado()%>"><%=listaEncargado.get(ue).getCodEncargado()%></option>
                                        <%for(int i=0;i<listaEncargado.size();i++){%>
                                            <%if(i!=ue){%>
                                                <option value="<%=listaEncargado.get(i).getCodEncargado()%>"><%=listaEncargado.get(i).getCodEncargado()%></option>
                                            <%}%>
                                        <%}%>
                                    </select>
                                </div>
                            </div><br>
                            <input type="submit" name="editar_sancion" value="Ingresar"  class="form-control btn btn-success text white"><br><br> 
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
