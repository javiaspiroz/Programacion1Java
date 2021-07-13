package week6;

import java.util.Scanner;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since October 2016
 * @version 1.0
 *
 */

public class Exercise10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your DNI number and press Enter:");
		int dni =sc.nextInt();
		char [] value = new char [] {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		int num = dni%23;
		for (int ii = 0; ii<value.length; ii++){
			if (num==ii){
				System.out.println("The associate NIF is : "+dni+"-"+value[ii]);
			}
			
		}
		sc.close();
		

	}

}
