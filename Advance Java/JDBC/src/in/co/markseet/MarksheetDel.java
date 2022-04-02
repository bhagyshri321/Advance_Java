package in.co.markseet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;

public class MarksheetDel {

	public void testdelete(MarksheetBean bean1) throws ClassNotFoundException, Exception {
		
		ResourceBundle rb= ResourceBundle.getBundle("in.co.rb.app");
	      Class.forName(rb.getString(rb.getString("driver")) );
			
	   Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("username"), rb.getString("password"));

		conn.setAutoCommit(false);

		PreparedStatement ps = conn.prepareStatement("delete from  marksheetbean where id =?");
		
		ps.setInt(1, bean1.getID());

		int i = ps.executeUpdate();

		conn.commit();
		System.out.println(i + "inserted");

		conn.close();
		ps.close();
	}

}
