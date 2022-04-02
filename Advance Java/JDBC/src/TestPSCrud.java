import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestPSCrud {

	public static void main(String[] args) throws Exception {

		//testAdd();
		testDelete();

	}
    public static void testAdd() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bhagyshri", "root", "root");

		int id = 8;
		String fname = "Palak";
		String lname = "Gupta";
		int salary = 20000;

		PreparedStatement ps = conn.prepareStatement("insert into employee values (?,?,?,?)");

		ps.setInt(1, id);

		ps.setString(2, fname);

		ps.setString(3, lname);

		ps.setInt(4, salary);

		int i = ps.executeUpdate();

		conn.close();
		ps.close();

	}
	public static void testDelete() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bhagyshri", "root", "root");

		
		
		PreparedStatement ps = conn.prepareStatement("delete from   employee where id =?");
		ps.setInt(1, 8 );

		int i = ps.executeUpdate();

		
		System.out.println(i + "deleted");

		conn.close();
		ps.close();
	}
	}
	

