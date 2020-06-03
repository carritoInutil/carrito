/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.CUsuarios;
import Modelo.UsuariosDB;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hp
 */
public class SRegistrarUser extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        UsuariosDB u = new UsuariosDB();
        CUsuarios r = new CUsuarios();
        
        
        try {
            if(request.getParameter("nombre").isEmpty() || request.getParameter("appat").isEmpty() || request.getParameter("apmat").isEmpty()
                    || request.getParameter("usuario").isEmpty() || request.getParameter("password").isEmpty()){
                    
                 response.sendRedirect("error.jsp");
            }else{
                try {
                    r.setNombre(request.getParameter("nombre"));
                    r.setAppaterno(request.getParameter("appat"));
                    r.setApmaterno(request.getParameter("apmat"));
                    r.setUser(request.getParameter("usuario"));
                    r.setPassword(request.getParameter("password"));
                    r.setPrivilegio(2);
                    
                    boolean b = u.registrarUsuario(r);
                    if (b) {
                        response.sendRedirect("index.jsp");
                    }else{
                        response.sendRedirect("registrar.jsp");
                    }
                } catch (IOException e) {
                    System.out.println(e);
                     response.sendRedirect("error.jsp");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
            response.sendRedirect("error.jsp");
        }   
    }
}
