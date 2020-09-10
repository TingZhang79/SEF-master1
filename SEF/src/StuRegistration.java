import java.util.HashMap;
import java.util.Scanner;


public class StuRegistration{



    public static void register(HashMap stuAccount) {

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
            if (stuAccount.containsKey(username)) {
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
            Applicant applicant = new Applicant(username,pwd,email);

            stuAccount.put(username, applicant);


        }
        System.out.println("all account:");
        System.out.println(stuAccount);

    }
    public static boolean register(HashMap<String,Applicant> stuAccount, Applicant applicant) throws DuplicateFormatFlagsException {
        for (String name : stuAccount.keySet()) {
            if (name.equals(applicant.getUserName())) {
                throw new DuplicateFormatFlagsException("Duplicated name");
            }
        }
        stuAccount.put(applicant.getUserName(),applicant);
        return true;
    }
}


