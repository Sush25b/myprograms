package org.bridgelabz.alogrithm;

public class insertionsortString 
{
		/*Function to sort array using insertion sort*/
		    void sort(String[] arr) 
		    { 
		        int n = arr.length; 
		        
		        int i,j;
		        for (i=0; i<n-1;i++)  
		        { 
		            String val = arr[i+1]; 
		  
		            /* Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position */
		         //   if (a[mid].compareTo(x) < 0)
		            
		           for(j=i;j>=0;j--)
		            { 
		                if(arr[j].compareTo(val)>0) 
		                {
		                	arr[j+1] = arr[j];
		                }
		                else
		                	break;
		            } 
		           
		          arr[j+1] = val;
		          printArray(arr); 
		        } 
		    } 
		  
		    /* A utility function to print array of size n*/
		    static void printArray(String[] arr) 
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
		       String arr[] = {"ussh","ball","fat","zero","balls"}; 
		  
		       insertionsortString  ob = new insertionsortString ();  
		       
		        ob.sort(arr); 

		    } 

	

}
