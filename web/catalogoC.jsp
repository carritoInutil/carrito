<%-- 
    Document   : index
    Created on : 26/05/2020, 05:40:52 PM
    Author     : hp
--%>
<%@page import="java.util.ArrayList" %>
<%@page import="Modelo.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
        <h1>CATÁLOGO DE PRODUCTOS INÚTILES</h1>
        
        <table border="0" align="center" width="1000">
            
            <% 
            ArrayList<DProducto> catalogo=CatalogoDB.obtenerProductos();
            int salto=0;
            for(DProducto p : catalogo){
            
            %>
      
            <th>
                <img src="img/<%=p.getImg()%>" width="140" height="140"><p>
                    <%=p.getNomproduct()%><br>
                    $ <%=p.getPrecio()%><p>
                <p><a href="agregar.jsp?id=<%=p.getIdproduct()%>">Añadir</a></p>
                    <%=p.getTipoproduct()%>
                    
                    
            </th>
            <%
            salto++;
            if(salto==3){
               
                
            %>
            <tr>
            
            <%
            }
            %>
           
            <%
            }
            %>
            
        </table>
        
    </body>
</html>
