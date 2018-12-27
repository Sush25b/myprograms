package org.bridgelabz.functionalprogram;

import java.util.Scanner;

import org.bridgelabz.utility.Utility;

public class Coupon
{
	public static void main(String srgs[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number to collect nos of Distict coupon");
		int n=sc.nextInt();
		
		Utility utility = new Utility();

		utility.collect(n);
	}
}
