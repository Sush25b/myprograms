package org.bridgelabz.alogrithm;

public class bubblesortString 
{
	/*Function to sort array using insertion sort*/
    void sort(String[] arr) 
    { 
        int n = arr.length; 
        
        int i,j;
        
      //array is 5---{0 to 4}
        for (i=0; i<n-1;i++)  //----will go 0 to 3
        { 
            //int val = arr[i];  
  
            String temp="";
            
            /* Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position */
           
           for(j=0;j<n-i-1;j++)
            { 
        	   if( arr[j].compareTo(arr[j+1])>0 ) 
                {
                	temp= arr[j];
                	arr[j] = arr[j+1];
                	arr[j+1]=temp;
                }
            } 
           
          //arr[j+1] = val;	 //#2 //(so add j+1 to put no at right location)
          
          printArray(arr); 	//will print each Recursion
        } 
    } 
    
		/* A utility function to print array of size n*/
	    static void printArray(String[] arr) 
	    { 
	        int n = arr.length; 
	        
	        System.out.println();
	        System.out.println();
	        for (int i=0; i<n; ++i)  //---0 to 3
	        {  
	        	System.out.print(arr[i] + " "); 
	        }
	    } 
		

	// Driver method 
    public static void main(String args[]) 
    {         
        String arr[] = {"ussh","ball","fat","zero","balls"};
  
        System.out.println("given string is: ussh,ball,fat,zero,balls");
        
        bubblesortString  ob = new bubblesortString();    
        
        ob.sort(arr); 
          
    } 
}
