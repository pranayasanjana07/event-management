import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Person extends GenericServlet
{
public  void service(ServletRequest request, 
ServletResponse response) throws
IOException
{
String name=request.getParameter("t1");
String no=request.getParameter("t2");
response.setContentType("text/html");
PrintWriter out=response.getWriter();
out.println("<html>");
out.println("<body bgcolor=yellow>");
out.println("<h1>Welcome  to this site :"+name+"</h1>");
out.println("<h1>Your contact number is:"+no+"</h1>");
out.println("</body>");
out.println("</html>");
out.close();
}
}
