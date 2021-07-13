package week8;

import java.util.Scanner;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since October 2016
 * @version 1.0
 *
 */

public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base and height of your right triangle");
		RightTriangle tr1=new RightTriangle(sc.nextFloat(), sc.nextFloat());
		System.out.println("What do you want to calcuate area or perimeter?");
		String calculation=sc.next();
		float area, perimeter, hip;
		if (calculation.equals("area")){
			area=(tr1.base*tr1.height)/2;
			System.out.println("The area of your right triangle is: "+area);
		}
		else if (calculation.equals("perimeter")){
			hip=(float)Math.sqrt((tr1.base*tr1.base)+(tr1.height*tr1.height));
			perimeter=hip+tr1.base+tr1.height;
			System.out.println("The perimeter of your triangle is: "+perimeter);
		}
		else System.out.println("You didn't selected a suitable calculation");
		sc.close();
	}

}
