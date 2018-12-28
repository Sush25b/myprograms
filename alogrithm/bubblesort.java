package org.bridgelabz.alogrithm;

public class bubblesort 
{
	/*Function to sort array using insertion sort*/
    void sort(int[] arr) 
    { 
        int n = arr.length; 
        
        int i,j;
        
      //NOTE 1: array is 5---{0 to 4}
        for (i=0; i<n-1;i++)  ////NOTE 2:----will go 0 to 3
        { 
  
            int temp=0;
            
            /* Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position */
           
           for(j=0;j<n-i-1;j++)
            { 
                if(arr[j] > arr[j+1]) 
                {
                	temp= arr[j];
                	arr[j] = arr[j+1];
                	arr[j+1]=temp;
                }
            } 
          
          printArray(arr); 	//will print each Recursion
        } 
    } 
    
		/* A utility function to print array of size n*/
	    static void printArray(int arr[]) 
	    { 
	        int n = arr.length; 
	        
	        System.out.println();
	        System.out.println();
	        for (int i=0; i<n; ++i)  ////NOTE 3:---0 to 4
	        {  
	        	System.out.print(arr[i] + " "); 
	        }
	    } 
		

	// Driver method 
    public static void main(String args[]) 
    {         
        int arr[] = {48,37,10,94,23}; 
  
        System.out.println("given string is:  {48,37,10,94,23};  ");
        bubblesort  ob = new bubblesort ();    
        
        ob.sort(arr); 
          
    } 
	
}
