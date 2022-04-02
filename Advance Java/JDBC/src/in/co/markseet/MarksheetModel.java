package in.co.markseet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class MarksheetModel {
	public static int nextpk() throws SQLException {
		
		int pk =0;
		 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bhagyshri", "root" ,"root" );
		 conn.setAutoCommit(false);
		 PreparedStatement ps = conn.prepareStatement("select max(id) from marksheetbean");
		
		 
		 ResultSet rs =ps.executeQuery();
		while (rs.next()) {
			pk= rs.getInt(1);
		}
		 
		 return pk+1;
		
	}
	
	
  public void testadd(MarksheetBean bean) throws ClassNotFoundException, Exception {
		ResourceBundle rb= ResourceBundle.getBundle("in.co.rb.app");
      Class.forName(rb.getString(rb.getString("driver")) );
		
   Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("username"), rb.getString("password"));

    conn.setAutoCommit(false);

    PreparedStatement ps = conn.prepareStatement("insert into marksheetbean values (?,?,?,?,?,?,?)");

      ps.setInt(1, nextpk() );
      
      ps.setInt(2, bean.getROLLNO());

      ps.setString(3, bean.getFNAME());

      ps.setString(4, bean.getLNAME());

      ps.setInt(5, bean.getMATHS());
      
      ps.setInt(6, bean.getCHEM());
      
      ps.setInt(7, bean.getPHY());
     
     

     int i = ps.executeUpdate();
     
     conn.commit();
     System.out.println(i +"inserted");

     conn.close();
      ps.close();
		
		}
	   

}
