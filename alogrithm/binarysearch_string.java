package org.bridgelabz.alogrithm;
import java.util.Arrays;

public class binarysearch_string
{
	    public static void main(String[] args) 
	    {

	        String array[]={"EWRSFSFSFSB","BB","AA","SDFSFJ","WRTG","FF","ERF","FED","TGH"};
	        
	        String ele = "BB";

	        Arrays.sort(array); ///to sort the String array

	        int ans= binarySearch(array,ele);
	        
	        System.out.println("given array is: EWRSFSFSFSB, BB, AA, SDFSFJ, WRTG, FF ,ERF, FED, TGH ");
		    System.out.println("ele no given is: "+ ele);
		        
		        
		        if(ans==1)
		        {
		        	System.out.println("The String ele is found ");
		        }
		        else
		        	System.out.println("The ele not found ");
	       
	    }

	    public static int binarySearch(String[] a, String x) {
	        int low = 0;
	        int high = a.length - 1;
	        int mid;

	        while (low <= high) 
	        {
	            mid = (low + high) / 2;

	            if (a[mid].compareTo(x) < 0)
	            {
	                low = mid + 1;
	            }
	            else 
	            	if (a[mid].compareTo(x) > 0) 
	            	{
	                high = mid - 1;
	            	} 
	            	else 
	            		{
	            			return mid;
	            		}
	       }

	        return -1;
	    }

}
