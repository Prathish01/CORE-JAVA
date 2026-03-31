package customisedexception;

public class EvenNumberException extends RuntimeException
{
public EvenNumberException(String message)
{
super(message)	;
}
}


package customisedexception;

public class NotAnEvenNumberException extends RuntimeException 
{
public NotAnEvenNumberException(String message)
{
super(message);	
}
}



package customisedexception;

import java.util.Scanner;

public class mainmethod {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter num");
        int num = scn.nextInt();

        if (num % 2 == 0) {
            System.out.println("even number " + num);
            throw new EvenNumberException("even number");
        } else {
            System.out.println("not an even number " + num);
            throw new NotAnEvenNumberException("not an even number");
        }
    }
}
