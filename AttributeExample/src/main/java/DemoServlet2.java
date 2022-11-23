import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet2")
public class DemoServlet2 extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)
    {
        try{

            res.setContentType("text/html");
            PrintWriter out=res.getWriter();

            ServletContext context=getServletContext();
            String n=(String)context.getAttribute("company");

            out.println("Welcome to "+n);
            out.close();

        }catch(Exception e){System.out.println(e);}
    }}