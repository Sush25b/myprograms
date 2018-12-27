package org.bridgelabz.functionalprogram;

import java.util.Scanner;

import org.bridgelabz.utility.Utility;



public class harmonic
{
			public static void main(String srgs[])
			{
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter the number upto calculate harmonic series");
				int n=sc.nextInt();
				
				Utility utility = new Utility();

				utility.harmonicno(n);
				
			}

}

/*
eneter the N nos to find harmonic
10
H1 ---- 1.0
H2 ---- 1.5
H3 ---- 1.8333333333333333
H4 ---- 2.083333333333333
H5 ---- 2.283333333333333
H6 ---- 2.4499999999999997
H7 ---- 2.5928571428571425
H8 ---- 2.7178571428571425
H9 ---- 2.8289682539682537
H10 ---- 2.9289682539682538
*/