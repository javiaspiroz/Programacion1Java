package lesson4;
/**
 * Example of blocks and scope
 *
 * @author Angel Garcia Olaya
 * @version 1.2
 * @since October 2015
 *
 */
public class Scope {//This is the program block
	public static void main(String[] args) {//The main block begins here 
		//We declare a variable: aa, it belongs to the main block
		double aa=0;
		//We declare a new block
		{
			//b is only declared (only exists) inside this block
			double b = 2.3;
			System.out.println(b);
			//But given that aa was declared in the outer block, it also exists here
			aa= 3*b;
		} //b no longer exists after this brace
		//Changes made to aa in the inner block are kept outside it
		System.out.println(aa);
		//Now we could declare b again, even with a different type
		//WARNING! Using different blocks to re-declare variables is not recommended
		float b = 2.33F;
	}// Here the outer block finishes. Both variables (aa and the new b) do not exist anymore
}//The program block finishes here