
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
                overflow-x: hidden;
                width: 100%;
                height: 100vh;
                position: relative;
                background-attachment: fixed;
                background-position: center;
                background-size: cover;   
                
            }
            .flex-column{
                min-height: 35vh;
            }
            .card{
                width: 300px;
                background-color: rgba(0,0,0,.315);
                text-align: center;
                box-shadow: 5px 8px 8px rgba(100,100,100,0.6);
            }
            .cardc{
                width: 300px;
                background-color: rgba(400,0,0,.315);
                text-align: center;
                box-shadow: 5px 8px 8px rgba(200,100,100,0.6);
                height: 55px;
                display: flex;
                justify-content: center;
                align-items: center;
            }
            .cardc:hover{
                transform: scale(1.02);
                background-color: rgba(200,54,54,.415);
            }
            .card:hover{
                transform: scale(1.02);
                background-color: rgba(0,0,0,.415); 
            }
            .row-title {
                padding: 30px;
                width: 100%;z-index: 2;
            }
            .cont-title {
                padding: 30px;
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
            .deg-background
            {
                position: absolute;
                top: 0px;
                left: 0px;
                width: 100%;
                height: 100%;
                background: rgba(0,0, 0, 0.4);
                z-index: -1;
            }
        </style>
    </head>
    <body background="imagenes/fondo3.jpg">
        <div class="deg-background"></div>
        <div class="row-title">
            <div class="col-12 text-center">
                <div class="container cont-title">
                    <h1 class="text-white display-4">Discovery Books</h1>
                </div>                
            </div>
        </div>
        <div class="container">
        <div class="row">
            <div class="d-flex flex-column col-12 col-sm-12 col-md-4 col-lg-4 col-xl-4">
                <div class="m-auto">
                    <div class="container-fluid">
                        <a href="Reporte_lista.jsp">
                            <div class="card">
                                <div class="card-body">
                                    <div class="card-title">
                                        <img class="cliente" src="imagenes/Reportes.png" width="53%">
                                    </div>
                                    <label>Reportes</label>
                                </div>
                            </div>
                        </a>
                        
                    </div>
                </div>
            </div>
            <div class="d-flex flex-column col-12 col-sm-12 col-md-4 col-lg-4 col-xl-4">
                <div class="m-auto">
                    <div class="container-fluid">
                        <a href="Sanciones.jsp">
                            <div class="card">
                                <div class="card-body">
                                    <div class="card-title">
                                        <img class="cliente" src="imagenes/Sanciones.png" width="38%">
                                    </div>
                                    <label>Sanciones</label>
                                </div>
                            </div>
                        </a>
                        
                    </div>
                </div>
            </div>
            <div class="d-flex flex-column col-md-4 col-lg-4 col-xl-4">
                <div class="m-auto">
                    <div class="container-fluid">
                        <a href="Bibliotecario.jsp">
                            <div class="card">
                                <div class="card-body">
                                    <div class="card-title">
                                        <img class="cliente" src="imagenes/Usuario.png" width="33%">
                                    </div>
                                    <label>Bibliotecario</label>
                                </div>
                            </div>
                        </a>
                        
                    </div>
                </div>
            </div>
        </div>
        </div><br><br>
        <div class="row">
            <div class="col-sm-4"></div>
            <span style="margin-left: 5%">
                <div class="col-sm-2">
                    <a href="index.jsp">
                        <div class="cardc rounded">
                            <div class="card-body">
                                <label>Cerrar sesión</label>
                            </div>
                        </div>
                    </a>
                </div>
            </span>
        </div>
        <!--Scripts-->
        <script src="Bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="jquery/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="popper/popper.min.js" type="text/javascript"></script>
    </body>
</html>
