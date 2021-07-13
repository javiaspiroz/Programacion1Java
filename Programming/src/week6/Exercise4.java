package week6;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since October 2016
 * @version 1.0
 *
 */

public class Exercise4 {

	public static void main(String[] args) {
		int [] results = new int [15];
		int ii=0, jj=0;
		int[][]season=new int[38][15];
		System.out.println("The results of this season football lottery (quiniela) are:" );
		for(jj=0; jj<38;jj++){
			System.out.println();
		for (ii=0; ii<15; ii++){
			results[ii] = (int)(Math.random()*3);
			if (results[ii]==0){
				results[ii]=1;
				System.out.print("1 ");
			}
			else if(results[ii]==1){
				System.out.print("X ");
				results[ii]='X';
			}
			else{
				results[ii]=2;
				System.out.print("2 ");
			}
			season[jj][ii]=results[ii];
		}
		
		}
		
				
	}

}
