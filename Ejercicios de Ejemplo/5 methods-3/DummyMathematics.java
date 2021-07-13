package lesson6.year16_17;
/**
 * An example of a dummy class to show pass by value in Java
 * @author Angel Garcia Olaya. PLG-UC3M
 * @since November 2016
 * @version 1.0
 *
 */
public class DummyMathematics {
	private int operations = 0;
	
	public int getOperations (){
		return operations;
	}
	//No constructor is created as the by-default one is ok
	
	/**
	 * Silly method to show that Java uses pass by value when invoking methods.
	 * It returns the received value multiplied by two.
	 * @param number
	 * @return the number multiplied by two
	 */
	public int multiplyByTwo (int number){
		number = number * 2;
		operations++;
		return number;
	}
	
	/**
	 * Silly, overloaded, method to show that Java uses pass by value when invoking methods.
	 * It returns the received array multiplied by two.
	 * @param number an array of int
	 * @return the array multiplied by two
	 */
	public int [] multiplyByTwo (int [] number){
		for (int ii=0; ii<number.length; ii++){
			number[ii] *=2;
		}
		return number;
	}

}
