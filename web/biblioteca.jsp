<%-- 
    Document   : biblioteca
    Created on : 15-mag-2018, 15.41.26
    Author     : web4e
--%>
 
<%@page import="com.project.beans.Libro"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Biblioteca</h1>
        
        <br/>
        
        <table>
            <tr>
                <td>Titolo</td>
                <td>Autore</td>
                <td>Genere</td>
            </tr>
        
            <% 
            ArrayList<Libro> libri = (ArrayList<Libro>)session.getAttribute("libri"); 
            if(libri != null)
            for(Libro l : libri) { %> 
                <tr>
                    <td><%= l.getTitolo() %></td>
                    <td><%= l.getAutore() %></td>
                    <td><%= l.getGenere() %></td>
                </tr> 
            <% } %>
            
        </table>
        
        <br/>
        
        <a href="aggiungilibro.html"> Visualizza biblioteca </a>
        
    </body>
</html>
