package week3;

public class Exercise20 {

	public static void main(String[] args) {
		int a=999999999;
		a=a*a*a*a*a*a*a*a*a*a*a*a*a*a*a*a*a*a*a*a;
		System.out.println(a);
		//It still runs but it takes the maximum possible value that the variable type admits.
		float b=9e36F;
		b=b*b*b*b;
		System.out.println(b);
		//In this case, it doesn't show the maximum value, it gives an infinity, which is a value we can operate with.
		

	}

}
