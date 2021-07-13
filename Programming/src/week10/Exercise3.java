package week10;

import java.util.Scanner;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since November 2016
 * @version 1.0
 *
 */

public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name, surname and your marks of programming, algebra, calculus, physics, information and writing.");
		String name=sc.next(), surname=sc.next();
		float []marks=new float[6];
		for (int ii=0; ii<6; ii++){
			marks[ii]=sc.nextFloat();
		}
		int ii=0;
		Student2 st=new Student2(name, surname, marks[ii]);
		st.setName(name);
		st.setSurname(surname);
		for (;ii<6;ii++){
			st.setMarks(marks[ii]);
		}
		System.out.println("The marks of "+st.getName()+" "+st.getSurname()+" are:");
		for (int jj=0; jj<6;jj++){
			System.out.print(marks[jj]+" ");
		}
		sc.close();
	}

}
