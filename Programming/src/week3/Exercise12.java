package week3;

public class Exercise12 {

	public static void main(String[] args) {
		byte a=2, b=1, c;
		c=(byte) (a+b);
		System.out.println(c);
		c=(byte) (a-b);
		System.out.println(c);
		c=(byte) (a*b);
		System.out.println(c);
		c=(byte) (a/b);
		System.out.println(c);
		c=(byte) (a%b);
		System.out.println(c);
		System.out.println(" ");
		
		short d=12, e=11, f;
		f=(short) (d+e);
		System.out.println(f);
		f=(short) (d-e);
		System.out.println(f);
		f=(short) (d*e);
		System.out.println(f);
		f=(short) (d/e);
		System.out.println(f);
		f=(short) (d%e);
		System.out.println(f);
		System.out.println(" ");
		
		int g=22, h=44, i;
		i=(int) (g+h);
		System.out.println(i);
		i=(int) (g-h);
		System.out.println(i);
		i=(int) (g*h);
		System.out.println(i);
		i=(int) (g/h);
		System.out.println(i);
		i=(int) (g%h);
		System.out.println(i);
		System.out.println(" ");
		
		long j=12L, k=11L, l;
		l=(long) (j+k);
		System.out.println(l);
		l=(long) (j-k);
		System.out.println(l);
		l=(long) (j*k);
		System.out.println(l);
		l=(long) (j/k);
		System.out.println(l);
		l=(long) (j%k);
		System.out.println(l);
		System.out.println(" ");
		
		char m='a', n='b', o;
		o=(char) (m+n);
		System.out.println(o);
		o=(char) (m-n);
		System.out.println(o);
		o=(char) (m*n);
		System.out.println(o);
		o=(char) (m/n);
		System.out.println(o);
		o=(char) (m%n);
		System.out.println(o);
		//With the char there are several errors because there´s not enough characters for the numbers given by the operators.
		
		
	}

}
