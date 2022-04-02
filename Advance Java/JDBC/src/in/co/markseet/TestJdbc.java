package in.co.markseet;


import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	import com.mysql.jdbc.Connection;

	
public class TestJdbc {
	
	

		public static void main(String[] args) throws Exception {

			for (int i = 1; i <= 40; i++) {
				System.out.println("For User = " + i);
				TestJdbc();

			}

		}

		public static void TestJdbc() throws Exception {
			String sql = "SELECT id, rollno, fname,lname,phy,chem,maths  FROM MARKSHEETBEAN";

			java.sql.Connection conn = null;

			conn = JDBCDataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();
			System.out.println("Connection....started....");
			System.out.println("\t...........................");
			System.out.println("\tID\tRollNO\tFName\tLNAME\tPHY\tCHEM\tMATHS");
			System.out.println("\t...........................");
			while (rs.next()) {

				System.out.print("\t" + rs.getInt(1));
				System.out.print("\t" + rs.getInt(2));
				System.out.print("\t" + rs.getString(3));
				System.out.print("\t" + rs.getString(4));
				System.out.print("\t" + rs.getInt(5));
				System.out.print("\t" + rs.getInt(6));
				System.out.println("\t" + rs.getInt(7));
			}
			System.out.println("\t...........................");
		}}
	


