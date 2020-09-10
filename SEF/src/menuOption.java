import java.util.*;


public class menuOption {
	public static void log(HashMap<String,User> map,HashSet<User>provBlackList,HashSet<User>permBlackList) {
       Scanner scanner = new Scanner(System.in);
       while(true) 
       {
    	   System.out.println("Please input your account name:");
    	   String inputName = scanner.nextLine();
    	   System.out.println("Please input your account password:");
    	   String inputPassword = scanner.nextLine();
       if(Logon.logon(map,inputName,inputPassword))
       {
    	   String userType =map.get(inputName).getUserType();
    	   System.out.println("log on as "+userType+" successfully");
    	   switch(userType) 
    	   {
    	   case "Admin":PostLogon.postLogonAdmin(provBlackList,permBlackList);break;
    	   case "Applicant":PostLogon.postLogonApplicant();break;
    	   }    	   
    	   break;
       }
       else
       {
    	   System.out.println("Please re-try or exit press'r/e'");
    	   String nextInput = scanner.nextLine();
    	   if(nextInput.equals("r"))
    		   continue;
    	   else if(nextInput.equals("e"))
    		   break;
       }

       }
	}
//
	


}
