import java.util.Scanner;
class test4
   {
	   public static void main(String[] args) { 
        Scanner scn =new Scanner(System.in); 
        System.out.println("enter a string"); 
        String s=scn.nextLine(); 
        print(s); 
    } 
    public static void print(String s) 
    { 
        char ch=' '; 
        String rev=""; 
        for(int i=s.length()-1; i>=0; i--){ 
            ch=s.charAt(i); 
            rev=rev+ch; 
        } 
 
        if (s.equals(rev)) { 
            System.out.println(s + " is palindrome"); 
        } 
        else 
        { 
            System.out.println(s + " is not palindrome"); 
        } 
    } 
}
