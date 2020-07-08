package testCollection;
//Write a program to add element at particular index of ArrayList?(5)
import java.util.ArrayList;
import java.util.Arrays;

public class addelement {

    public static void main(String[] args) 
    {
        ArrayList<String> namesList = new ArrayList<String>(Arrays.asList( "alex", "brian", "charles") );
         
        System.out.println(namesList);  //list size is 3
         
        //Add element at 0 index
        namesList.add(0, "wajid");
         
        System.out.println(namesList);  //list size is 4
    }
}

