package week6;

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
		System.out.println("Specify the number of rows of the M1 matrix and press Enter");
		int m1Rows=sc.nextInt();
		System.out.println("Specify the number of columns of the M1 matrix and press Enter");
		int m1Columns=sc.nextInt();
		int [][]m1=new int[m1Rows][m1Columns];
		for(int ii1=0;ii1<m1Rows;ii1++){
		    for(int jj1=0;jj1<m1Columns;jj1++){
			System.out.println("Introduce the term in the "+ii1+","+jj1+" position and press Enter");
			m1[ii1][jj1]=sc.nextInt();
		    }
		}
		System.out.println("The M1 matrix is:");
		for(int ii1=0;ii1<m1Rows;ii1++){
			for(int jj1=0; jj1<m1Columns; jj1++){
				System.out.print(m1[ii1][jj1]+"\t");
			}
			System.out.println();
		}
		System.out.println("Specify the number of rows of the M2 matrix and press Enter");
		int m2Rows=sc.nextInt();
		System.out.println("Specify the number of columns of the M2 matrix and press Enter");
		int m2Columns=sc.nextInt();
		int [][]m2=new int[m2Rows][m2Columns];
		for(int ii2=0;ii2<m2Rows;ii2++){
		    for(int jj2=0;jj2<m2Columns;jj2++){
			System.out.println("Introduce the term in the "+ii2+","+jj2+" position and press Enter");
			m2[ii2][jj2]=sc.nextInt();
		    }
		}
		System.out.println("The M2 matrix is:");
		for(int ii2=0;ii2<m2Rows;ii2++){
			for(int jj2=0; jj2<m2Columns; jj2++){
				System.out.print(m2[ii2][jj2]+"\t");
			}
			System.out.println();
		}
		for(int ii=0;ii<m1Rows;ii++){
		    for(int jj=0;jj<m1Columns;jj++){
		        for(int kk=0;kk<m2Rows;kk++){
		        	for(int ll=0;ll<m2Columns;ll++){
		        		if (m1[ii][jj]==m2[kk][ll]){
					        System.out.println("The term "+m1[ii][jj]+" is included in both matrixes.");
				        }
		        	}
		        }
		    }
		}
		sc.close();
	}

}
