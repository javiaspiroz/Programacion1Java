package week11;

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
		//1st person
		Person p1=new Person();
		System.out.println("Introduce the name:");
		p1.setName(sc.next());
		System.out.println("Introduce the age:");
		p1.setAge(sc.nextInt());
		System.out.println("Introduce the DNI (without the letter):");
		p1.setDni(sc.nextInt());
		System.out.println("Introduce the sex:");
		p1.setGender(sc.next());
		System.out.println("Introduce the weight:");
		p1.setWeight(sc.nextDouble());
		System.out.println("Introduce the height:");
		p1.setHeight(sc.nextDouble());
		System.out.println(p1);
		//2nd person
		Person p2=p1;
		p2.setHeight(185);
		p2.setWeight(90);
		p2.setGender("F");
		System.out.println(p2);
		//3rd person
		Person p3=new Person("Lola", 45, 2624486, "F", 55.0, 165.0);
		System.out.println(p3);
		sc.close();
	}

}
