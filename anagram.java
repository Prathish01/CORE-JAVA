package str;

import java.util.Arrays;
import java.util.Scanner;

public class str 
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter 1st string:");
        String s1 = scn.next();

        System.out.println("Enter 2nd string:");
        String s2 = scn.next();

        // Convert to lowercase and remove spaces (Must reassign)
        s1 = s1.toLowerCase().replaceAll("\\s", "");
        s2 = s2.toLowerCase().replaceAll("\\s", "");

        if(s1.length() != s2.length())
        {
            System.out.println("Not an Anagram");
        }
        else 
        {
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if(Arrays.equals(arr1, arr2))
            {
                System.out.println("Anagram");
            }
            else
            {
                System.out.println("Not an Anagram");
            }
        }
    }
}
