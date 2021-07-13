package week6;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since October 2016
 * @version 1.0
 *
 */

public class Exercise2 {

	public static void main(String[] args) {
		int []a=new int[]{1,2,3};
		int []b=new int[3];
		b=a;
		System.out.print("a: ");
		for (int ii=0;ii<3;ii++){
		System.out.print(a[ii]);
		}
		System.out.println();
		a[2]=9;
		System.out.print("a: ");
		for (int ii=0;ii<3;ii++){
		System.out.print(a[ii]);
		}
		System.out.println();
		System.out.print("b: ");
		for (int ii=0;ii<3;ii++){
		System.out.print(b[ii]);
		}
		//The element of the second array changes because we have assigned into it the value of the first one.
		System.out.println();
		System.out.println();
		int []c=new int[]{1,2,3};
		int []d=new int[3];
		c[2]=9;
		System.out.print("c: ");
		System.arraycopy(c, 0, d, 0, 3);
		for (int ii=0;ii<3;ii++){
			System.out.print(c[ii]);
			}
		System.out.println();
		System.out.print("d: ");
		for (int ii=0;ii<3;ii++){
			System.out.print(d[ii]);
			}
		//I don't notice any difference between the two ways.
	}

}
