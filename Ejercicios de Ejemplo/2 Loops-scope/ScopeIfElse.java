package lesson4;

import java.util.Scanner;

/**
 * This class shows an example of the scope of variables
 * It asks the user for a byte and if the value is correct it stores and prints it
 * 
 * @author Angel García Olaya
 * @since October 2015
 * @version 1.0
 *
 */
public class ScopeIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce a value for a byte");
		long aux = sc.nextLong();
		if (aux >= -128 && aux<=127) {
			//b is declared in the block of the if, so it just exists here
			//but aux was declared in the outer block, so it also exists here
			byte b = (byte) aux;
			System.out.println("Great! "+aux+" can be stored in a byte as you can see: "+b);
		}
		else {
			//b doesn't exists in this block, but aux does exist
			//so we can declare b again 
			byte b = (byte) aux;
			System.out.println("Wrong! "+aux+" cannot be stored in a byte,"+
			" if you try to do it you will get "+b);
		}
		//Here we cannot access to any of the b variables anymore
		//But we can use aux without problems
		sc.close();
	}

}
