package lesson4;

import java.util.Scanner;
/**
 * This class shows an example of a switch
 * It simulates a calculator. 
 * 
 * @author Angel García Olaya
 * @since September 2015
 * @version 1.0
 *
 */
public class SwitchExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter two real numbers");
		double a,b;
		a = sc.nextDouble();
		b = sc.nextDouble();
		System.out.println("Enter the operation: 0 adds, 1 substracts, 2 multiplies, 3 divides");
		byte operator = sc.nextByte();
		double result=0;
		//In a switch only int or compatible types can be used (no long, float or double)
		//From java 7, String can also be used
		switch (operator) {
		case 0: result = a+b;
				break;
		case 1: result = a-b;
				break;
		case 2: result = a*b;
				break;
		case 3: result = a/b;
				break;
		//default is executed if no case matches
		default: System.out.println("Wrong operator!");	
		}
		System.out.println("The result is"+result);
		sc.close();
	}

}
