package week6;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since October 2016
 * @version 1.0
 *
 */

public class Exercise3 {

	public static void main(String[] args) {
		String year[][]= new String [12][];
		year[0]=new String[31];
		year[1]=new String[28];
		year[2]=new String[31];
		year[3]=new String[30];
		year[4]=new String[31];
		year[5]=new String[30];
		year[6]=new String[31];
		year[7]=new String[31];
		year[8]=new String[30];
		year[9]=new String[31];
		year[10]=new String[30];
		year[11]=new String[31];
		year[0][5]="no class today";
		year[9][15]="weekend";
		System.out.println("The year has "+year.length+" months.");
		for(int ii=0; ii<12;ii++){
			System.out.println("The month "+(ii+1)+" has "+year[ii].length+" days.");
		}

	}

}
