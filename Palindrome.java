package com.walmart.sdet421;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Initialize Scanner method to capture the input parameter
		Scanner in=new Scanner(System.in);
		
		 System.out.print("Input the string: ");	        
		 String str = in.nextLine();	   
		 
		 //Convert the input parameter value to upper case
		 String UpperString=str.toUpperCase();	       	     
		 //System.out.println(UpperString+"   "+UpperString.length());
		 
		 //Capture the reverse string value to a new variable
		 String ReverseStr = Reverse(UpperString);	        	     
		 //System.out.println(ReverseStr+"   "+ReverseStr.length());
		//Compare the reverse string and the original uppercase value  
		 
		 if(UpperString.equals(ReverseStr))	     
		 {	    
			 System.out.println("input value "+str+" is a palindrome");	     
		 }				     	   
		 else    	     	   
		 {    		    		   
			 System.out.println("input value "+str+" is not a palindrome");
			 
		 }
		 
	}

	public static String Reverse(String str)
	{
		
		String ReverseString="";
		
        for (int i =str.length()-1; i>=0; i--)
        {
        	ReverseString=ReverseString+str.charAt(i);
        
        }
        
        return ReverseString;
       
        }
       
    
	}

