package testCollection;
//Write a program to sort HashMap by keys ? 
//SortedSet<String> keys = new TreeSet<String>(myHashMap.keySet());

import java.util.*; 
public class hashmapbykey {


//Java Code to sort Map by key value 

 

 // This map stores unsorted values 
 static Map<String, Integer> map = new HashMap<String, Integer>(); 

 // Function to sort map by Key 
 public hashmapbykey() 
 { 
     // TreeMap to store values of HashMap 
     TreeMap<String, Integer> sorted = new TreeMap<String, Integer>(); 

     // Copy all data from hashMap into TreeMap 
     sorted.putAll(map); 

     // Display the TreeMap which is naturally sorted 
     for (Map.Entry<String, Integer> entry : sorted.entrySet())  
         System.out.println("Key = " + entry.getKey() +  
                      ", Value = " + entry.getValue());         
 } 
   
 // Driver Code 
 public static void main(String args[]) 
 { 
     // putting values in the Map 
     map.put("Jayant", 80); 
     map.put("Abhishek", 90); 
     map.put("Anushka", 80); 
     map.put("Amit", 75); 
     map.put("Danish", 40); 

     // Calling the function to sortbyKey 
     sortbykey();
     


 }
} 
