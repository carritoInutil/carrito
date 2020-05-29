<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Registro</title>
        <link rel="stylesheet" type="text/css" href="estilo.css">
    </head>
    <body>
        <%@ page language="java" import="java.sql.*,java.util.*,java.text.*" %>

        
                 <header>Editar usuario</header>
                 <div>
        <table border="2" borderColor="white" width="50%" id="tabla">
            <tr>
                <td width="100%" >
                    <form action="" >
                        <h2 align="center">
                            Datos a Insertados
                        </h2>
                        <table border="1" width="100%" >
                            <tr>
                                <td width="50%" align="center">
                                    <b>
                                        Nombre
                                    </b>
                                </td>
                                <td width="50%" align="center">
                                    <input type="text"
                                           name="nombre" >
                                </td>
                            </tr>
                             <tr>
                                <td width="50%" align="center">
                                    <b>
                                        Apellido Paterno
                                    </b>
                                </td>
                                <td width="50%" align="center">
                                    <input type="text"
                                           name="appat" />
                                </td>
                            </tr>
                             <tr>
                                <td width="50%" align="center">
                                    <b>
                                        Apellido Materno
                                    </b>
                                </td>
                                <td width="50%" align="center">
                                    <input type="text"
                                           name="apmat" >
                                </td>
                            </tr>
                             <tr>
                                <td width="50%"align="center" >
                                    <b>
                                        Usuario
                                    </b>
                                </td>
                                <td width="50%" align="center">
                                    <input type="text"
                                           name="usuario">
                                </td>
                            </tr>
                            <tr>
                                <td width="50%"align="center" >
                                    <b>
                                        Contraseña
                                    </b>
                                </td>
                                <td width="50%" align="center">
                                    <input type="text"
                                           name="password">
                                </td>
                            </tr>
                            
                        </table>
                        
                                <input type="submit" value="Modificar Usuario" name="btnEdit" id="boton">
                        
                            
                    </form>
                </td>
            </tr>
        </table>
                </div>
                 <a href="Lista.jsp" >
            <img src="img/return.png">
        </a>
    </body>
</html>
