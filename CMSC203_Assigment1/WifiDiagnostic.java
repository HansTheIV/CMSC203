import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.*;
public class WifiDiagnostic{
	static Scanner sc = new Scanner(System.in);
	public static void validate()
	{
		System.out.println("if that fixed the problem, enter 'yes'. if it did not, enter 'no'.");
	}
	public static void exiting()
	{
		System.out.println("Thank you for using the WIFIDiagnostic.");
		System.exit(0);
	}
	 public static boolean check()
	 {
		String inputcheck = sc.nextLine().toLowerCase();
		do
		{
			
			if ((!inputcheck.equals("yes")) && (!inputcheck.equals("no")))
			{
				System.out.println("Invalid input. enter either 'yes' or 'no'");
				inputcheck = sc.nextLine().toLowerCase();
			}
		}while ((!inputcheck.equals("yes")) && (!inputcheck.equals("no")));
		if(inputcheck.equals("yes"))
		{
			return true;
		}
		else { 
		return false;
		}
	 }
	
	public static void main(String[] args)
	{
		boolean checkinput;
		
			System.out.println("Thank you for using the wifi diagnostic.\nAs a first step, please restart your computer.");
			validate();
			 if(!check())
			 {
				 System.out.println("The next step is to reboot your router and try to connect.");
				 validate();
				 if(!check())
				 {
					 System.out.println("The next step is to make sure the cables connecting \nthe router are firmly plugged in and the router is getting power.");
					 validate();
					 if(!check())
					 {
						 System.out.println("The next step is to move your compuer closer to your router and attempt to connect.");
						 validate();
						 if(!check())
						 {
							 System.out.println("The next step is to Contact your ISP.\nWe're sorry we were unable to remedy your problem.");
							 
						 }else
						 {
							 exiting();
						 }
					 }
				 }else
				 {
					 exiting();
				 }
			 } else
			 {
				 exiting();
			 }
	}
}
