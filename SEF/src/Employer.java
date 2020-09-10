
import java.util.ArrayList;

public class Employer extends User {
String email;
String UserType = "Employer";
boolean isAdmin;
boolean isEmployer;
boolean isBlacklist;
boolean isStudent;
String ref = "References";
String jobCategory;
String workStatus;
String key;

public Employer(String username, String pwd, String email) {
	this.email = email;
	this.userName = username;
	this.userPassword = pwd;
	
	}
public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getRef() {
	return ref;
}

public void setRef(String ref) {
	this.ref = ref;
}

public String getJobCategory() {
	return jobCategory;
}

public void setJobCategory(String jobCategory) {
	this.jobCategory = jobCategory;
}

public String getWorkStatus() {
	return workStatus;
}

public void setWorkStatus(String workStatus) {
	this.workStatus = workStatus;
}

public String getUserType() {
	return UserType;
}

public void setUserType(String userType) {
	UserType = userType;
}

public boolean isAdmin() {
	return isAdmin;
}

public void setAdmin(boolean isAdmin) {
	this.isAdmin = isAdmin;
}

public boolean isEmployer() {
	return isEmployer;
}

public void setEmployer(boolean isEmployer) {
	this.isEmployer = isEmployer;
}

public boolean isStudent() {
	return isStudent;
}

public void setStudent(boolean isStudent) {
	this.isStudent = isStudent;
}

public boolean isBlacklist() {
	return isBlacklist;
}

public void setBlacklist(boolean isBlacklist) {
	this.isBlacklist = isBlacklist;
}

public String getKey() {
	return key;
}

public void setKey(String key) {
	this.key = key;
}

@Override
public String toString() {
    return "Employer{" +
            "username='" + userName + '\'' +
            ", pwd='" + userPassword + '\'' +
            ", email='" + email + '\'' +
            '}';
}
  

public void addJob() {
	  
  }



}


