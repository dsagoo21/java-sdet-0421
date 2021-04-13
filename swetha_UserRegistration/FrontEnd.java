package UserRegistration;

import java.util.Scanner;

public class FrontEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char Question;

		Scanner reader=new Scanner(System.in);
		Scanner qes = new Scanner (System.in);
		String fname;
		UserProfileDAO javaSDETClass = new UserProfileDAO();	
		
			do
			{
				UserProfile user = new UserProfile();
				
				System.out.println("Enter First Name:");
				user.setFirstname(reader.nextLine());
				
				System.out.println("Enter Last Name:");
				user.setLastName(reader.nextLine());
				
				System.out.println("Enter Email Addresss:");
				user.setEmailAddress(reader.nextLine());
				
				System.out.println("Enter Password:");
				user.setPassword(reader.nextLine());
				
				System.out.println("Enter ConfirmPassword:");
				user.setConfirmPassword(reader.nextLine());

				
				javaSDETClass.addUser(user);
				

	                while(!user.getPassword().equals(user.getConfirmPassword()))
	                { 
	                	System.out.println("password and confirm password are not matching plaese enter again");
	                	
	                	System.out.println("Enter Password:");
	    				user.setPassword(reader.nextLine());
	    				
	    				System.out.println("Enter ConfirmPassword:");
	    				user.setConfirmPassword(reader.nextLine());
	                }
	               
	           			
			
	                System.out.println("would you like add another user profile ?(Y/N)");
				
	                Question=qes.next().charAt(0);
				
			}while (Question=='Y');	
			
	//reader.close();
	//qes.close();

	javaSDETClass.displayUsers();
	
	Question='N';
	
	System.out.println("would you like update a user profile ?(Y/N)");
	Question=qes.next().charAt(0);
		
		while (Question=='Y')
		{
			System.out.println("Enter the first name to find and update");

			fname = reader.nextLine();
			
			javaSDETClass.UpdateUser(fname);
			Question ='N';
			System.out.println("would you like update another user profile ?(Y/N)");
			Question=qes.next().charAt(0);
			
		}
		
		javaSDETClass.displayUsers();
		
		Question='N';
		
		System.out.println("would you like delete a user profile ?(Y/N)");
		Question=qes.next().charAt(0);
			
			while (Question=='Y')
			{
				System.out.println("Enter the first name to find and delete");
				//String fname;
				fname = reader.nextLine();
				
				javaSDETClass.DeleteUser(fname);
				Question ='N';
				System.out.println("would you like delete another user profile ?(Y/N)");
				Question=qes.next().charAt(0);
				
			}
			javaSDETClass.displayUsers();
	}
}
