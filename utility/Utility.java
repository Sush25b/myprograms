//sushant

package org.bridgelabz.utility;

import java.util.Random;
import java.util.Scanner;

public class Utility 
{
	static Scanner sc=new Scanner(System.in);

	 static int counter=0;
	 
	public static void harmonicno(int N)
	{   double sum=0.0;
		for(int i=1;i<=N;i++)
		{
			sum = sum+((1.0/i));
			System.out.println("H"+i+" ---- "+ sum);
		}
	}
	

	public static void powerof2(int N)
	{ 
		int mul;
	
			for(int i=1;i<=N;i++)
			{
		
					mul=2*i;
					System.out.println("2^ "+i +" ="+ mul);
			}
	
	}
	
	
	// A function to print all prime factors 
    // of a given number n 
	public static void primefactor(int n)
	{  
	        // Print the number of 2s that divide n 
	        while (n%2==0) 
	        { 
	            System.out.print(2 + " "); 
	            n =(n/ 2); 
	        } 
	  
	        // n must be odd at this point.  So we can 
	        // skip one element (Note i = i +2) 
	        for (int i = 3; i <= Math.sqrt(n); i=i+ 2) ////3 5 7 9 
	        { 
	            // While i divides n, print i and divide n 
	            while (n%i == 0) 
	            { 
	                System.out.print(i + " "); 
	                n =(n/ i); 
	            } 
	        } 
	  
	        // This condition is to handle the case whien 
	        // n is a prime number greater than 2 
	        if (n > 2) 
	            System.out.print(n); 
	  } 
	
		
	public static void twodarray()
	{  
		int i,j;

		int arr[][]=new int[3][3];   
		
	
				for(i=0;i<3;i++)
				  {  
					System.out.println("enter elements for the row no:"+i);
					for(j=0;j<3;j++)
					{  
							arr[i][j]=sc.nextInt();  
					}  
					System.out.println();  
				  } 
				
		//printing 2D array  
		for(i=0;i<3;i++)
		  {  
			for(j=0;j<3;j++)
			{  
					System.out.print(arr[i][j]+" ");  
			}  
			System.out.println();  
		  }  
	}
	
	
	//Prints all triplets in arr[] with 0 sum 
	public static void findTriplets(int[] arr, int n) 
	{ 
			boolean found = true; 
				for (int i=0; i<n-2; i++) 
				{ 
					for (int j=i+1; j<n-1; j++) 
					{ 
						for (int k=j+1; k<n; k++) 
						{ 
								if (arr[i]+arr[j]+arr[k] == 0) 
								{ 
									System.out.print(arr[i]); 
									System.out.print(" "); 
									System.out.print(arr[j]); 
									System.out.print(" "); 
									System.out.print(arr[k]); 
									System.out.print("\n"); 
									
									found = true; 
								} 
						} 
					} 
				} 

				// If no triplet with 0 sum found in array 
				if (found == false) 
					System.out.println(" not exist "); 
	} 
	
	
	/**
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 */
	public static void distance(double x1, double y1, double x2, double y2) 
	{
		double dis = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));  

		System.out.println("distance between the points:" + dis);
	}
	

	
			//here we use Math random fuction 
		    // return a random coupon between 0 and n-1
		    public static int getrandomCoupon(int n) 		//if n=162
		    {
		        return (int)(Math.random() * n);			//then {162 *0.7 =...}----anything will multiple by 162
		    }

		    // return number of cards you collect before obtaining one of each of the n types
		    public static long collect(int n) 				//#1 //if n=162
		    {
		    	//#2 //then make array of 162
		        boolean[] arr= new boolean[n];  // isCollected[i] = true if card type i already collected
		        
		        System.out.println("their distinct coupon are :");
		        
		        int count = 0;                           // number of cards collected generated distinct/non distinct 
		        int nos= 0;                       // number of distinct card types collected

		        // repeat until you've collected all n card types
		        while (nos < n) 
		        {
		            int value = getrandomCoupon(n);         // getrandomCoupon(n)-----will return a random card 
		            count++;                             // one more card
		            
		            //whole array is by default false/null
		            if (!arr[value]) 						//#3 //if value=162*0.7--- then check in arr[value] if their is true or not  
		            {           //#4 // false at arr[162] means we not got nos yet
		                nos++;
		                arr[value] = true;		//set arr
		                System.out.print(value +" , ");
		            }
		        }
		        return count;
		    }
		 
////Stopwatch time=====================================================================================================

	  public long stopwatch() 
	  {
				// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter the number to start----stopwatch");
				int s=sc.nextInt();
				
				long start = System.currentTimeMillis();
				
				System.out.println("Enter the number to start----stopwatch");
				int e=sc.nextInt();
				
			    long now = System.currentTimeMillis();
			       
			    ///calculating the difference between------{the two nos enetered}
			      return (long) ((now - start) / 1000.0);
				
	   }

	
////Find Roots of Quadratic========================================================================================
	
	  public static void rootsofQuadratic(int a, int b, int c)
	  {
			int d = b * b - 4 * a * c;
			
			if (d > 0)
			{
				System.out.println("Roots of the equation are real and unequal");
				
				double root1 = (-b + Math.sqrt(d)) / (2 * a);
				double root2 = (-b - Math.sqrt(d)) / (2 * a);
				
				System.out.println("First root is:" + root1);
				  System.out.println("Second root is:" + root2);
			} 
			else 
				   if (d == 0)
					{
						System.out.println("Roots of the equation are real and equal");
						
						double root1 = (-b + Math.sqrt(d)) / (2 * a);
								System.out.println("Root:" + root1);
					}
					else 
					{
						
							System.out.println("Roots of the given equation are imaginary");
					}

		}
	  
	  
	  
////Weather windchill ===============================================================================================
	  public static void  WeatherService(int temp,int speed)
	  {
		  if ( (temp > 50) && ( speed > 3  &&  speed < 120 ) ) 
		    {
				System.out.println("The temperature is: " + temp + "  ,,,The windspeed is: " + speed);
				
				System.out.print("The speed to the power 0.16 is ");
				
					double speedpow = Math.pow(speed, 0.16);
				System.out.println(speedpow);
				
				double windchill = (35.74 + 0.6125 * temp + (0.4275 * temp - 35.75) * speedpow);
				System.out.println("The Weather windchill is:" + windchill);
			}
		  else
		    {
				System.out.println("Enter correct temperature and windspeed");

			}
	  }
	  

////Prime no between 1 10 1000========================================================================================
	  
	  public static void  primenos(int start,int end)
	  {
		  	for (int i = start; i <= end; i++)
		  	{  
		  			if (isPrime(i)) 
		  			{  
		  				System.out.println(i+"  it is palindrome");  
		  			} 
		  			
		  			
		  	}  
      
	  }  
  
	  public static boolean isPrime(int n) //e.g n=15 any no----from the given range
	  {  
		  		if (n <= 1)  //e.g n=15
		  		{  
		  			return false;  
		  		}  
      
		  	//e.g n=15
		  	for (int i = 2; i <= Math.sqrt(n); i++) //------use math.sqrt(n) or use n/2
		  	{  
		  			if (n % i == 0)
		  			{  
		  					return false;  
		  			}  
		  	}  
       
		  	return true;  
      
	  }    
	  
////Prime no between 1 10 1000========================================================================================

	  public static void  primenos2(int start,int end)
	  {	 
	  
		    //make any size array
		  	int[] arr=new int[end]; 
		  	
		  	for (int i = start; i <= end; i++)
		  	{  
		  			if (isPrime2(i)) 
		  			{  
		  				counter++;
		  				
		  				arr[counter]=i;
		  				
		  			    palindrome(i);
		  			
		  			}  
		  	}  
		  	
			System.out.print("prime and anagram and palindrome nos r as follows:");
		  	for (int k=0; k<counter; k++)
			  	{  
		  			
			  			System.out.print(arr[k]+" ");
			  		
			  	}
	  }  
  
	  public static boolean isPrime2(int n) //e.g n=15 any no----from the given range
	  {  
		  		if (n <= 1)  //e.g n=15
		  		{  
		  			return false;  
		  		}  
      
		  	//e.g n=15
		  	for (int i = 2; i <= Math.sqrt(n); i++) //------use math.sqrt(n) or use n/2
		  	{  
		  			if (n % i == 0)
		  			{  
		  					return false;  
		  			}  
		  	}  
       
		  	return true;  
	  }    
	  
	  public static int palindrome(int m)
	  {
		  int r,sum=0,temp; 
		  
		  //It is the number variable to be checked for palindrome  
		  
		  temp=m;    
		  
		  while(m>0)
		  {    
		     r =   m % 10;  //getting remainder  
		     sum= ( sum * 10 ) + r;    
		     m = m / 10;    
		  }    
		  
		  if(temp==sum)  
		  {
			 System.out.println( temp +"  it is palindrome"); 
			  return sum;   	  
		  }
		  else    
			  return sum; 
	  }
	
	  
}
