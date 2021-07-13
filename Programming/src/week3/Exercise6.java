package week3;

public class Exercise6 {

	public static void main(String[] args) {
		float a=1234567890.0F;
		float b=1234567899.0F;
		System.out.println(a-b);
		//The result is 0.0 because of the low precision, just 8-9 digits, the others are lost.
		int c=1234567890;
		int d=1234567899;
		System.out.println(c-d);
		//Now the result is -9 because none digits have been lost.

	}

}
