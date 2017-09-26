import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class addlib  extends HttpServlet 
{



public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{PrintWriter pw =res.getWriter();
System.out.println("qwqw");

String name=req.getParameter("textfield");
String lid=req.getParameter("textfield2");
String lmob=req.getParameter("textfield3");
String pass=req.getParameter("textfield4");
Connection con=dbino.con;
System.out.println(name);
res.setContentType("text/html");
	int id = Integer.parseInt(lid);
	int mob = Integer.parseInt(lmob);
	    String query="insert into lib values(?,?,?,?)";
      	try
		{
			PreparedStatement ps=con.prepareStatement(query);
      	ps.setString(1,name);
		ps.setInt(2,id);
		ps.setInt(3,mob);
		ps.setString(4,pass);
		
		System.out.println("ccc");
		  int n=ps.executeUpdate();
		res.sendRedirect("../admin.html");
		}
		catch(Exception edb)
		{
			   edb.printStackTrace();
		}  
		
	}	
}