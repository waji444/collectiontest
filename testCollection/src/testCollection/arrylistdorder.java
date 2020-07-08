package testCollection;
//Write a program to sort ArrayList in descending order?(5)

import java.util.*;
public class arrylistdorder {
	
	   public static void main(String args[]){
		   ArrayList<String> arraylist = new ArrayList<String>();
		   arraylist.add("a");
		   arraylist.add("Z");
		   arraylist.add("C");
		   arraylist.add("F");

		   /*Unsorted List: ArrayList content before sorting*/
		   System.out.println("Before Sorting:");
		   for(String str: arraylist){
				System.out.println(str);
			}

		   /* Sorting in decreasing order*/
		   Collections.sort(arraylist, Collections.reverseOrder());

		   /* Sorted List in reverse order*/
		   System.out.println("ArrayList in descending order:");
		   for(String str: arraylist){
				System.out.println(str);
			}
		}
	}

