import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class TestStuRegistration {

    HashMap<String,Applicant> stuAccount = new HashMap<>();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void test1() throws DuplicateFormatFlagsException {
        Applicant applicant = new Applicant("s123", "qwer", "s123@google.com");
        Assert.assertTrue(StuRegistration.register(stuAccount, applicant));
    }
    @Test(expected = DuplicateFormatFlagsException.class)
    public void testDuplicateFormatFlagsException() throws DuplicateFormatFlagsException {
        Applicant applicant = new Applicant("s123", "qwer", "s123@google.com");
        StuRegistration.register(stuAccount, applicant);
        Applicant applicant2 = new Applicant("s123", "qwer", "s123@google.com");
        StuRegistration.register(stuAccount,applicant2);


    }

}


