package com.walmart.sdet421;

import java.util.Scanner;

public class Consonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in=new Scanner(System.in);
		 System.out.print("Input the string: ");
	        String str = in.nextLine();
		
	        System.out.println("number of Consonants in the  string:"+" "+ countConsonants(ReplaceConsonants(str)));
	        System.out.println("Replaced Consonants in the  string:"+" "+ ReplaceConsonants(str));
		
	}
		public static String ReplaceConsonants(String str)
	    {
	        String newString=" ";
	        for (int i = 0; i < str.length(); i++)
	        {
	            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
	                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
	            {
	                newString=newString+str.charAt(i);
	            }
	            
	            else if (str.charAt(i) >='a'&&str.charAt(i) <='z')
	            {
	                newString=newString+"*";
	                }
	            else 
	            {
	            	newString=newString+str.charAt(i);
	            }
	        }
	        return newString;
	        
	}
		public static int countConsonants(String str)
	    {
	        int count = 0;
	        for (int i = 0; i < str.length(); i++)
	        {
	            if (str.charAt(i) == '*')
	            {
	                count++;
	            }
	        }
	        return count;

}
}
