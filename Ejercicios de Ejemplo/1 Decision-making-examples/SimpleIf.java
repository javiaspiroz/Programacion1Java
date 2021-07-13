package lesson4;
import java.util.Scanner;
/**
 * This class shows an example of a simple if, no else.
 * It reads a number from the keyboard and prints whether the student passed the subject. 
 * 
 * @author Angel García Olaya
 * @since September 2015
 * @version 1.0
 *
 */
public class SimpleIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		float b;
		System.out.println("Introduce your mark");
		b = sc.nextFloat();
		//Notice, we can compare with 5.0F or with 5 as it gets converted automatically to 5.0F
		if (b>=5) {
			//We put all the sentences we want to be executed if the condition is true in between  { }
			System.out.println("You passed!");
			System.out.println("Congratulations");
		}
		//This is always executed
		System.out.println("End of program");
		//We close the connection with the keyboard (optional)
		sc.close();
	}
}
