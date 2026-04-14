package games;
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;
public class guessnumber 
{
public static void main(String [] args)
{
Scanner scn = new Scanner(System.in);
Random rand = new Random();

int compno = rand.nextInt(10)+1;
int guess =0;

while(guess != compno)
{
System.out.println("guess the number between 1 to 10");
 guess = scn.nextInt();
if(guess == compno)
{
System.out.println("you guess the correct no : " +guess);	
}
else if (guess>compno) 
{
System.out.println("your predicted number is high");	
} 
else
{
System.out.println("your predicted number is low try again");	
}
	}
}
}
