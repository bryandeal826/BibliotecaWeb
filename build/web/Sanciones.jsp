
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
            }
            .flex-column{
                min-height: 39vh;
            }
            .card{
                width: 300px;
                background-color: rgba(0,0,0,.315);
                text-align: center;
                box-shadow: 5px 8px 8px rgba(100,100,100,0.6);
            }
            .card:hover{
                transform: scale(1.02);
                background-color: rgba(0,0,0,.415); 
            }
            .row-title {
                padding: 10px;
                position: absolute;
                width: 100%;
            }
            .cont-title {
                padding: 15px;
                border:15px;
                width: 40%;
            }
            .title{
                font-weight: 600;margin-bottom: 0;
            }
            .card-title{
                padding-top: 20px;padding-bottom:20px; 
            }
            label{
                color:white;font-size:30px;
            }
            .plane{
                width: 314px;height: 253px;padding: 12px;
            }
            .client{
                width: 260px;
            }
        </style>
    </head>
    <body background="imagenes/FondoPres.jpg">
        <br>
    <center>
        <span style="margin-left: 90%"><a class="boton btn btn-danger btn-sm" method="post" href="menuen.jsp">Atras</a><div class="row-title">
            <div class="col-8 w-100">
                <div class="container text-center">
                    <h1 class="text-white display-4">Discovery Books</h1>
                </div>
            </div>
        </div>
        </span>
    </center><br><br><br><br><br><br>
        <div class="container">
        <div class="row">
        <div class="col-sm-2"></div>
            <div class="col-sm-4">
                        <a href="Sanciones_registrar.jsp">
                            <div class="card">
                                <div class="card-body">
                                    <div class="card-title">
                                        <img class="cliente" src="imagenes/Sanciones.png" width="46%">
                                    </div>
                                    <label>Registar</label>
                                </div>
                            </div>
                        </a>
            </div>
            <div class="col-sm-4">
                        <a href="Sanciones_lista.jsp">
                            <div class="card">
                                <div class="card-body">
                                    <div class="card-title">
                                        <img class="cliente" src="imagenes/Reportes.png" width="63%">
                                    </div>
                                    <label>Lista</label>
                                </div>
                            </div>
                        </a>
            </div>
            <div class="col-sm-2"></div>
        </div>
        </div>
         <!--Scripts-->
        <script src="Bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="jquery/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="popper/popper.min.js" type="text/javascript"></script>
    </body>
</html>