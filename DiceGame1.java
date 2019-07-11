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
    }

}
