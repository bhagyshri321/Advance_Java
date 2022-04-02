package in.co.markseet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class MarksheetSelect {
	
	public void Get() throws ClassNotFoundException, Exception {
		
		
		ResourceBundle rb= ResourceBundle.getBundle("in.co.rb.app");
	      Class.forName(rb.getString(rb.getString("driver")) );
			
	   Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("username"), rb.getString("password"));

		conn.setAutoCommit(false);
		
		
		PreparedStatement ps = conn.prepareStatement("select * from marksheetbean  ");
		ArrayList a = new ArrayList();
		
		 System.out.println("MeritList \n");
		  System.out.println("\tID\tROLLNO\tPHY\tCHEM\tMATHS\tFNAME\tLNAME");
		
		ResultSet rs= ps.executeQuery();
		conn.commit();
		while(rs.next()){
			System.out.print("\t"+rs.getString(1));
			System.out.print("\t"+rs.getString(2));
			System.out.print("\t"+rs.getString(3));
			System.out.print( "\t"+rs.getString(4));
			System.out.print("\t"+rs.getString(5));
			System.out.print("\t"+rs.getString(6));
			System.out.println("\t"+rs.getString(7));
	      
		}   

		conn.close();
		ps.close();
		
		
		
	}

}
