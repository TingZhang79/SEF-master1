

import java.util.HashMap;
import java.util.Scanner;

public class EmpRegistration {
	 public static void register(HashMap empAccount) {

	        String username;
	        String email;
	        String pwd;

	      
	        Scanner sc = new Scanner(System.in);
	        while (true) {
	            System.out.println("register system:(q:quit ok:start)");

	            String choice = sc.nextLine();
	            if ("q".equals(choice)) {
	                break;
	            }
	            System.out.println("input username:");
	            username = sc.nextLine();
	            if (empAccount.containsKey(username)) {
	                System.out.println("Username is duplicated, please renter another username");
	                continue;
	            }
	            if("".equals(username))
	            {
	                System.out.println("username can not be empty, please input your username!");
	                continue;
	            }
	            System.out.println("input password:");
	            pwd = sc.nextLine();
	            if("".equals(pwd))
	            {
	                System.out.println("password can not be empty,please input your password!");
	                continue;
	            }

	            System.out.println("input email:");
	            email=sc.nextLine();
	            if("".equals(email))
	            {
	                System.out.println("email can not be empty,please input your email!");
	                continue;
	            }
	            Employer employer = new Employer(username,pwd,email);

	            empAccount.put(username, employer);


	        }
	        System.out.println("all account:");
	        System.out.println(empAccount);

	    }
}
