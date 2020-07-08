package testCollection;
//6.Write a program to convert LinkedList to ArrayList?(5)


import java.util.*; 
import java.util.stream.*; 


public class convertlinkedlist {

    public static <T> List<T> convertALtoLL(List<T> aL) 
    { 
  
        List<T> ab = new LinkedList<>(); 
  
        for (T t : aL) {    
        	ab.add(t); 
        } 
               return ab; 
    } 
  
    public static void main(String args[]) 
    { 
        List<String> aL = Arrays.asList("apple","banan", "cherry"); 
  
        System.out.println("ArrayList: " + aL); 
  
        List<String>  lL = convertALtoLL(aL); 
  
        System.out.println("LinkedList: " + lL); 
    } 
} 