package lesson6.year16_17;
/**
 * An example of a dummy class to show pass by value in Java
 * @author Angel Garcia Olaya. PLG-UC3M
 * @since November 2016
 * @version 1.0
 *
 */
public class UsingDummyMathematics {

	public static void main(String[] args) {
		DummyMathematics dm  = new DummyMathematics();
		//Let's try first with variables of primitive types
		int number = 4;
		int result = dm.multiplyByTwo(number);
		//The value of the number variable does not change, despite what we did inside the method
		//Java has copied the value into the parameter of the method
		System.out.println(number);
		//Of course, the result is what we expected
		System.out.println(result);
		//Now with arrays
		int [] arr = new int []{1,2,3,4,5};
		int [] result2 = dm.multiplyByTwo(arr);
		//The original array has changed!!
		//This is because Java copied the value of arr into the parameter.
		//But the value inside arr is the pointer to the array, so now both arr and the parameter
		//point to the same memory address (the same array)
		for (int ii=0; ii<arr.length; ii++){
			System.out.print(arr[ii]+" ");
		}
		System.out.println();
		for (int ii=0; ii<result2.length; ii++){
			System.out.print(result2[ii]+" ");
		}
		//The same would happen if the parameter were an object
	}

}
