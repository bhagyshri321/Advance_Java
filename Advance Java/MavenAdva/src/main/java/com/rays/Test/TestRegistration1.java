package com.rays.Test;



import com.rays.Model.RegistrationModel;
import com.rays.Bean.RegistrationBean;

public class TestRegistration1 {
	public static void main(String[] args) throws Exception {
		testadd();
	}

	private static void testadd() throws Exception {
		RegistrationBean bean = new RegistrationBean();
		
		bean.setfName("rahul");
		bean.setlName("singh");
		bean.setDob("02/02/1999");
		bean.setAdd("indore");
		mailto:bean.setEmail("rahul@gmail.com");
		bean.setGender("male");
		bean.setLang("HTML");
		
	RegistrationModel model = new RegistrationModel();
		
	   model.testAdd(bean);
		System.out.println("Success");
		
	}

}
