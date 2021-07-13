package week5;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since October 2016
 * @version 1.0
 *
 */

public class Exercise2 {

	public static void main(String[] args) {
		String a="1.0";
		for (float num=2.5F; num<=100; num= (float) (num+1.5)){
			a=a+", "+num;
		}
		System.out.println(a);
		/*
		 * Another way could be like this:
		 * 
		 * for (float num=1.0F; num<=100; num= (float) (num+1.5)){
		 * System.out.print(num+"; ");
		 * }
		 */
		
	}

}
