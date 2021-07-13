package lesson4;
import java.util.Scanner;
/**
 * This class shows an example of an if that checks 2 conditions
 * using conditional operators
 * 
 * @author Angel García Olaya
 * @since September 2015
 * @version 1.0
 *
 */
public class IfConditionalOperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double beerPrice = 1;
		System.out.println("How much money do you have?");
		double money = sc.nextDouble();
		System.out.println("Do you want a beer?");
		boolean beer = sc.nextBoolean();
		//We don't need to test beer == true as beer is a boolean which will be true or false
		if (beer && money > beerPrice) {
			System.out.println("Good choice");
			System.out.println("Here's your beer");
		}
		else {
			System.out.println("Ok, no beer for you");
		}
		sc.close();
	}
}
