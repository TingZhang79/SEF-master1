import java.util.*;
import java.util.Scanner;

public class PostLogon {
public static void postLogonAdmin(HashSet<User>provBlackList,HashSet<User>permBlackList)
{
	int inputNum;
	boolean loop = true;
	
   do {
	   System.out.println
	        (
			  "*** MENU ***"+"\n"			   
	   		+ "1 View provisionally blacklisted member"+"\n"
	   		+ "2 View permenent blacklisted member"+"\n"
	   		+ "3 View applicants records"+"\n"
	   		+ "4 View employers records"+"\n"
//	   		+ "4 Capture Student Personalities"+"\n"
//	   		+ "5 Add Student Preferences"+"\n"
//	   		+ "6 Shortlist Projects"+"\n"
//	   		+ "7 Form Teams Projects"+"\n"
//	   		+ "8 Display Team Fitness Metrics"+"\n"
	   		+ "9 Exit to main menu"
	   		   	        );
	   System.out.print("Enter Your Response: ");
	   try {
		   Scanner scan = new Scanner(System.in);
		    inputNum = scan.nextInt();
		    scan.nextLine();
		   if(inputNum<=9&&inputNum>=1)
		   {
			   switch(inputNum) 
			   {
			   
			    case 1:
			    	for(User user:provBlackList)
			    	{
			    		System.out.println(user.getUserName());	
			    	}
			    	    System.out.println("Press 's' to select an user to put to permenent blacklist or press 'e' to exit:");
			    	    
			    	    String choice = scan.nextLine();
			    	   
			    	    if(choice.equals("s")) 
			    	    {
			    	    	System.out.println("please select an user account name");
			    	    String Stput = scan.nextLine();
			    	for(User user:provBlackList)
				    {
				    	if(Stput.equals(user.getUserName()));
				    	{
				    	permBlackList.add(user);
				    	provBlackList.remove(user);
				    	System.out.println(Stput+" successfully put into permentent blacklist");
				    	break;
				    	}
				    }
			    	    }  
			    	    else if(choice.equals("s"))
			    	    	break;
			    	    break;
			    case 2:for(User user:permBlackList)
			    	
			    		System.out.println(user.getUserName());
			    		break;
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
//
public static void postLogonApplicant() {
	int inputNum;
	boolean loop = true;
	
   do {
	   System.out.println
	        (
			  "*** MENU ***"+"\n"			   
	   		+ "1 Update Information"+"\n"
	   		+ "2 Update job preference"+"\n"
	   		+ "3 Update working availability"+"\n"
//	   		+ "4 Capture Student Personalities"+"\n"
//	   		+ "5 Add Student Preferences"+"\n"
//	   		+ "6 Shortlist Projects"+"\n"
//	   		+ "7 Form Teams Projects"+"\n"
//	   		+ "8 Display Team Fitness Metrics"+"\n"
//			+ "10 Upload CV"
	   		+ "9 Exit to main menu"
	   		   	        );
	   System.out.print("Enter Your Response: ");
	   try {
		   Scanner scan = new Scanner(System.in);
		    inputNum = scan.nextInt();
		   if(inputNum<=9&&inputNum>=1)
		   {
			   switch(inputNum) 
			   {
			   
			    case 1:
			    	Applicant applicant = new Applicant();
			    	applicant.updateInfo();

			    	break;
			    case 2:break;
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

//


}
