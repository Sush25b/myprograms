package org.bridgelabz.functionalprogram;

import java.util.Scanner;

import org.bridgelabz.utility.Utility;

public class distance 
{
		public static void main(String args[]) 
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter x1 point");
			double x1 = sc.nextDouble();
			
			System.out.println("enter y1 point");
			double y1 = sc.nextDouble();
			
			System.out.println("enter x2point");
			double x2 = sc.nextDouble();
			
			System.out.println("enter y2 point");
			double y2 = sc.nextDouble();
			
			Utility.distance(x1, y1, x2, y2);

		}
}
/*
enter x1 point
4
enter y1 point
4
enter x2point
2
enter y2 point
2
distance between the points:2.8284271247461903
*/