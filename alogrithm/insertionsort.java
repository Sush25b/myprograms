package org.bridgelabz.alogrithm;

public class insertionsort 
{
	/*Function to sort array using insertion sort*/
	    void sort(int[] arr) 
	    { 
	        int n = arr.length; 
	        
	        int i,j;
	      //array is 5---{0 to 4}
	        for (i=0; i<n-1;i++)  //----will go 0 to 3
	        { 
	            int val = arr[i+1]; 
	  
	            /* Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position */
	           
	           for(j=i;j>=0;j--)
	            { 
	                if(arr[j] > val) 
	                {
	                	arr[j+1] = arr[j];
	                }
	                else
	                	break; 	//#1 //(now j is becomes less)
	            } 
	           
	          arr[j+1] = val;	 //#2 //(so add j+1 to put no at right location)
	          
	          printArray(arr); 	//will print each Recursion
	        } 
	    } 
	  
	    /* A utility function to print array of size n*/
	    static void printArray(int arr[]) 
	    { 
	        int n = arr.length; 
	        
	        System.out.println();
	        System.out.println();
	        for (int i=0; i<n; ++i) 
	        {   System.out.print(arr[i] + " "); 
	  
	        }
	    } 
	  
	    // Driver method 
	    public static void main(String args[]) 
	    {         
	        int arr[] = {12, 4, 1, 5, 6}; 
	  
	        insertionsort ob = new insertionsort();    
	        
	        ob.sort(arr); 
	          
	    } 

}
