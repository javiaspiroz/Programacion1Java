package week12;

import java.util.Scanner;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since November 2016
 * @version 1.0
 *
 */

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number of rows of the matrix");
		int rows=sc.nextInt();
		System.out.println("Enter the number of columns of the matrix");
		int columns=sc.nextInt();
		double [][] mat=new double[rows][columns];
		//Ask user to enter the elements
		for(int ii=0;ii<rows;ii++){
		    for(int jj=0;jj<columns;jj++){
			System.out.println("Introduce the term in the "+ii+","+jj+" position and press Enter");
			mat[ii][jj]=sc.nextInt();
		    }
		}
		//Print the matrix
		System.out.println("The matrix is:");
		printMat(mat);
		//
		int index=index(mat);
		System.out.println("The row with biggest adittion of its elements is "+index);
		sc.close();
	}
	public static double elsSum (double [] arr){
		double elSum=0;
		for (int ii=0; ii<arr.length; ii++){
			elSum=elSum+arr[ii];
		}
		return elSum;
	}
	public static int index (double [][] mat){		
		int index=0;
		double sum=0;
		for (int kk=0; kk<mat.length; kk++){
			double elsSum=elsSum(mat[kk]);
			if (elsSum>sum){
				sum=elsSum;
				index=kk;
			}			
		}
		return index;
	}
	public static void printMat (double [][] mat){
		for (int ii=0; ii<mat.length; ii++){
			for (int jj=0; jj<mat[ii].length; jj++){
				System.out.print(mat[ii][jj]+"\t");
			}
			System.out.println();
		}
	}
}
