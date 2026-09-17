import java.util.Scanner;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;



class Login
{
	String pass;

	public static void getPassword()
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to login");
		System.out.println("Please enter your password");
		String password = scan.nextLine();

		System.out.println("You typed: " + password);
	}

	public static String hashPassword(String password) throws NoSuchAlgorithmException
	{

		MessageDigest digest = MessageDigest.getInstance("SHA-256");

		byte[] encodedHash = digest.digest(password.getBytes(StandardCharsets.UTF_8));

		StringBuilder hexString = new StringBuilder();

		for(byte b : encodedHash)
		{
			String hex = Integer.toHexString(0xff & b);
			if(hex.length() == 1)
			{
				hexString.append('0');

			}

			hexString.append(hex);
		}

		return hexString.toString();
		
	}

	public String getPass() 
	{
		return pass;
	}

	public void setPass(String pass) 
	{
		this.pass = pass;
	}

}
