package Servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Login extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String n = request.getParameter("userName");
        String p = request.getParameter("userPass");

        if (p.equals("servlet")) {
            /*In case of the forward tag, control doesn't go back to pageA again.*/
            RequestDispatcher rd = request.getRequestDispatcher("servlet2");
            rd.forward(request, response);
        }else{
            /*  At this point the full control goes to pageB. When It's done,
              control is returned to pageA.*/
            out.print("Sorry UserName or Password Error!");
            RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
            rd.include(request, response);

        }
    }
}
