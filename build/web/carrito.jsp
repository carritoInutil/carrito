<%-- 
    Document   : carrito
    Created on : 2/06/2020, 04:59:08 PM
    Author     : hp
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.DVenta"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
       
        ArrayList<DVenta>agregados= (ArrayList<DVenta>)session.getAttribute("agregado");
        int salto=0;
        
        for(DVenta v: agregados){
        %>
            
          <th>
                
                    <%=v.getProducto()%><br>
                    <%=v.getCantidad()%><p>
                
          </th>
        <%
            salto++;
            if(salto==1){
               salto=0;
                
            %>
            <tr>
            
            <%
            }
            %>
           
            <%
            }
            %>
        
        
        <h1>Hello World!</h1>
    </body>
</html>
