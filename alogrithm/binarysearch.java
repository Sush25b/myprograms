package org.bridgelabz.alogrithm;

public class binarysearch
{
		 public static int binarySearch(int arr[], int l, int h, int ele)
		 {  
		   int m= (l + h)/2;  
		   
		   while( l <= h)
		   {  
			   if (arr[m] == ele)
		       {  
		            return 1; 
		       }
			   else
				   if(arr[m]>ele )
				   {
					   h= m- 1;
				   }  
				   else
					   if ( arr[m]< ele)
					   {  
						   l= m+ 1;     
					   }
		   }   
		   return 0;
		 }  
		 
		 public static void main(String args[])
		 {  
		        int arr[] = {10,20,30,40,50}; 
		        
		        int ele = 30;  
		        
		        int l=0;
		        int h=arr.length-1;
		        
		        int ans=binarySearch(arr,l,h,ele); 
		      
		    System.out.println("ele no given is: {10,20,30,40,50} ");
		    System.out.println("ele no given is: "+ ele);
		        
		        
		        if(ans==1)
		        {
		        	System.out.println("The ele is fount at location");
		        }
		        else
		        	System.out.println("The ele not fount at location");
		 }  
		 
}
