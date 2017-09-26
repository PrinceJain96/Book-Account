import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbino
{
	 static Connection con;
         static
         {
        	//Drivers
     		try
     		{
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Driver loaded");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3308/library", "root", "rat");
			}
     		catch (ClassNotFoundException | SQLException e) 
     		{
				e.printStackTrace();
			}
         } public static void main (String arr[])
		 {
		 }
		
}
