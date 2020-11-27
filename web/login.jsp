<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <!--Bootstrap CSS-->
        <link href="Bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>Login</title>
         <style>
            body {
                background: #006666;
            }
            .login{
                background-color: #74A138;
            }
        </style>
    </head>
    
    <body><br>
        <div class="row">
            <div class="col-md-4"></div>
                <div class="card bg-light text-dark col-md-4" style="width: 400px">
                    <div class="card-body">
                    <form name="login" method="post" action="autentica">
                        <br>
                        <img src="imagenes/Logo.png" width="100%">
                        <br><br>
                        <h4><b>Usuario:</b></h4>
                        <input type="text" name="usuario" style="width: 100%" class="form-control"><br>
                        <h4><b>Password:</b></h4>
                        <input type="password" name="password" style="width: 100%" class="form-control"><br><br>
                        <div class="form-row">
                            <input type="submit" value="Ingresar" style="width: 100%" class="form-control btn btn-success text white"><br><br>
                            <span style="margin-left:36%"><a class="boton btn btn-primary btn-sm" method="post" href="Lector_registrar.jsp">Crear Usuario</a></span>
                        </div>
                    </form>
                    </div>
                </div>
            <div class="col-md-4"></div>
        </div>
         <!--Scripts-->
        <script src="Bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="jquery/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="popper/popper.min.js" type="text/javascript"></script>
    </body>
</html>