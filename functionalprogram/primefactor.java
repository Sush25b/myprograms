package org.bridgelabz.functionalprogram;

import java.util.Scanner;

import org.bridgelabz.utility.Utility;

public class primefactor 
{   
	public static void main(String srgs[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("eneter nos to find primefactor of it:");
		int n=sc.nextInt();
		
		System.out.println();
		Utility.primefactor(n);
	}
	
}

/*
 eneter nos to find primefactor of it:
315

3 3 5 7
 */
