package week6;

import java.util.Scanner;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since October 2016
 * @version 1.0
 *
 */

public class Exercise7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the matrix.");
		int size=sc.nextInt();
		char[][]matrix=new char[size][size];
		System.out.println("Your matrix of size "+size+" is:");
		for( int jj=0;jj<size;jj++){	
		for(int ii=0;ii<size;ii++){
			matrix[ii][jj]='*';
			System.out.print(matrix[ii][jj]);
		}
		System.out.println();
		}
		sc.close();
	}

}
