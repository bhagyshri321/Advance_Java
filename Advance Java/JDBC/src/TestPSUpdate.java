import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestPSUpdate {

	public static void main(String[] args) throws Exception {
		
		testupdate();
	}

	public static void testupdate() throws Exception {
		
		Class.forName( "com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bhagyshri", "root" ,"root" );
		
		int id = 8;
		String fname = "Palak";
		String lname =  "Karodia";
		int salary =  20000;
		
		
	PreparedStatement ps = conn.prepareStatement("update employee set fname = ?, lname = ?, salary =?, where id =?");
		
	ps.setString(1, fname);
	
	ps.setString(2, lname);
			
	ps.setInt(3, salary);

	ps.setInt(4, id);
	
       int i = ps.executeUpdate();

       System.out.println(i +"updated");

      ps.close();
      conn.close();  
	
		
	}
}
