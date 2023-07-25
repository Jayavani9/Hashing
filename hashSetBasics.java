import java.io.*;
import java.util.*;

public class hashSetBasics {
    public static void main(String args[])
    {
        
        //Create a hashset of type String 
        HashSet<String> set = new HashSet<String>();
  
        //add method to add elements into the hashset. Returns false if already the ele is present in the set.
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("A"); //Cannot insert as already present
        System.out.println(set);
        set.clear(); //Clears the elements inside the set
        System.out.println(set);
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        set.add("F");
        System.out.println(set);
        System.out.println(set.contains("B"));
        System.out.println(set.contains("N"));
        set.remove("A");
        System.out.println(set);
        //Iterator to iterate along the values of the set
        Iterator<String> itr = set.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println(set.isEmpty()); //isEmpty ? retutns true or false
        System.out.println(set.size()); //size returns the number of ele present in the set
    }
}
