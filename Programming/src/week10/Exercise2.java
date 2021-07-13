package week10;

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
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name, surname and your marks of programming, algebra, calculus, physics, information and writing.");
		String name=sc.next(),surname=sc.next();
		float programming=sc.nextFloat(), algebra=sc.nextFloat(), calculus=sc.nextFloat(), physics=sc.nextFloat(),
				information=sc.nextFloat(), writing=sc.nextFloat();
		Student st=new Student(name, surname, programming, algebra, calculus, physics, information, writing);
		st.setName(name);
		st.setSurname(surname);
		st.setProgramming(programming);
		
		System.out.println("The marks of "+st.getName()+" "+st.getSurname()+ " are: Programming "+st.getProgramming()+", algebra "
		+st.getAlgebra()+", calculus "+st.getCalculus()+", physics "+st.getPhyics()+", information "+st.getInformation()+", writing "+st.getWriting());
		
		//Part of exercise 3
		System.out.println("Enter your name, surname and your marks of programming, algebra, calculus, physics, information and writing.");
		String name1=sc.next(), surname1=sc.next();
		float []marks=new float[6];
		for (int ii=0; ii<6; ii++){
			marks[ii]=sc.nextFloat();
		}
		int ii=0;
		Student2 st1=new Student2(name1, surname1, marks[ii]);
		st1.setName(name1);
		st1.setSurname(surname1);
		for (;ii<6;ii++){
			st1.setMarks(marks[ii]);
		}
		System.out.println("The marks of "+st1.getName()+" "+st1.getSurname()+" are:");
		for (int jj=0; jj<6;jj++){
			System.out.print(marks[jj]+" ");
		}
		sc.close();
	}

}
