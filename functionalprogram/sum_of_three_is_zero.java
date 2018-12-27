package org.bridgelabz.functionalprogram;

import org.bridgelabz.utility.Utility;

//A simple Java program to find three elements 
//whose sum is equal to zero 
public class sum_of_three_is_zero
{
	
	public static void main(String[] args) 
	{ 
	 int arr[] = {0, -1, 2, -3, 1}; 
	 
	 int n =arr.length; 
	 
	 Utility.findTriplets(arr, n); 

	} 
}
/*
0 -1 1
2 -3 1
*/




