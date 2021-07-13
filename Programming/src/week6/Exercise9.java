package week6;

import java.util.Scanner;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since October 2016
 * @version 1.0
 *
 */

public class Exercise9 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Think a number between 1 and 100");
		String answer="no";
		int times=0;
		int []numbers=new int[100];
		for(int ii=0;ii<=100;ii++){
			numbers[ii]=(int) (Math.random()*100+1);
			System.out.println("Is "+numbers[ii]+" your number?(yes/no)");
			answer=sc.next();
			while(answer.equals("no")){
				numbers[ii]=(int) (Math.random()*100+1);
				System.out.println("Is "+numbers[ii]+" your number?(yes/no)");
				times++;
				answer=sc.next();
				/*We haven't been able to implement the function to avoid the repetition of numbers,
				asking the user the number at the beginning was an option but we thought that wassn't the exercise intention*/
				if (times==100){
					System.out.println("Don't lie!");
					System.out.println("End of the program.");
				}
				if(answer.equals("yes")){
					System.out.println("Thanks for playing! I've needed "+(times+1)+" times.");
				}
			if (answer.equals("yes") && times==0){
				System.out.println("Thanks for playing! I've needed 1 time.");
			}
			sc.close();
		}
	}
	}
}