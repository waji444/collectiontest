package testCollection;

import java.util.HashSet;

//Write a program to convert HashSet to Array? (5)


public class hashtoarry {
	public static void main(String args[]) 
    { 
        HashSet<Integer> abs_col = new HashSet<Integer>(); 
  
        abs_col.add(1); 
        abs_col.add(5); 
        abs_col.add(3); 
        abs_col.add(2); 
        abs_col.add(5); 
        abs_col.add(3); 
  
        System.out.println("The HashSet: "+ abs_col); 
                           
  
        Object[] arr = abs_col.toArray(); 
  
        System.out.println("The array is:"); 
        for (int a = 0; a < arr.length; a++) 
            System.out.println(arr[a]); 
    } 
} 

