package com.walmart.sdet421;

import java.util.Scanner;

public class LastLetterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		 System.out.print("Input the string: ");
	        String str = in.nextLine();
	       String[] words = str.split(" ");
	       String s="";
	       String y="";
	       String result="";
	       
	       
	       for (int i = 0; i < words.length; i++) {
	    	   if(words[i].endsWith("s") && s.isEmpty()) {
	    		   s=words[i];
	    	   }
	    	   if(words[i].endsWith("y") && y.isEmpty()) {
	    		   y=words[i];
	    	   }
	    	    // You may want to check for a non-word character before blindly
	    	    // performing a replacement
	    	    
	    	    
	    	}
	       System.out.println( "word ends with s "+s);
	       System.out.println( "word ends with y "+y);
	       
	       for (int i = 0; i < words.length; i++) {
	    	  
	    	   if(words[i].endsWith("s")&&y.length()!=0) {
	    		   
	    		   result=result+" "+y;
	    		   y="";
	    	   } else if(words[i].endsWith("y")&& s.length()!=0) {
	    		   result=result+" "+s;
	    		   s="";
	    	   }else {
	    	   result=result+" "+words[i];
	    	   }
	    	    
	    	}
	       //System.out.println( "word ends with s "+s);
	      // System.out.println( "word ends with y "+y);
	       System.out.println("result "+result);
	       
	
	
		
		System.out.println("number of words in the  string:"+" "+ LastLetter_Count(str));
	}
		public static int LastLetter_Count(String str)
	    {
	        int count = 0;
	        //String newString=" ";
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
