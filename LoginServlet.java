/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Welcome Shubham
 */
public class LoginServlet extends HttpServlet 
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String user=request.getParameter("username");
        String pass=request.getParameter("password");
        if(user.equals("root")&&pass.equals("root"))
        {
             request.getRequestDispatcher("index.html").include(request, response);
           
        }
        else
        {
                   request.setAttribute("errorMessage", "Invalid user or password");
                   request.getRequestDispatcher("/index.jsp").forward(request,response);
                     
        }
        
    }
}



