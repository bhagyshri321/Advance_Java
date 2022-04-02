import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Testget {
	
	public static void main(String[] args) throws Exception {
		
		//testselect(4);
		//testGet(5);
		 //testUpdate();
		testDelete();
	}

	   private static void testGet(int pk) throws Exception {
		
       Class.forName( "com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bhagyshri", "root" ,"root" );
		
		Statement smt  = conn.createStatement();
		
		ResultSet rs  = smt.executeQuery("Select * from employee where id = "+pk);
		
		//int i = smt.executeUpdate("insert into employee values (6,'Sneha','Gupta', 5000)");
		while(rs.next()){
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
		}
	smt.close();
	conn.close();
	
				
	}

	      public  static void testUpdate() throws Exception {
		
         Class.forName( "com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bhagyshri", "root" ,"root" );
		
		Statement smt  = conn.createStatement();
		
		int rs  = smt.executeUpdate("update  employee set fname = 'Ram' , lname ='Gupta' , salary = 15000 where id = 3 ");	
	
	
	
	System.out.println(rs +"updated");
	
	smt.close();
	conn.close();  
	}
	      

	      public  static void testDelete() throws Exception {
	  		
	          Class.forName( "com.mysql.jdbc.Driver");
	 		
	 		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bhagyshri", "root" ,"root" );
	 		
	 		Statement smt  = conn.createStatement();
	 		
	 		int rs  = smt.executeUpdate("delete from  employee   where id = 8 ");	
	 	
	System.out.println(rs +"deleted");
	 	
	 	smt.close();
	 	conn.close();  
	 		
	  }}
