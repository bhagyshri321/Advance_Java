package in.co.markseet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;

public class MarksheetUpdate {
	
	public void testUpdate(MarksheetBean bean) throws ClassNotFoundException, Exception {

		ResourceBundle rb= ResourceBundle.getBundle("in.co.rb.app");
		
	      Class.forName(rb.getString(rb.getString("driver")) );
			
	   Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("username"), rb.getString("password"));

		conn.setAutoCommit(false);

		PreparedStatement ps = conn.prepareStatement("Update marksheetbean set	 ROLLNO=?,FNAME=?,LNAME=?,MATHS=?,CHEM=?,PHY=?   where id =?");
		
		
	      
	      ps.setInt(1, bean.getROLLNO());

	      ps.setString(2, bean.getFNAME());

	      ps.setString(3, bean.getLNAME());

	      ps.setInt(4, bean.getMATHS());
	      
	      ps.setInt(5, bean.getCHEM());
	      
	      ps.setInt(6, bean.getPHY());
	      ps.setInt(7, bean.getID() );
	     
		int i = ps.executeUpdate();

		conn.commit();
		System.out.println(i + "updated");

		conn.close();
		ps.close();

}}
