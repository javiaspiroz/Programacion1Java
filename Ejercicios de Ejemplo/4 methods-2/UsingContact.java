package lesson6.year16_17;
/**
 * An example of usage of the Contact class
 * @author Angel Garcia Olaya. PLG-UC3M
 * @since November 2016
 * @version 1.0
 *
 */
public class UsingContact {

	public static void main(String[] args) {
		//We create three objects, one using each constructor
		Contact c1, c2 , c3;
		c1 = new Contact("Sara");
		c2 = new Contact("Luis",653431567);
		c3 = new Contact ("Antonio",new int[]{634982632,914562948});
		//Printing all of them
		System.out.println(c1.toString());
		//We can invoke the toString method as in the previous line or just put the name of the object
		System.out.println(c2);
		System.out.println(c3);
		//Adding numbers
		c1.addNumber(913456789);
		c2.addNumber(912358765);
		System.out.println(c1);
		System.out.println(c2);
		//Getting the main number
		System.out.println("The main number of "+c2.getName()+" is "+c2.getNumber());
		//Changing it
		c2.changeMainNumber(1);
		System.out.println("The main number of "+c2.getName()+" is "+c2.getNumber());
		//Storing more numbers, some of them repeated
		c2.addNumber (new int [] {912358765,652941539,690234587});
		System.out.println(c2);
		//Checking the equals method
		//Numbers in reverse order, but same name. It must be equal
		Contact c4 = new Contact ("Antonio",new int[]{914562948,634982632});
		System.out.println(c3.equals(c4));
		//Another example
		Contact c5 = new Contact("Sara");
		Contact c6 = new Contact("Sara");
		System.out.println(c5.equals(c6));
		//Another one
		System.out.println(c5.equals(c1));
	}

}
