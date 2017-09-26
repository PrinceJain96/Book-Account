import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class del1  extends HttpServlet 
{



public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{PrintWriter pw =res.getWriter();
System.out.println("qwqw");
  String x=req.getParameter("id");

int y=Integer.parseInt(x);


Connection con=dbino.con;

res.setContentType("text/html");
	    String query="delete from lib where lid=?";
      	try
		{
			PreparedStatement ps=con.prepareStatement(query);
      	ps.setInt(1,y);
		
			int re=ps.executeUpdate();
	

System.out.println("deleted");
}
	
		
		catch(Exception edb)
		{
			   edb.printStackTrace();
		}
		}
		
}