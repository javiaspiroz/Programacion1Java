package week10;

import java.util.Scanner;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since November 2016
 * @version 1.0
 *
 */

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter(System.getProperty("line.separator"));
		System.out.println("Enter the name, surname, age, position and team of the player.");
		String name=sc.next(), surname=sc.next();
		byte age=sc.nextByte();
		String position=sc.next(), team=sc.next();
		Football p1=new Football (name, surname, age, position, team);
		p1.setName(name);
		p1.setSurname(surname);
		p1.setAge(age); 
		p1.setPosition(position); 
		p1.setTeam(team);
		System.out.println(p1.getName()+" "+p1.getSurname()+" is "+p1.getAge()+" years old. He is "+p1.getPosition()+" of "+p1.getTeam());		
		sc.close();
	}

}
