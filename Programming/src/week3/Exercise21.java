package week3;

public class Exercise21 {

	public static void main(String[] args) {
		int a=2;
		long b=5L;
		float c=9.0F;
		float d=a+b+c;
		System.out.println(d);
		//We have to always declare the final variable with the bigger type of the previously used.
		byte e=9;
		long f=a+b+e;
		System.out.println(f);
		//Now the bigger type of variable is a long, so my final variable is a long.
		int g=9;
		f=a+b+g;
		System.out.println(f);
		//It happens the same as in the last case.
		
				

	}

}
