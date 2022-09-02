<%-- 
    Document   : Controlador
    Created on : 25/08/2022, 7:13:16 p. m.
    Author     : guzma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body> 
        <form>
             <form action="Controlador.jsp" method="get">
            <p>Peticion: <input type="text" name="texto"><br></p>
            
        <input type="submit" value="ok">
        
            
        </form>
         <%@ page import = "Logica.Logica1" %>
        <% String desicion = request.getParameter("texto");
        
        Logica.Logica1  log1 = new Logica1();
        log1.chat(desicion);
        out.print(log1.chat(desicion));
        %>
        
        
        
        
        
       
    </body>
    
</html>
