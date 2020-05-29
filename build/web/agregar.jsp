<%-- 
    Document   : agregar
    Created on : 27/05/2020, 02:06:22 AM
    Author     : hp
--%>
<%@page import="java.util.*" %>
<%@page import="Modelo.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
DProducto p=CatalogoDB.obtenerProducto(Integer.parseInt(request.getParameter("id")));
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <header>
             <table border="0" width="1000" align="center">
            
            <tr bgcolor="skyblue">
                
                <th><a href="index.jsp">Catálogo</a></th>
                <th><a href="index.jsp">Registrar Producto</a></th>
                <th><a href="index.jsp">Ventas</a></th>
                <th><a href="index.jsp">Cerrar sesion</a></th>
                
            </tr>   
        </table>
        </header>
        <table>
            <form method="post" action="ServletControlador">
                <tr>
                    <th rowspan="7"><img src="img/<%=p.getImg()%>" width="140" height="140"></th>
                </tr>
                <tr>
                    <th>Código</th>
                    <th><input type="text" name="txtid_P" value="<%=p.getIdproduct()%>" readonly="readonly"></th>
                </tr>
                <tr>
                    <th>Nombre</th>
                    <th><input type="text" name="txtnom_P" value="<%=p.getNomproduct()%>" readonly="readonly"></th>
                </tr>
                <tr>
                    <th>Precio</th>
                    <th><input type="text" name="txtprecio_P" value="<%=p.getPrecio()%>" readonly="readonly"></th>
                    
                </tr>
                <tr>
                    <th>Tipo producto</th>
                    <th><input type="text" name="txttipo_P" value="<%=p.getTipoproduct()%>" readonly="readonly"></th>
                    
                </tr>
                <tr>
                    <th>Stock</th>
                    <th><input type="text" name="txtstock_P" value="<%=p.getStock()%>" readonly="readonly"></th>
                    
                </tr>
                <tr>
                    <th>Cantidad</th>
                    <th><input type="number" value="1" min="1" name="cantidad_P" value="<%=p.getNomproduct()%>" ></th>
                </tr>
                <tr>
                    <th colspan="3"><input type="button" name="btnAnadir" value="Añadir" ></th>
                <input type="hidden" name="accion" value="AnadirCarrito">
                </tr>
            </form>
        </table>
    </body>
</html>
