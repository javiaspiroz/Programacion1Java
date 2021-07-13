package week3;

public class Exercise19 {

	public static void main(String[] args) {
		float a=5.0F, b=0.0F, c;
		c=(float) (a/b);
		System.out.println(c);
		
		double d=5.0, e=0.0, f;
		f=(double) (d/e);
		System.out.println(f);
		//Now in both cases it goes to infinity instead of giving an error.
	}

}
