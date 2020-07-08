package testCollection;

import java.awt.List;
import java.util.ArrayList;

//.Write a program to remove element from specified index of ArrayList?(5)
public class removeelement {
	 public static void main(String[] args) 
	    { 
	        ArrayList<Object> al = new ArrayList<>(); 
	        al.add(10); 
	        al.add(20); 
	        al.add(30); 
	        al.add(40); 
	        al.add(50); 
	  
	        // Calculate index of last element 
	        int xy = al.size() - 1; 
	  
	        // Delete last element by passing index 
	        al.remove(xy); 
	  
	        System.out.println("Modified ArrayList : " + al); 
	    } 
	} 

