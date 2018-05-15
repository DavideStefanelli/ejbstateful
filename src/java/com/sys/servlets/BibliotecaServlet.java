/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sys.servlets;

import com.project.beans.Libro;
import com.project.ejb.BibliotecaLocal;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BibliotecaServlet extends HttpServlet {
 
    @EJB
    BibliotecaLocal biblioteca;
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getSession().invalidate();
        response.sendRedirect("aggiungilibro.html"); 
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        biblioteca.aggiungiLibro(new Libro(
                request.getParameter("titolo"),
                request.getParameter("autore"),
                request.getParameter("genere")
        ));

        request.getSession().setAttribute("libri", biblioteca.getLibri());
        response.sendRedirect("biblioteca.jsp");
    }
    
}
