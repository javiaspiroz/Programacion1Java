package lesson4;

import java.util.Scanner;
/**
 * This class shows an example of a switch where not using breaks helps
 * It says the number of days of a month.
 * 
 * @author Angel García Olaya
 * @since September 2015
 * @version 1.0
 *
 */
public class SwitchNoBreak {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce the month's name in lower case");
		String month = sc.next();
		switch (month) {
		case "january":
		case "march":
		case "may":
		case "july":
		case "august":
		case "october":
		case "december": System.out.println(month+" has 31 days");
						break;
		case "february": System.out.println(month+" has 28 days");
						break;
		//We are using the default for the remaining months, so if the month's name is not correct it will print 30 days
		default: System.out.println(month+" has 30 days");
		}
		sc.close();

	}

}
