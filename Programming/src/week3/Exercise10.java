package week3;

public class Exercise10 {

	public static void main(String[] args) {
		int a=9;
		int b=a;
		System.out.println(b);
		a=11;
		System.out.println(b);
		//The second variable doesn't change its value.
		
		String c="Hello";
		String d=c;
		System.out.println(d);
		c="Goodbye";
		System.out.println(d);
		//It happens the same as in the previous ones.
	}

}
