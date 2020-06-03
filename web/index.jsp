<%@page contentType="text/html; charset=iso-8859-1" session="true" 
        language="java" import="java.util.*" %>
<%@page import="Modelo.*" %>
<%@page import="Controlador.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Sistema de Ventas </title>
<style type="text/css">
<!--
body {
	background-color: #14213D;
}
body,td,th {
	font-family: Arial, Helvetica, sans-serif;
        color: #E5E5E5;
}
.Estilo1 {
	color: #FFFFFF;
	font-weight: bold;
}
.Estilo2 {color: #FFFFFF}
-->
</style></head>

<body>
<table width="800" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr align="center" bgcolor="#FCA311">
    <td colspan="2"><h2><span class="Estilo1">Inicio de Sesion</span></h2></td>
  </tr><br>
  <tr>
    <td width="625">
    <form name="frmPrincipal" method="post" action="ServletVerificarUsuario">
    <table width="620" border="0" cellspacing="0" cellpadding="0">
      <tr>
          <br><br>
        <td width="131">Usuario</td>
        <td width="489"><input type="text" name="txtUsuario" id="txtUsuario" /></td>
        
      </tr>
        <br>
        <tr>
          
        <td><br><br>Contraseña</td>
        <td><br><br><input type="password" name="txtClave" id="txtClave" /></td>
      </tr>
      <tr>
          
        <td>&nbsp;</td>
        <td><br><br><input type="submit" name="btnEntrar" id="btnEntrar" value="Entrar" /></td>
      </tr>
    </table>
    </form>
    
        <br><br> </td>
  </tr>
  <a href="registrar.jsp"><img src="img/registrate.png" width="250" height="100"/></a>
      <tr>
    <td colspan="2" bgcolor="#FF0000"><div align="center"><strong><span class="Estilo2">JGC - 200121115</span></strong></div></td>
  </tr>
</table>
</body>
</html>