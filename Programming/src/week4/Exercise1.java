package week4;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since September 2016
 * @version 1.0
 *
 */

public class Exercise1 {

	public static void main(String[] args) {
		byte a = 1;
		short b=2;
		int c=3;
		long d=4L;
		float e=5F;
		double f=6;
		char g='a';
		boolean h = true;
		String j = "hello";
		a = b;
		a=c;
		a=d;
		a=e;
		a=f;
		a=g;
		a=h;
		a=j;
		b = a;
		b=c;
		b=d;
		b=e;
		b=f;
		b=g;
		b=h;
		b=j;
		c = a;
		c=b;
		c=d;
		c=e;
		c=f;
		c=g;
		c=h;
		c=j;
		d = b;
		d=a;
		d=b;
		d=c;
		d=f;
		d=g;
		d=h;
		d=j;
		e = a;
		e=b;
		e=c;
		e=d;
		e=f;
		e=g;
		e=h;
		e=j;
		f= a;
		f=b;
		f=c;
		f=d;
		f=e;
		f=g;
		f=h;
		f=j;
		g = a;
		g=b;
		g=c;
		g=d;
		g=e;
		g=f;
		g=h;
		g=j;
		h = a;
		h=b;
		h=c;
		h=d;
		h=e;
		h=f;
		h=g;
		h=j;
		j = a;
		j=b;
		j=c;
		j=d;
		j=e;
		j=f;
		j=g;
		j=h;
		/* Analyzing the results we can appreciate that: 
		 * - The byte can´t cast into any other variable type.
		 * - The short can only cast into a byte type.
		 * - The int can only cast into byte and short variable types.
		 * - The long can cast into char, int, short, and byte variable types.
		 * - The float can cast into char, long, int, short and byte variable types.
		 * - The double can cast into any variable type except boolean and string.
		 * - The char,boolean and String can´t cast into any variable type.
		 */
				

	}

}
