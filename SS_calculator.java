package com.walmart.sdet421;

import java.util.Scanner;

public class SS_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X;
		int Y;
        char Operator;
        char con;
        
        
        Scanner reader= new Scanner(System.in);
        con ='Y';
        while (con=='Y')
        	{
		    con ='N';    
        	System.out.println("enter X value :\n");		        
        	X=reader.nextInt();
        	System.out.println("enter Y value :\n");     
        	Y=reader.nextInt();
        	System.out.println("enter Operator :\n");     
        	Operator=reader.next().charAt(0);
		        
		        switch(Operator)
		        { 
		        case '+':
		        	System.out.print(addition( X, Y));
		        	break;
		        case '-':
		        	System.out.print(substraction( X, Y));
		        	break;
		        case '*':
		        	System.out.print(multiplication( X, Y));
		        	break;
		        case '/':
		        	System.out.print(division( X, Y));
		        	break;
		        default:
		            System.out.println("Invalid option selected\n");
		        }
		    System.out.println("Do you want to perfrom another operation (Y/N) :\n");     
	        con=reader.next().charAt(0);    
        	}

	}

	public static int addition (int num, int num2) {
		return num + num2;
	}
	public static int substraction (int num, int num2) {
		return num - num2;
	}
	public static int multiplication (int num, int num2) {
		return num * num2;
	}
	public static int division (int num, int num2) {
		return num/num2;
	}
	}

