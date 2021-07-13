package week5;

import java.util.Scanner;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since October 2016
 * @version 1.0
 *
 */

public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number.");
		int num=sc.nextInt(), finalNum;
		System.out.println("Enter the number of multiplies of it.");
		int timesReq=sc.nextInt();
		System.out.println("The first "+timesReq+" multiplies of "+num+" are: ");
		for(int timesCurr=1; timesCurr<=timesReq; timesCurr++){
			finalNum=num*timesCurr;
			System.out.print(finalNum+", ");
		}
		sc.close();

	}

}
