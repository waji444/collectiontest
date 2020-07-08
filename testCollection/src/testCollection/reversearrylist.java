package testCollection;
//8.Write a program to reverse ArrayList in java?(5)
import java.io.*; 
import java.util.*; 
  

public class reversearrylist {


    public static void main(String[] args) 
    { 
        ArrayList<Integer> ab = new ArrayList<Integer>(); 
  
        ab.add(new Integer(10)); 
        ab.add(new Integer(20)); 
        ab.add(new Integer(30)); 
        ab.add(new Integer(40)); 
        ab.add(new Integer(50)); 
        System.out.print("Elements before reversing: "); 
        printElements(ab); 
  
        Collections.reverse(ab); 
        System.out.print("\nElements after reversing: "); 
        printElements(ab); 
    } 
  
    public static void printElements(ArrayList<Integer> alist) 
    { 
        for (int i = 0; i < alist.size(); i++) { 
            System.out.print(alist.get(i) + " "); 
        } 
    } 
} 