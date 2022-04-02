import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestTransactionHandling {
	
	public static void main(String[] args) throws Exception {
		
		testadd();
			
		}
	   public static void testadd() throws Exception {
				
		       Class.forName( "com.mysql.jdbc.Driver");
				
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bhagyshri", "root" ,"root" );
				
				
				
				Statement smt  = conn.createStatement();
				
				
				
		int i = smt.executeUpdate("delete from employee where id = 7");
		
	
		smt.close();
		
		

		
	}

}



