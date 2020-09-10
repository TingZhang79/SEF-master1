import java.util.*;


public class MainMenu {

	public static void main(String[] args) {
		int inputNum;
		boolean loop = true;
		HashMap<String,User> stuAccount = new HashMap<String, User>();	
		HashMap<String,User> AdminAccount = new HashMap<String,User>();
		HashMap<String,User> empAccount = new HashMap<String,User>();
		HashSet<User> provBlackList = new HashSet<User>();
		HashSet<User> permBlackList = new HashSet<User>();		
	    Admin admin = new Admin();
	    Applicant TestApplicant1 = new Applicant("Tester1","123456","testemail");
	    Applicant TestApplicant2 = new Applicant("Tester2","123456","testemai2");
	    admin.setUserName("admin");
	    admin.setUserPassword("123456");
	    AdminAccount.put(admin.userName, admin);
	    stuAccount.put(TestApplicant1.userName, TestApplicant1);
	    provBlackList.add(TestApplicant1);
	    stuAccount.put(TestApplicant2.userName, TestApplicant2);
	    provBlackList.add(TestApplicant2);
	  

       do {
    	   System.out.println
    	        (
    			  "*** MENU ***"+"\n"			   
    	   		+ "1 Log on as admin"+"\n"
    	   		+ "2 Log on as applicant"+"\n"
    	   		+ "3 Log on as employer"+"\n"
    	   		+ "4 Register as an applicant"+"\n"
    	   		+ "5 Register as an employer"+"\n"
//    	   		+ "6 Shortlist Projects"+"\n"
//    	   		+ "7 Form Teams Projects"+"\n"
//    	   		+ "8 Display Team Fitness Metrics"+"\n"
    	   		+ "9 Exit"
    	   		   	        );
    	   System.out.print("Enter Your Response: ");
    	   try {
    		   Scanner scan = new Scanner(System.in);
    		    inputNum = scan.nextInt();
    		   if(inputNum<=9&&inputNum>=1)
    		   {
    			   switch(inputNum) 
    			   {
    			   
    			    case 1:menuOption.log(AdminAccount,provBlackList,permBlackList);break;
    			    case 2:menuOption.log(stuAccount,provBlackList,permBlackList);break;
    			    case 3:menuOption.log(empAccount,provBlackList,permBlackList);break;
    			    case 4:StuRegistration.register(stuAccount);break;
    			    case 5:EmpRegistration.register(empAccount);break;
    			    case 9:return;

   			      			   
    			   }
    			     			   
    		   }
    		   else
    		   {
    			   System.out.println();
    			   System.out.println("Input Number out of boundary!");
    			   System.out.println();
    			   loop = true;
    			   continue;
    		   }
    		   
    	   }
    	   
    	   catch(Exception e) 
    	   
    	   {
    		   System.out.println();
    		   System.out.println("Numbers only!");
    		   System.out.println();
    		   loop = true;
    		   continue;
    		   
    	   }
    	   
       }while(loop);
	}

}
