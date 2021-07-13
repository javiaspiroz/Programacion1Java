package week6;

import java.util.Scanner;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since October 2016
 * @version 1.0
 *
 */

public class Exercise5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array to create.");
		int size=sc.nextInt();
		double []numbers=new double [size];
		int total=0;
		for(int ii=0; ii<size;ii++){
			numbers[ii]=(int) (Math.random()*(49)+1);
			total=(int) (total+numbers[ii]);
		}
		System.out.println("The addition of the elements ofthe array is: "+total);		
		sc.close();

	}

}
