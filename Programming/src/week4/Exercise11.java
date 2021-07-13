package week4;

import java.util.Scanner;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since October 2016
 * @version 1.0
 *
 */

public class Exercise11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value for the x");
		int x=sc.nextInt();
		System.out.println("Enter a value for the y");
		int y=sc.nextInt();
		if (x>0 && y>0){
			System.out.println("Your point ("+x+","+y+") lies in the 1st quadrant");
		}
		else if (x>0 && y<0){
			System.out.println("Your point ("+x+","+y+") lies in the 3rd quadrant");
		}
		else if (x<0 && y>0){
			System.out.println("Your point ("+x+","+y+") lies in the 2nd quadrant");
		}
		else if (x<0 && y<0){
			System.out.println("Your point ("+x+","+y+") lies in the 4th quadrant");
		}
		else{
			
		}
		sc.close();

	}

}
