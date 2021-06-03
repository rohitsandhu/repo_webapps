import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Rohit extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        char[] arrCgnom = { 'S', 'A', 'N', 'D', 'H', 'U' };

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        for (int i = 0; i < arrCgnom.length; i++) {

            out.println("<h1>" + arrCgnom[i] + "</h1>");
        }

        out.println("");

        out.println("<h1>");
        for (int i = 0; i < arrCgnom.length; i++) {

            out.print(arrCgnom[i]);
        }
        out.println("</h1>");
    }
}
