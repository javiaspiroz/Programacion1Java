package lesson4;
import java.util.Scanner;
/**
 * 
 * Example of using a do-while loop to ask for a number between 1 and 10
 * If the number is not in the range, we ask for it again
 * 
 * @author Angel Garcia Olaya
 * @version 1.2
 * @since October 2014
 * 
 */
public class DoWhileExample2 {
	public static void main(String[] args) {
		Scanner keyb = new Scanner (System.in);
		/*We declare the control variable
		 * As the condition is checked at the end of the loop we can initialize it inside the loop
		 * (when working with "for" or "while" we need to initialize it before the loop starts,
		 *  as the condition is checked before entering the loop)
		 */
		int number;
		//do-while loop is executed at least once
		do {
			System.out.println("Enter a number between 1 and 10");
			number = keyb.nextInt();
		}
		//Condition is checked at the end of the loop. If the number is lower than 1 or bigger than 10
		//(i.e. is not in the range 1 to 10), the loop is repeated
		while (number<1 || number>10);		
		System.out.println("You entered "+number);
		//Closing the Scanner (it is optional, but Eclipse complains if we don't do it)
		keyb.close();
	}

}
