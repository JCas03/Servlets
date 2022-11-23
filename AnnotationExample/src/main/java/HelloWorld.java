import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/helloWorld")
public class HelloWorld extends HttpServlet {

    protected void doGet(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        String name = request.getParameter("name").trim();
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<h2>Hello " + name + "</h2>");
        out.close();
    }

    protected void doPost(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException{
        doGet(request,response);
    }
}
