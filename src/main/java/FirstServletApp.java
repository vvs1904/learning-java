

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/firstServlet")
public class FirstServletApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public FirstServletApp() {
    	System.out.println("Servlet object is created internally");
        
    }

	
	public  void doPost(jakarta.servlet.http.HttpServletRequest request,
            jakarta.servlet.http.HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("uname");
	    String ucity=request.getParameter("ucity");
//	    PrintWriter writer=response.getWriter();
//	    writer.println("Hello "+name);
//	    writer.println("I know you are from "+ucity);
//	    writer.close();
	    PrintWriter writer=response.getWriter();
	    writer.println("<html><head><title>Second app</title></head>");
	    writer.println("<body bgcolor='cyan'><h1><marquee>Welcome to our dynamic app</marquee></h1>");
	    
	    writer.println("<table>");
	    writer.println("<tr><th>Name</th> <th>City</th></tr>");
	    writer.println("<tr><td>"+name+"</td><td>"+ucity+"</td></tr>");
	    writer.println("</table></body>");
	    writer.println("</html");
	    
	    
	}

}
