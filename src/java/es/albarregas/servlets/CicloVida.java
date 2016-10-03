/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author antonio
 */
@WebServlet(name = "CicloVida", urlPatterns = {"/ciclo"})
public class CicloVida extends HttpServlet {    

    @Override
    public void init(ServletConfig config){
        System.out.println("init()");
    }
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SaludoAnotacion</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<a href='index.html'>Index</a>");
            out.println("<h1>Par&aacute;metros iniciales</h1>");

            Enumeration<String> parametros=request.getParameterNames();
            while(parametros.hasMoreElements()){
                String elemento=parametros.nextElement();
                String valor=request.getParameter(elemento);
                out.println(elemento+" - "+valor);
            }
            
            Enumeration<String> parametros2=request.getHeaderNames();
              while(parametros2.hasMoreElements()){
                String elemento=parametros.nextElement();
                String valor=request.getHeader(elemento);
                out.println(elemento+" - "+valor);
            }
              
            out.println("</body>");
            out.println("</html>");
    }
    
    @Override
    public void destroy(){
        System.out.println("destroy()");
    }
    

}
