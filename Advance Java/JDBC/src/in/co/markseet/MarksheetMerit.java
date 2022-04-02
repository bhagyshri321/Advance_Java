package in.co.markseet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class MarksheetMerit {
	
public static void merit() throws Exception {
		
	ResourceBundle rb = ResourceBundle.getBundle("in.co.rb.app");
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bhagyshri", "root", "root");
		
		
		PreparedStatement pr = conn.prepareStatement("SELECT fname,id,(phy+chem+maths) AS total ,(phy+chem+maths)/3 AS persent FROM marksheetbean WHERE (phy>40 AND chem>40 AND maths>40) ORDER BY total DESc LIMIT 0,6;"  );
				
				ResultSet r=pr.executeQuery();
				System.out.println( "MeritList \n");
				System.out.println("\tFName\tID\tTotle\tPersenteg");
				while (r.next()) {
					System.out.print("\t"+r.getString(1));
					System.out.print("\t"+r.getString(2));
					System.out.print("\t"+r.getString(3));
					System.out.println("\t"+r.getString(4));
					
					
				}
			    pr.close();
				conn.close();}}