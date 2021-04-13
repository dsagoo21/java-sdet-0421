package com.walmart.sdet421;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		 System.out.print("Input the string: ");
	        String str = in.nextLine();
		
		System.out.println("number of vowels in the  string:"+" "+ count_Vowels(str));
		in.close();
	}
		public static int count_Vowels(String str)
	    {
	        int count = 0;
	        for (int i = 0; i < str.length(); i++)
	        {
	            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
	                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
	            {
	                count++;
	            }
	        }
	        return count;
	    
	    	
	 
	}

}
