/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.DVenta;
import Modelo.DVentaDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hp
 */
public class ServletAgregarCarrito extends HttpServlet {

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
        
        
        
        
        
        ArrayList<DVenta> agregados = new ArrayList<DVenta>(); 
        ArrayList<DVenta> cantidad = new ArrayList<DVenta>(); 
        
        
        
        DVenta a = new DVenta();
        DVenta c = new DVenta();
        
        try {
            a.setProducto(Integer.parseInt(request.getParameter("codigo")));
            c.setCantidad(Integer.parseInt(request.getParameter("cantidad")));
            agregados.add(a);
            cantidad.add(c);
            HttpSession sesion = request.getSession();
            sesion.setAttribute("agregado", agregados);
            sesion.setAttribute("cantidad", cantidad);
            response.sendRedirect("carrito.jsp");
            
        } catch (Exception e) {
            response.sendRedirect("error.jsp");
        }
    }
}