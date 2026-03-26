package hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class hasstring 
{
    public static void main(String [] args)
    {
        String str = "java is an programming language";

        String[] words = str.split(" ");
        
        for(String w : words)
        {
            System.out.println(w);
        }
        
        Set set = new HashSet();
        
        for(String w : words)
        {
        	
        	set.add(w);
        }
        System.out.println("storing hasset into array");
        
        Object[] s1 = set.toArray(new String[0]);
        System.out.println(Arrays.toString(s1));
    }
     
}

converting string to set and then convert to array
