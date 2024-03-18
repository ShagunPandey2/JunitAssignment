package login.tests;

import org.junit.Test;
import user.login;
import static org.junit.Assert.assertTrue;
import org.junit.Assert;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;
public class testing {
	
	
@Test

	public void testEmail() {
		login ob = new login();
		Assert.assertFalse("Invalid email .",ob.email("shagun"));
		Assert.assertTrue("Valid email .",ob.email("shagun@gmail.com"));
		Assert.assertFalse("Invalid email .",ob.email("shagun@@.com"));
		Assert.assertFalse("Invalid email .",ob.email("shagun@.com"));
		Assert.assertFalse("Invalid email .",ob.email("@shagungmail.com"));
		Assert.assertFalse("Invalid email .",ob.email("@.com"));
		Assert.assertFalse("Invalid email .",ob.email("@..com"));
		Assert.assertFalse("Invalid email .",ob.email("@."));
		
	}


    @Test
    public void testEmailWithSpaces() {
    	testing obj=new testing();
        String emailWithSpaces = "  example@example.com  ";
  
        String cleanedEmail = obj.cleanEmail(emailWithSpaces);

        assertEquals("example@example.com", cleanedEmail);
    }

    private String cleanEmail(String email) {
        
        return email.trim();
    }


	
	
@Test

	public void testpassword(){
		login ob = new login();
		Assert.assertFalse("Invalid password .",ob.passwordcheck("12"));
		Assert.assertTrue("Valid password .",ob.passwordcheck("1aB@ab"));
		Assert.assertFalse("Invalid password .",ob.passwordcheck("1234567"));
		Assert.assertFalse("Invalid password .",ob.passwordcheck("abcdef"));
		Assert.assertFalse("Invalid password .",ob.passwordcheck("ABCD1@"));

	}
}

