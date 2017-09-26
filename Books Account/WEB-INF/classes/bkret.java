import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class bkret  extends HttpServlet 
{



public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{PrintWriter pw =res.getWriter();
System.out.println("qwqw");
  String x1=req.getParameter("sid");
System.out.println(x1);
int sid=Integer.parseInt(x1);
  String x=req.getParameter("bid");

int bid=Integer.parseInt(x);

Connection con=dbino.con;

res.setContentType("text/html");
				ResultSet re;
      	try
		{    String query= "UPDATE book SET isno = isno-1 WHERE bid = ? ";
			PreparedStatement ps=con.prepareStatement(query);
      	ps.setInt(1,bid);
		
  int x11=ps.executeUpdate();

}	
		
		catch(Exception edb)
		{
			   edb.printStackTrace();
		}  	try
		{    String query="UPDATE issue SET rs = 1 WHERE bid = ? AND sid=?";
			PreparedStatement ps=con.prepareStatement(query);
      		ps.setInt(1,bid);	ps.setInt(2,sid);
		
 int x12=ps.executeUpdate();

}	
		
		catch(Exception edb)
		{
			   edb.printStackTrace();
		}  
		
	}	
}