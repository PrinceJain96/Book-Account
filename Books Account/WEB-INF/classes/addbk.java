import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class addbk  extends HttpServlet 
{



public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{PrintWriter pw =res.getWriter();
System.out.println("qwqw");

String name=req.getParameter("textfield2");
String lid=req.getParameter("textfield");
String col=req.getParameter("textfield3");
String aut=req.getParameter("textfield4");
String yr=req.getParameter("textfield5");
String tn=req.getParameter("textfield6");
Connection con=dbino.con;
System.out.println(name);
res.setContentType("text/html");
	int id = Integer.parseInt(lid);
	int year = Integer.parseInt(yr);
	int tno = Integer.parseInt(tn);
	    String query="insert into book values(?,?,?,?,?,?,0)";
      	try
		{
			PreparedStatement ps=con.prepareStatement(query);
      	ps.setString(2,name);
		ps.setInt(1,id);
		ps.setInt(6,tno);
		ps.setInt(5,year);
		ps.setString(4,aut);
		ps.setString(3,col);
		
		System.out.println("ccc");
		  int n=ps.executeUpdate();
		res.sendRedirect("../lib.html");
		}
		catch(Exception edb)
		{
			   edb.printStackTrace();
		}  
		
	}	
}