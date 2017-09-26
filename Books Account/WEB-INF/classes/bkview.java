import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class bkview  extends HttpServlet 
{



public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{PrintWriter pw =res.getWriter();
System.out.println("qwqw");

Connection con=dbino.con;

res.setContentType("text/html");
	    String query="select * from book";
      	try
		{
			PreparedStatement ps=con.prepareStatement(query);
      	
		
			ResultSet re=ps.executeQuery();
		
	pw.println("	<table width='200' border='1'>");
  
    pw.println("<tr>");
	  pw.println("<th>id</th> ");
    pw.println("<th>name</th>");
  	pw.println("<th>col</th>");
    pw.println("<th>autor</th>");

	  pw.println("<th>year</th>");
  pw.println("<th>total no</th>");
  pw.println("<th>issued no</th>");

  pw.println("</tr>");

		while(re.next())

{
    pw.println("<tr>");
     pw.println(" <td>"+re.getString(1)+"</td>");
   pw.println(" <td>"+re.getString(2)+"</td>");
   pw.println(" <td>"+re.getString(3)+"</td>");
pw.println(" <td>"+re.getString(4)+"</td>");
    pw.println(" <td>"+re.getString(5)+"</td>");
   pw.println(" <td>"+re.getString(6)+"</td>");
pw.println(" <td>"+re.getString(7)+"</td>");
 
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