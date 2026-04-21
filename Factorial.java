import  java.util.Scanner; 
public class test1 { 
    public static void main(String[] args) { 
        Scanner scn = new Scanner(System.in); 
        System.out.println("enter the number to find it's factorial"); 
        int num=scn.nextInt(); 
        m1(num); 
    } 
    public static void m1(int num) 
    { 
        int fact=1; 
        for(int i=1; i<=num;i++) 
        { 
            fact=fact*i; 
        } 
        System.out.println("factorial of the "+num+" is " + fact); 
    } 
} 
