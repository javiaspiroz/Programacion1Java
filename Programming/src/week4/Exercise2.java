package week4;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since September 2016
 * @version 1.0
 *
 */


public class Exercise2 {

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
		a =(byte) b;
		a= (byte) c;
		a=(byte)d;
		a=(byte)e;
		a=(byte)f;
		a=(byte)g;
		a=(byte)h;
		a=(byte)j;
		b = a;
		b=(short)c;
		b=(short)d;
		b=(short)e;
		b=(short)f;
		b=(short)g;
		b=(short)h;
		b=(short)j;
		c = a;
		c=b;
		c=(int)d;
		c=(int)e;
		c=(int)f;
		c=g;
		c=(int)h;
		c=(int)j;
		d = b;
		d=a;
		d=b;
		d=c;
		d=(long)f;
		d=g;
		d=(long)h;
		d=(long)j;
		e = a;
		e=b;
		e=c;
		e=d;
		e=(float)f;
		e=g;
		e=(float)h;
		e=(float)j;
		f= a;
		f=b;
		f=c;
		f=d;
		f=e;
		f=g;
		f=(double)h;
		f=(double)j;
		g =(char)a;
		g=(char)b;
		g=(char)c;
		g=(char)d;
		g=(char)e;
		g=(char)f;
		g=(char)h;
		g=(char)j;
		h =(boolean)a;
		h=(boolean)b;
		h=(boolean)c;
		h=(boolean)d;
		h=(boolean)e;
		h=(boolean)f;
		h=(boolean)g;
		h=(boolean)j;
		j =(String)a;
		j=(String)b;
		j=(String)c;
		j=(String)d;
		j=(String)e;
		j=(String)f;
		j=(String)g;
		j=(String)h;
		/* -Byte, short,int, long, float, double and char can be converted into themselves forcing the casting, but although we force
		 * it they can´t be converted into boolean and String because the value of boolean and String isn't a numeric value.
		 * - Boolean and string can't be converted into any variable type although we force the casting.
		 * 
		 */

	}

}
