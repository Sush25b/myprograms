package org.bridgelabz.alogrithm;

import java.util.Scanner;

import org.bridgelabz.utility.Utility;

public class Anagram 
{
	    static boolean isAnagram(String str1, String str2) 
	    {  
	    //if their is place between two string--------- then replace it with "" 
	    	
	        //String s1 = str1.replaceAll("\\s", "");  
	        //String s2 = str2.replaceAll("\\s", "");  
	        
	       int c1[]= countAlpha(str1);
	       int c2[]= countAlpha(str2);
	        

	       		for(int i=0;i<26;i++)
	       		{
		    	   if(c1[i]!=c2[i])
		    	   {
		    		   return false;
		    	   }
	       		}
	       
	       return true;
	       
	    }
	    
	    static int[] countAlpha(String st) 
	    { 
	    	int count[]=new int[26];
	    
	       for(int i=0;i<st.length();i++)
	       {
	    	   char ch=st.charAt(i);
	    	   
	    	   if(ch>='A' && ch<='Z')
	    	   {
	    		  count[ch-65]++;
	    	   }
	    	   else
	    		   if(ch>='a' && ch<='z')
	    		   { 
	    			   count[ch-97]++;
	               }
	       }
	       return count;
	       
	    }
	    
	    public static void main(String[] args)  
	    {  
	    	Utility utility = new Utility();

	    	Scanner sc=new Scanner(System.in);
		
	    	System.out.println("Enter the 1st String:");
	    	String str1 = sc.next();
	    	
	    	System.out.println("Enter the 2nd String:");
	    	String str2 = sc.next();
		
	    	boolean status= isAnagram(str1,str2);  
	        
	    	 if (status) 
		        {  
	    		     System.out.println("it is a anagram");
		        }
	    	 else
	    	 	{  
    		     System.out.println("it is not a anagram");
	    	 	}
		        
	    }  
}
