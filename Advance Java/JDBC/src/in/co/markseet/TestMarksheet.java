package in.co.markseet;

public class TestMarksheet {
	
	public static void main(String[] args) throws Exception, Exception {
		
		//  testGet( 105);
		testadd();
		//testDel();
		//testupdate();
         // meritList();
         // select();
	}

	
	private static void select() throws Exception, Exception {
		 MarksheetSelect m=new  MarksheetSelect();
		 m.Get();
	}


	private static void testadd() throws Exception {
		
		 MarksheetBean bean = new MarksheetBean ();
		
		//bean.setID(5);
		bean.setROLLNO(107);
		bean.setFNAME("Priya");
		bean.setLNAME("R");
		bean.setMATHS(20);
		bean.setPHY(95);
		bean.setCHEM(30);
		
		MarksheetModel m= new MarksheetModel();
		 m.testadd(bean);
		
		}

private static void testDel() throws Exception {
	MarksheetDel md = new MarksheetDel();
	MarksheetBean bean1 = new MarksheetBean();
	bean1.setID(4);
	md.testdelete(bean1);
	}


public  static void testupdate() throws Exception, Exception {
	MarksheetBean bean = new MarksheetBean();
	bean.setID(2);
	bean.setROLLNO(105);
	bean.setFNAME("Nain");
	bean.setLNAME("Roy");
	bean.setMATHS(68);
	bean.setPHY(84);
	bean.setCHEM(94);
		MarksheetUpdate bean2 = new MarksheetUpdate();
	    bean2.testUpdate(bean);
	}

	
       public static void testGet(int i) throws Exception, Exception {
    	    MarksheetBean bean =  new MarksheetBean();
    	   bean.setROLLNO(i);
    	    MarksheetGet m = new MarksheetGet();
    	    
    	    m.Get(bean);
	
}
       private static void meritList() throws Exception {
    		
    	   MarksheetMerit mb =new MarksheetMerit();
   		mb.merit();
   		
   	}

}




	
	
	
