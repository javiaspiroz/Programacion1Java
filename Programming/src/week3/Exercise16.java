package week3;

public class Exercise16 {

	public static void main(String[] args) {
		String a="Hello", b="World", c;
		c= a+b;
		System.out.println(c);
		//The program interprets the + as a concatenate symbol instead of an adding operator.
		c=a-b;
		System.out.println(c);
		//The program tries to subtract as if they were numbers but as they aren't, an error happens.

	}

}
