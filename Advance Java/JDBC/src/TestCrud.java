import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestCrud {
	
	public static void main(String[] args) throws Exception  {
		
	testselect();
	
	}

	public  static void testselect() throws Exception {
		Class.forName( "com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bhagyshri", "root" ,"root" );
		
		Statement smt  = conn.createStatement();
		
       ResultSet rs = smt.executeQuery("Select * from employee");
		
		while(rs.next()) {
			System.out.print("\t" + rs.getString(1));
			System.out.print("\t" + rs.getString (2));
			System.out.print("\t"  + rs.getString(3));
			System.out.print("\t"  + rs.getString(4));
		}
		rs.close();
	smt.close();
	conn.close();
	  
				
				
	}
	

}
