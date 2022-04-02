package in.co.markseet;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public final class JDBCDataSource {

	private static JDBCDataSource jds = null;

	private ComboPooledDataSource ds = null;

	private JDBCDataSource() {

		try {

			ResourceBundle rb = ResourceBundle.getBundle("in.co.rb.app");

			ds= new ComboPooledDataSource();

			ds.setDriverClass(rb.getString("driver"));
			ds.setJdbcUrl(rb.getString("url"));
			ds.setUser(rb.getString("username"));
			ds.setPassword(rb.getString("password"));
			ds.setInitialPoolSize(5);
			ds.setAcquireIncrement(1);
			ds.setMaxIdleTime(20);
			ds.setMaxPoolSize(7);
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}

	}

	public static JDBCDataSource getInstance() {
		if (jds == null) {

			jds = new JDBCDataSource();

		}
		return jds;
	}

	public static Connection getConnection() {
		try {
			return getInstance().ds.getConnection();
		} catch (SQLException e) {
			return null;
		}

	}

	public static void closeConnection(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (Exception e) {
			}
		}
	}

	public static void trnRollback(Connection connection) throws Exception {
		if (connection != null) {

			try {
				connection.rollback();
			} catch (SQLException ex) {
				ex.printStackTrace();
				
			}
			}
		}
	}