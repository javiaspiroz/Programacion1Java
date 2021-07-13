package week3;

public class Exercise17 {

	public static void main(String[] args) {
		float a, b;
		float c, d;
		a = 2.0F;
		b =(float) (3.0 * 3.0);
		c =(float) (7.0 / 3.0);
		d = (float) (a + b * c);
		System.out.println(d);
		
		double e, f;
		double g, h;
		e = 2.0;
		f = 3.0 * 3.0;
		g = 7.0 / 3.0;
		h = e + f * g;
		System.out.println(h);
		//The difference is caused because now the program takes into account the decimal numbers.

	}

}
