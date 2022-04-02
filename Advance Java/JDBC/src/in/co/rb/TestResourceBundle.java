package in.co.rb;

import java.util.ResourceBundle;

public class  TestResourceBundle {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rb.app");
		String Url = rb.getString("url");
		String driver = rb.getString("driver");
		String username = rb.getString("username");
		String password= rb.getString("password");
		
		System.out.println(driver);
		
		
	}

}
