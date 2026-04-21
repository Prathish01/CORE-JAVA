import java.util.Scanner; 
public class test { 
    public static void main(String[] args) { 
        Scanner scn=new Scanner(System.in); 
        System.out.println("Enter a number to find perfect or not "); 
        int num=scn.nextInt(); 
        print(num); 
    } 
    public static void print(int num) 
    { 
        int sum=0; 
        for(int i=1; i<=num-1; i++){ 
            if (num%i==0) { 
                sum=sum+i; 
            } 
        } 
        System.out.println(num); 
        System.out.println(sum); 
        if (num==sum) { 
            System.out.println("the number is perfect"); 
        } 
        else{ 
            System.out.println("the number is not a perfect"); 
        } 
    } 
 
}
