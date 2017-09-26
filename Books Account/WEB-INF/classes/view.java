import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class view  extends HttpServlet 
{



public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{PrintWriter pw =res.getWriter();
System.out.println("qwqw");

Connection con=dbino.con;

res.setContentType("text/html");
	    String query="select * from lib";
      	try
		{
			PreparedStatement ps=con.prepareStatement(query);
      	
		
			ResultSet re=ps.executeQuery();
		//res.sendRedirect("../admin.html");
	pw.println("	<table width='200' border='1'>");
  
    pw.println("<tr>");
    pw.println("<th>name</th>");
    pw.println("<th>id</th> ");
    pw.println("<th>mob</th>");
	pw.println("<th>pass</th>");
  pw.println("</tr>");

		while(re.next())

{
    pw.println("<tr>");
     pw.println(" <td>"+re.getString(1)+"</td>");
   pw.println(" <td>"+re.getString(2)+"</td>");pw.println(" <td>"+re.getString(3)+"</td>");
pw.println(" <td>"+re.getString(4)+"</td>");
   
  // pw.println("<td> <a href=servlet/view >delete </a>  </p></td>");   
   pw.println("</tr>");
  
System.out.println("qwqw");
}
pw.println("</table>");		
		}
		catch(Exception edb)
		{
			   edb.printStackTrace();
		}  
		
	}	
}