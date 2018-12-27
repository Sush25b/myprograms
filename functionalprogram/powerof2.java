package org.bridgelabz.functionalprogram;

import java.util.Scanner;

import org.bridgelabz.utility.Utility;

public class powerof2 
{
		public static void main(String srgs[])
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("eneter the N nos to print table");
			int n=sc.nextInt();
			
			Utility.powerof2(n);
		}
}
/*
eneter the N nos to print table
3
2^ 1 =2
2^ 2 =4
2^ 3 =6
*/