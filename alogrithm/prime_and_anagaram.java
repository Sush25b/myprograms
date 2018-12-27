package org.bridgelabz.alogrithm;

import java.util.Scanner;

import org.bridgelabz.utility.Utility;

public class prime_and_anagaram 
{
	 public static void main(String[] args) 
	   {   
	       Scanner s = new Scanner(System.in); 
	       
	       Utility utility = new Utility();
	       
	       System.out.print("Enter the first number : ");  
	       int start = s.nextInt();  
	       
	       System.out.print("Enter the second number : ");  
	       int end = s.nextInt();  
	       
	       System.out.println("List of prime numbers between " + start + " and " + end);  
	       
		   Utility.primenos2(start, end);
	   }
}
