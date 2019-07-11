import java.util.Random;
import java.util.Scanner;

public class DiceGame1{
    public static void main(String[] args){
        System.out.println("What is your name?");
	Scanner scan = new Scanner(System.in);
	String name = scan.next();
	System.out.println("Hello," + name + "!");
	
	Random rnd = new Random();
	System.out.println("Rolling the dice...");
	int num1 = rnd.nextInt(6) + 1;
	int num2 = rnd.nextInt(6) + 1;
	System.out.println("Die 1:" + num1);
	System.out.println("Die 2:" + num2);
	System.out.println("Total value:" + (num1 + num2));

	if(num1 + num2 > 7){
	    System.out.println(name + " won!" + "\n");
	}
	else System.out.println(name + " lost" + "\n");

	System.out.println("Secand Game");
	System.out.println("You win if the total dice value is less than 7");
	int num3 = rnd.nextInt(6) + 1;
	int num4 = rnd.nextInt(6) + 1;
	System.out.println("Die 3:" + num3);
	System.out.println("Die 4:" + num4);
	System.out.println("Total value:" + (num3 + num4));

	if(num3 + num4 < 7){
	    System.out.println(name + " won!");
	}
	else System.out.println(name + " lost");
    }

}
