import java.util.Random;

public class DiceGame1{
    public static void main(String[] args){
	Random rnd = new Random();
	System.out.println("Rolling the dice...");
	int num1 = rnd.nextInt(6) + 1;
	int num2 = rnd.nextInt(6) + 1;
	System.out.println("Die 1:" + num1);
	System.out.println("Die 2:" + num2);
	System.out.println("Total value:" + (num1 + num2));	
    }

}
