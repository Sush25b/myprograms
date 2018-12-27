package org.bridgelabz.functionalprogram;

import java.util.Scanner;

import org.bridgelabz.utility.Utility;

public class quadratic
{
	public static void main(String[] args)
	{
		Utility utility = new Utility();
		int a, b, c;

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Given quadratic equation:ax^2 + bx + c");
		
		System.out.print("Enter a:");
		a = sc.nextInt();
		
		System.out.print("Enter b:");
		b = sc.nextInt();
		
		System.out.print("Enter c:");
		c = sc.nextInt();
		
		System.out.println("Given quadratic equation:" + a + "x^2 + " + b + "x + " + c);
		
		Utility.rootsofQuadratic(a, b, c);
	}
}
/*
Given quadratic equation:ax^2 + bx + c
Enter a4
Enter b8
Enter c1
Given quadratic equation:4x^2 + 8x + 1
Roots of the equation are real and unequal
First root is:-0.1339745962155614
Second root is:-1.8660254037844386
*/
