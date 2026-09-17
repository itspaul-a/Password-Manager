package utilities;


import java.util.Scanner;

class Menu
{

	public static void mainMenu()
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to Password Manager\n");
		System.out.println("What would you like to do?");

		System.out.println("1. Enter new password\n 2. Search password\n 3. update password\n");

	}

	public static void main(String[] args) 
	{
		Login log = new Login();
		log.getPassword();
	}
}
