<%-- 
    Document   : index
    Created on : 26/05/2020, 05:40:52 PM
    Author     : hp
--%>
<%@page import="Controlador.*" %>
<%@page import="java.util.ArrayList" %>
<%@page import="Modelo.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
String usuario = "";
HttpSession sesionOk = request.getSession();
if (sesionOk.getAttribute("usuario") == null) {
%>
<jsp:forward page="index.jsp">
    <jsp:param name="error" value="Es obligatorio identificarse"/>
    </jsp:forward>
<%
} else {
usuario = (String)sesionOk.getAttribute("usuario");
}
%>
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
                
                <th><a href="catalogoC.jsp">Catálogo</a></th>
                <th><a href="catalogoCH.jsp">Hogar</a></th>
                <th><a href="catalogoCL.jsp">Limpieza</a></th>
                <th><a href="catalogoCC.jsp">Cocina</a></th>
                <th><a href="catalogoCM.jsp">Mascota</a></th>
                <th><a href="catalogoCA.jsp">Accesorios</a></th>
                <th><a href="catalogoCR.jsp">Ropa</a></th>
                <th><a href="cerrarsesion.jsp">Cerrar sesion</a></th>
                
            </tr>   
        </table>
        </header>
        <h1>CATÁLOGO DE PRODUCTOS INÚTILES</h1>
        
        <table border="0" align="center" width="1000">
            
            <% 
            ArrayList<DProducto> catalogo=CatalogoDB.obtenerProductosL();
            int salto=0;
            for(DProducto p : catalogo){
            
            %>
      
            <th>
                <img src="img/<%=p.getImg()%>" width="140" height="140"><p>
                    <%=p.getNomproduct()%><br>
                    $ <%=p.getPrecio()%><p>
                <p><a href="agregar.jsp?id=<%=p.getIdproduct()%>">Añadir</a></p>
                <%=p.getTipoproduct()%> <br>
                <%=p.getSubproduct()%> <br>
                
                    
                    
            </th>
            <%
            salto++;
            if(salto==3){
               salto=0;
                
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