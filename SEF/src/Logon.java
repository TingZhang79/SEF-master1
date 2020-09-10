import java.util.HashMap;
import java.util.Scanner;

public class Logon {

	
	
public static boolean logon(HashMap<String,User> map,String inputName,String inputPassword) 
{
    
 
    if(map.containsKey(inputName))
    {
       
 	   if(map.get(inputName).userPassword.equals(inputPassword))
 	   { 	   	  
 		   
 	   return true;	
 	   }
 	   else
 		   System.out.println("invalid account password!");
    }
    else
    {
    	System.out.println("invalid account name!");
    }
	   return false;
}



}
