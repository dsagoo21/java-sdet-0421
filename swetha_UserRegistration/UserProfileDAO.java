package UserRegistration;

import java.util.ArrayList;
import java.util.Scanner;


public class UserProfileDAO {

	ArrayList<UserProfile> javaSDETClass = new ArrayList();
	
	
	public void addUser(UserProfile User) {
		javaSDETClass.add(User);
	}
	
	public void displayUsers() {
		for (int j = 0; j < javaSDETClass.size(); j++)
		{
				System.out.println("First Name - " + javaSDETClass.get(j).getFirstname());
				System.out.println("Last Name - " + javaSDETClass.get(j).getLastName());
				System.out.println("Email Address - " + javaSDETClass.get(j).getEmailAddress());
				System.out.println("Password - " + javaSDETClass.get(j).getPassword());
				System.out.println("ConfirmPassword - " + javaSDETClass.get(j).getConfirmPassword());
				
				System.out.println("**********************************************************");
				}
	}

	public void UpdateUser(String name)
	{
		Scanner upd=new Scanner(System.in);
		
		for (int j = 0; j < javaSDETClass.size(); j++)
		{
			if (javaSDETClass.get(j).getFirstname().equals(name))
			{
				System.out.println("Enter Updated value for First Name - " );
			    javaSDETClass.get(j).setFirstname(upd.nextLine());
			    
			    System.out.println("Enter Updated value for Last Name - " );
			    javaSDETClass.get(j).setLastName(upd.nextLine());
			    
			    System.out.println("Enter Updated value for email address - " );
			    javaSDETClass.get(j).setEmailAddress(upd.nextLine());
			    
			    System.out.println("Enter Updated password - " );
			    javaSDETClass.get(j).setPassword(upd.nextLine());
			    
			    System.out.println("Enter Updated Confirmpassword - " );
			    javaSDETClass.get(j).setConfirmPassword(upd.nextLine());
			   
			}
				
				
		}
	}
	
	public void DeleteUser(String name)
	{
		//Scanner upd=new Scanner(System.in);
		
		for (int j = 0; j < javaSDETClass.size(); j++)
		{
			if (javaSDETClass.get(j).getFirstname().equals(name))
			{
				
			    javaSDETClass.remove(j);
			}   
			    
			    
			   
				
				
		}
	}
}
