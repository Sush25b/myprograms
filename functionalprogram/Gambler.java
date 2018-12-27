package org.bridgelabz.functionalprogram;

import java.util.Random;
import java.util.Scanner;

import org.bridgelabz.utility.Utility;

public class Gambler 
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		
		int goal = 3;				// gambler's desired bankroll

		int amount =0;
		
		Random rn=new Random();
		int randomno=rn.nextInt(6)+1; // {0 to 5} + 1 now to total  
		
		int bets = 0;        // total number of bets made
        int wins = 0;        // total number of games won
        int loose = 0; 
		
			while(amount<goal)
			{	
				bets++;
				
				System.out.println("eneter a no t bet 1 to 6");
				int n=sc.nextInt();
				
						if(randomno==n) //we can also take stake like 0 to 0.5
						{
							wins++;
							
							amount++;
							
							System.out.println(amount);
							
							if(amount>goal)
							{
									amount=amount-n;
									System.out.println(amount);
							}
						}
						else
						{
							loose++;
						}
					
			}
			 	
		// print results
        System.out.println("wins games won = " + ((100 * wins )/bets));
       // System.out.println("Avg # bets           = " + ((loose*100) / trials));
        
	}
}

/*
public class Gambler { 

	    public static void main(String[] args) {
	        int stake  = Integer.parseInt(args[0]);    // gambler's stating bankroll
	        int goal   = Integer.parseInt(args[1]);    // gambler's desired bankroll
	        int trials = Integer.parseInt(args[2]);    // number of trials to perform

	        int bets = 0;        // total number of bets made
	        int wins = 0;        // total number of games won

	        // repeat trials times
	        for (int t = 0; t < trials; t++) {

	            // do one gambler's ruin simulation
	            int cash = stake;
	            while (cash > 0 && cash < goal) {
	                bets++;
	                if (Math.random() < 0.5) cash++;     // win $1
	                else                     cash--;     // lose $1
	            }
	            if (cash == goal) wins++;                // did gambler go achieve desired goal?
	        }

	        // print results
	        System.out.println(wins + " wins of " + trials);
	        System.out.println("Percent of games won = " + 100.0 * wins / trials);
	        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
	    }

	}
*/

//---------------------my output--------------------
/*
 eneter a no t bet 1 to 6
 
1
1
eneter a no t bet 1 to 6
1
2
eneter a no t bet 1 to 6
1
3
wins games won = 100
*/



