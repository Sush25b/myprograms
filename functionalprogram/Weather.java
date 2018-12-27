package org.bridgelabz.functionalprogram;

import java.util.Scanner;

import org.bridgelabz.utility.Utility;

public class Weather
{
	public static void main(String args[])
	{
		Utility utility = new Utility();

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the temperature--- greater than 50");
		int temp = sc.nextInt();
		
		
		System.out.println("Enter the wind speed--- between 3 and 120");
		int speed = sc.nextInt();
		
		Utility.WeatherService(temp, speed);

	}
}
