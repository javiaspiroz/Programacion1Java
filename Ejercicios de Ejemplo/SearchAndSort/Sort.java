package lesson9.year16_17;

/**
 * @author Programming Professors. Bachelor's Degree in Computer Science and Engineering. UC3M
 * @since December 2013
 * @version 1.2
 * 
 * Implementation of three sorting algorithms:
 		- Bubble sort
 		- Insertion sort
 		- Selection sort
 		
 * Code is organized using Structured Programming, so static methods are created 
 * and then used in the main method.
 */

public class Sort {

	// *********************** B U B B L E ******************************
	
	/**
	 * Easiest implementation of bubble sort
	 * 
	 * @param list list to order (arrays are passed by reference)
	 */
	public static void bubbleEasy(int [] list){
		int aux = 0;
		//outer loop: (elements-1) loops max
		for (int i=1; i<list.length; i++){
			//Uncomment these lines to print the trace
			//	    System.out.println();
			//	    System.out.println("Iteration number "+i);
			
			////Inner loop (n-i comparisons)
			for (int j=0; j<list.length-i; j++){
				//if the lower index element is bigger than the next element, we swap
				if (list[j]>list[j+1]){
					//we use aux to swap
					aux = list [j+1];
					list [j+1] = list [j];
					list [j] = aux;
				}//end if
				// Uncomment these lines to print the trace
				//		for (int k = 0; k<list.length; k++)
				//		    System.out.print (list[k]+" ");
				//		System.out.println();I
			}//end for j
		}//end for i
	}// end bubble

	/** 
     * Bubble sort to sort integer numbers in ascending order
     * It is able to detect if the list is already ordered at any intermediate step,
     * so it finishes earlier
	 * 
	 * @param list list to order (arrays are passed by reference)
	 */
	public static void bubble (int [] list){
		// defining auxiliary variables
		int aux = 0;
		boolean change = true;
		//outer loop: (elements-1) loops max
		for (int i=1; i<list.length && change; i++){
			//Uncomment these lines to print the trace
			//	    System.out.println();
			//	    System.out.println("Iteration number "+i);
			//At the beginning of each iteration change is false
			change = false;
			//Inner loop (n-i comparisons)
			for (int j=0; j<list.length-i; j++){
				// if the lower index element is bigger than the next element, we swap
				if (list[j]>list[j+1]){
					//we did a change, so we update the variable
					change = true;
					//we use aux to swap
					aux = list [j+1];
					list [j+1] = list [j];
					list [j] = aux;
				}//end if
				// Uncomment these lines to print the trace
				//		for (int k = 0; k<list.length; k++)
				//		    System.out.print (list[k]+" ");
				//		System.out.println();
			}//end for j
		}//end for i
	}// end bubble


	// *************** I N S E R T I O N ******************
	/** 
	 * Insertion sort algorithm implementation 
	 *  
	 * @param list list to order (arrays are passed by reference)
	 */
	public static void insertionSort (int [] list){
		// the first element is a sorted sublist, so we start in the second one
		// at each iteration the i first elements will be already sorted
		for (int i=1; i<list.length; i++){
			//we store the value of the first unsorted element 
			int auxiliar = list[i];
			//now we go backwards looking for its place in the sorted sublist
			int j=i-1;
			//we iterate while there are elements in the sorted sublist and the value of the element
			//we want to insert into it is lower than the value of the current element (j-element)
			while (j>=0 && auxiliar<list[j]){
				//we shift elements 
				list [j+1]=list[j];
				// decrementing j to walk through the list backwards
				j--;
			}// end while
			//once found where the element should be placed we place it
			list[j+1]=auxiliar;
			// and we start with the next unsorted one
		}// end for
	}

	// ***************  S E L E C T I O N ****************************
	/** 
	 * Selection sort algorithm implementation
	 * 
	 * @param list list to order (arrays are passed by reference)
	 */
	public static void selectionSort (int [] list){
		//defining auxiliary variables
		int minValue, minPos;
		//we iteratively search for the lowest element of the list 
		for (int i=0; i<list.length; i++) {
			//in each iteration the first element is the "lowest" (to start comparisons)
			minPos=i;
			minValue=list[i];
			//We use this loop to look for the lowest
			for (int j=i+1; j<list.length; j++) {
				//If the current element is lower than the minValue, its value is now minValue
				if (list[j]<minValue) {
					minValue=list[j];
					//We mark also its position
					minPos=j;
				}// end if
			}// end for (j)
			//once the lowest is found, we swap it with the element at position i
			list[minPos]=list[i];
			list[i]=minValue;
			//and we keep iterating with the outer loop
		} //end for (i)
	}


	public static void main (String [] args){
		//declaring an array to sort
		int [] a= new int []{1,5,4,3,2,6,0,0,11,3,32,7,8,9,10,-1,45};
		//Remove comments to invoke any of the methods
		//bubble(a);
		//insertionSort(a);
		//selectionSort(a);
		for (int k=0; k<a.length;k++)
			System.out.print(a[k]+",");
	}
}
