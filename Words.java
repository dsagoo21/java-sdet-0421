package com.walmart.sdet421;

import java.util.Scanner;

public class Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		 System.out.print("Input the string: ");
	        String str = in.nextLine();
		
		System.out.println("number of words in the  string:"+" "+ count_Word(str));
	}
		public static int count_Word(String str)
	    {
	        int count = 0;
	        for (int i = 0; i < str.length(); i++)
	        {
	            if (str.charAt(i) == ' ')
	            {
	                count++;
	            }
	        }
	        return count+1;
	    
	}

}
