package lesson4;
import java.util.Scanner;
/**
 *
 * Examples of use of a for loop
 * 
 * @author Angel Garcia Olaya
 * @version 1.2
 * @since October 2014
 * 
 *   
 */
public class ForLoop {

	public static void main(String[] args) {
		 /* Every loop has three parts
		 * a) control variable: it must be declared and initialized before starting the loop
		 * (except in the case of the do-while, where it can be sometimes initialized, but not declared, inside the loop)
		 * b) condition: states whether we should keep iterating or not (if it is true we iterate)
		 * c) body: the sentences that we want to repeat, one of them should change the value of the 
		 *    control variable so the loop will eventually finish
		 * In the "for" sentence both a) b) and the control variable changes are in the same line:
		 * for (declare and initialize control variable; condition ; changes in the control variable)
		 */
		//Example, printing the multiples of a number received by keyboard
		//using a while
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		//Declaring and initializing the control variable
		int a = 1;
		//a<=10 is the condition, if it is met, the loop will be executed
		while (a<=10){
			System.out.println(number+"x"+a+" is "+number*a);
			//inside the loop, the value of a has to be changed each time
			a++;
		}
		//Same example using a for loop
		for (int b=1;b<=10;b++){
			System.out.println(number+"x"+b+" is "+number*b);
		}
		//Algorithm of the for loop:
		//1. It declares and initializes the control variable (int b=1)
		//2. It checks the condition, if it is not true, it stops (b<=10)
		//3. If the condition is met, the sentences of the body are executed (System...)
		//4. The control variable is updated (b++)
		//5. Go to 2
		
		//Example to print all the numbers in the range 1 to 100 in steps of 3
		//As the condition is c<100, 100 is not printed, it stops after printing 97
		for (int c=1; c<100;c=c+3){
			System.out.print(c+",");			
		}
		//Closing the Scanner (it is optional, but Eclipse complains if we don't do it)
		sc.close();
	}

}
