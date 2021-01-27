// Java program to demonstrate 
// working of HashSet 
import java.util.*; 

class hashSet
{ 
    public static void main(String[]args) 
    { 
        HashSet<String> h = new HashSet<String>(); //create a hash set

        //input values
        h.add("gfg"); 
        h.add("courses"); 
        h.add("ide"); 

      
        System.out.println(h);//printing entire set
        
        
        System.out.println(h.contains("ide"));//returns 'true' or 'false' if the value is present or not
        
       
        Iterator<String> i = h.iterator();  //using iterators
        
        while(i.hasNext())
        {
            System.out.print(i.next()+" ");
        }
        
        System.out.println(h.size());

        h.remove("ide");
        System.out.println(h.size());

        for (String s : h) {            //normal 'for each' approach
            System.out.print(s + " ");
        }

        System.out.println("\n" + h.isEmpty()); //returns true/false
        
    } 
} 
