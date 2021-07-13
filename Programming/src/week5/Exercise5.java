package week5;

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
		System.out.println("Introduce the top limit to generate perfect numbers and press Enter.");
		int toplimit=sc.nextInt();
		 for( int perfectnum=1; perfectnum<=toplimit;perfectnum++){
			 int sum=0;
			 for (int divisor=1;divisor<=(perfectnum/2);divisor++){
				 if (perfectnum%divisor==0){
					 sum+=divisor;
				 }
			 }
			 if(sum==perfectnum){
				 System.out.println("The number " + perfectnum +" is a perfect numer.");
			 }
		 }
		sc.close();
	}

}
