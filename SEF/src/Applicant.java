import java.util.HashMap;
import java.util.Scanner;

public class Applicant extends User{

    String localStu;
    String InterStu;
    String email;
    String pastRecord = "Past employment records";
    String ref = "References";
    String qualification = "Qualification";
    String license = "License";
    String avaType = "Availability";
    String avaPeriod;
    String jobCategory;
    String workStatus;
    String UserType = "Applicant";
    boolean isAdmin;
    boolean isStudent;
    boolean isBlacklist;
    String key;



    public Applicant() {
    }

    public Applicant(String username, String pwd, String email) {
        this.userName = username;
        this.userPassword = pwd;
        this.email = email;
    }


    public String getLocalStu() {
		return localStu;
	}

	public void setLocalStu(String localStu) {
		this.localStu = localStu;
	}

	public String getInterStu() {
		return InterStu;
	}

	public void setInterStu(String interStu) {
		InterStu = interStu;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPastRecord() {
		return pastRecord;
	}

	public void setPastRecord(String pastRecord) {
		this.pastRecord = pastRecord;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getAvaType() {
		return avaType;
	}

	public void setAvaType(String avaType) {
		this.avaType = avaType;
	}

	public String getAvaPeriod() {
		return avaPeriod;
	}

	public void setAvaPeriod(String avaPeriod) {
		this.avaPeriod = avaPeriod;
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
        return "Applicant{" +
                "username='" + userName + '\'' +
                ", pwd='" + userPassword + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void updateInfo() {

        this.pastRecord = pastRecord;
        this.ref = ref;
        this.qualification = qualification;
        this.license = license;
        this.avaType = avaType;

        HashMap<String, String> applicant = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean selection = true;
        while (selection) {
            System.out.println("1.Past employment records" + "\n" + "2.References" + "\n" + "3.Qualification" + "\n" +
                    "4.License" + "\n" + "5.Availability" + "\n" + "q.Quit");
            System.out.println("Please input the selection you want to change:");
            String s = scanner.nextLine();
            if ("q".equals(s)) {
                break;
            }
            String key = "";
            switch (s) {
                case "1":
                    key = this.pastRecord;
                    break;
                case "2":
                    key = this.ref;
                    break;
                case "3":
                    key = this.qualification;
                    break;
                case "4":
                    key = this.license;
                    break;
                case "5":
                    key = this.avaType;
                    break;
            }
            System.out.println("input information:");
            String value = scanner.nextLine();
            applicant.put(key, value);
        }
        System.out.println(applicant);
        System.out.println("Your information updating successfully!");


    }
}

