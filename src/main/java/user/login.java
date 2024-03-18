package user;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class login {
	
	static HashMap<String, String> dict = new HashMap<>();
	static Scanner sc = new Scanner(System.in);
	static int a = 0, f = 0;
	
	public boolean email(String uemail) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
		Pattern pat = Pattern.compile(emailRegex);
		if (uemail == null)
			System.out.println("Email cannot be null");
		if(pat.matcher(uemail).matches()) {
			System.out.println("Valid email .");
			return true;
		}
		System.out.println("Invalid email .");
		return false;
	}
	
	public boolean passwordcheck(String upassw) {
		String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{6,6}$";
	Pattern p = Pattern.compile(regex);
	if (upassw == null) {
			System.out.println("Invalid password");
	        return false;
	 }
	if(p.matcher(upassw).matches()) {
		System.out.println("Valid password .");
		return true;
	}
	else {
		System.out.println("Invalid password");
	return false;
	}
}
	
	
	
		
	
	public void login() {
		System.out.println("Enter your email :");
		String uemail1 = sc.next();
		System.out.println("Enter your password :");
		String upassw1 = sc.next();
		if(upassw1.equals(dict.get(uemail1))) {
			System.out.println("Welcome user .");
			System.out.println("You have logged in successfully .");
			return ;
		}
		else {
			System.out.println("Wrong password .");
		}
	}
	
	public void forgotpassword() {
		System.out.println("Enter email :");
		String uemail2 = sc.next();
		System.out.println("Enter new password : * length should be 6 only");
		String unewpassw = sc.next();
		if(unewpassw.length()>=6) {
			dict.put(uemail2,unewpassw);
		}
		else
			System.out.println("Invalid password");
	}
	public void registeration() {
		System.out.println("Enter email :");
		String uemail = sc.next();
		if(dict.containsKey(uemail)) {
			System.out.println("You are already registered .");
			return ;
		}
		if(email(uemail))
		{
			System.out.println("Enter password : * length should be 6 only");
			String upassw = sc.next();
			if(passwordcheck(upassw)) {
				dict.put(uemail, upassw);
				System.out.println("You are registered successfully .");
				return ;
			}
			else
				return ;
		}
		System.out.println("Invalid email .");
		}
	public static void main(String args[])
	{
		
		while(a!=4) {
		System.out.println("Hey!! Welcome ");
		System.out.println("Select from the below dropdown");
		System.out.println("1.Login");
		System.out.println("2.Register");
		System.out.println("3.Forgot Password");
		System.out.println("4.End the session");
		
		a = sc.nextInt();
		
		login ob = new login();
		switch(a) {
		case 1:
			ob.login();
			
			break;
		case 2:
			ob.registeration();
			break;
		case 3:
			ob.forgotpassword();
			break;
		case 4:
			f=1;
			break;
		}
		if(f==1)
			break;
		
		}
		
	}
}











