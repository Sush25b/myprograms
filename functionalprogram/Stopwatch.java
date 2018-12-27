package org.bridgelabz.functionalprogram;

import java.util.Scanner;

import org.bridgelabz.utility.Utility;

public class Stopwatch
{
	    public static void main(String[] args) 
	    {	
			Utility utility = new Utility();

			long t=utility.stopwatch();
			System.out.println("so the time seconds between two nos enetered is: "+ t);
	    } 
}
/*
Enter the number to start----stopwatch
1
Enter the number to start----stopwatch
2
so the time between two nos enetered is: 12
*/