import java.util.Scanner; 
public class fibonacii { 
    public static void main(String[] args) { 
        Scanner scn=new Scanner(System.in); 
        System.out.println("Enter a Number for fibonacii series"); 
        int num=scn.nextInt(); 
        print(num); 
    } 
    public static void print(int num){ 
        int n1=0; 
        int n2=1; 
        int n3=n1+n2; 
        while (num>0) { 
            System.out.println(n1); 
            n1=n2; 
            n2=n3; 
            n3=n1+n2; 
            num--; 
        } 
    } 
}
