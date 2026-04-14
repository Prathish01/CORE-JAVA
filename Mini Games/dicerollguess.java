package games;
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;
public class stonepaperscissor1 
{
public static void main(String [] args)
{
Scanner scn = new Scanner(System.in);
Random rand = new Random();
int compchoice = rand.nextInt(6)+1;
int guess = 0;


while(guess !=compchoice)	
{
	System.out.println("guess number between 1 to 6 dicerolls");
	guess = scn.nextInt();
	if(guess == compchoice)
	{
		System.out.println("your guess is correct  : " +guess);
	}
	else if(guess>compchoice)
	{
		System.out.println("your guess is high");
	}
	else
	{
		System.out.println("your guess is low");
	}
}
scn.close();
}
}
