package week8;

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
		Student student1=new Student();
		System.out.println("Enter the name of the student.");
		student1.name=sc.next();
		System.out.println("Enter the surname of the student.");
		student1.surname=sc.next();
		System.out.println("Enter the programming mark of the student.");
		student1.programming=sc.nextByte();
		System.out.println("Enter the algebra mark of the student.");
		student1.algebra=sc.nextByte();
		System.out.println("Enter the calculus mark of the student.");
		student1.calculus=sc.nextByte();
		System.out.println("Enter the physics mark of the student.");
		student1.physics=sc.nextByte();
		System.out.println("Enter the information mark of the student.");
		student1.information=sc.nextByte();
		System.out.println("Enter the writing mark of the student.");
		student1.writing=sc.nextByte();
		System.out.println("The maks of "+student1.name+" "+student1.surname+" were:");
		System.out.println("Programming: "+student1.programming);
		System.out.println("Algebra: "+student1.algebra);
		System.out.println("Calculus: "+student1.calculus);
		System.out.println("Physics: "+student1.physics);
		System.out.println("Information: "+student1.information);
		System.out.println("Writing: "+student1.writing);
		sc.close();
	}

}
