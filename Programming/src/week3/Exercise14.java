package week3;

public class Exercise14 {

	public static void main(String[] args) {
		long a=9L, b;
		System.out.println(a);
		b=++a;
		System.out.println(b);
		int c=6, d;
		System.out.println(c);
		d=c++;
		System.out.println(d);
		//The difference is caused because when you increase with the postfix, it is used in the next operation; and the prefix is used in that operation.
		b=--a;
		System.out.println(b);
		d=c--;
		System.out.println(d); //This value will be 6 if we do another operation.
		
			
	}

}
