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
        <div class="row">
                <div class="col-sm-3"></div>
            <div class="form-row">
                <div class="card text-white">
                    <div class="card-body">
                        <form name="form-bibliotecario" method="post" action="procesa_bibliotecario">
                            <h2 style="text-align: center">Registro de Bibliotecario</h2><br><br>
                            <div class="form-row">
                                <div class="col-md-3 mb-3">
                                  <label>Codigo</label>
                                  <input type="text" class="form-control" placeholder="BI#####" name="CodUsuario" required>
                                </div>
                                <div class="col-md-5 mb-4">
                                  <label>Contraseña</label>
                                  <input type="password" class="form-control" name="PassUsuario" required></div>
                            </div>
                            <div class="form-row">
                                <div class="col-md-3 mb-4">
                                    <label>DNI</label>
                                    <input type="text" class="form-control" name="DniBiblio" required>
                                </div>
                                <div class="col-md-4 mb-3">
                                    <label>Nombre</label>
                                    <input type="text" class="form-control" name="NomBiblio" required>
                                </div>
                                <div class="col-md-5 mb-3">
                                    <label>Apellido</label>
                                    <input type="text" class="form-control" name="ApeBiblio" required>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="col-md-7 mb-3">
                                    <label>Direccion</label>
                                    <input type="text" class="form-control" name="DirBiblio" required>
                                </div>
                                <div class="col-md-3 mb-3">
                                    <label>Telefono</label>
                                    <div class="input-group">
                                        <input type="text" class="form-control" name="TelBiblio" required>
                                    </div>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="col-md-3 mb-3">
                                    <label>Fecha de nacimiento</label>
                                    <input type="date" class="form-control" name="FecBiblio" value="2020-01-01" required>
                                </div>
                            </div>
                            <br>
                            <div class="form-row">
                                <div class="col-md-3 mb-4"></div>
                                <div class="col-md-3 mb-4">
                                    <input type="submit" name="agregar_bibliotecario" value="Ingresar" style="width: 50%" class="form-control btn btn-success text white">
                                </div>
                                <div class="col-md-3 mb-4"></div>
                                <div class="col-md-1 mb-1">
                                    <a class="boton btn btn-danger btn-sm" method="post" href="menuen.jsp">Atras</a>
                                </div><br><br> 
                            </div>
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
