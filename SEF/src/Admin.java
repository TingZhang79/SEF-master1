import java.util.*;
public class Admin extends User{

	boolean isAdmin = true;
	String UserType = "Admin";
	public static void main(String[] args) {

    	   
	}
	@Override
	public String toString() {
		return "Admin [userName=" + userName + ", userPassword=" + userPassword + "]";
	}
	public String getUserType() {
		return UserType;
	}
	public void setUserType(String userType) {
		UserType = userType;
	}
	

}
