import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login  extends HttpServlet implements Servlet
{



public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{PrintWriter pw =res.getWriter();
System.out.println("qwqw");
String	pass="";
String lids=req.getParameter("fname");
Connection con=dbino.con;
System.out.println(lids);
res.setContentType("text/html");
	int lid = Integer.parseInt(lids);
	    String query="select pass from lib where lid=?";
      	try
		{
			PreparedStatement ps=con.prepareStatement(query);
      	ps.setInt(1,lid);
		System.out.println("ccc");
			ResultSet re=ps.executeQuery();
			while(re.next())
			{
				pass=re.getString(1);
	System.out.println("bbb");	
pw.println(pass)	;
			}
		}
		catch(Exception edb)
		{
			   edb.printStackTrace();
		}
		if(pass.equals("admin"))
		{ 
		res.sendRedirect("../admin.html");  

		}
		else if(pass.equals(""))
		{pw.println("<h1>nooo!!</h1>");
			res.sendRedirect("../Login.html");
		
		}
		else
		
		{	res.sendRedirect("../lib.html");  }
		
	}	
}