package lesson9.year16_17;

/**
 * @author Programming Professors. Bachelor's Degree in Computer Science and Engineering. UC3M
 * @since December 2013
 * @version 1.2
 * 
 * Implementation of linear and binary search over an integer array. 
 * It has a method for each search type. 
 * Code is organized using Structured Programming, so static methods are created 
 * and then used in the main method.
 */
public class Search {

	/**
	 * Linear search.
	 *  
	 * @param list list of integers
	 * @param element element to look for
	 * @return position of the first appearance of the element or -1 if it is not in the list
	 */
	public static int linearSearch (int [] list, int element){
		for (int counter = 0; counter < list.length; counter++){
			//if we found the element, we return the position
			if (list[counter]==element) {
				return counter;
			}// end if
		}// end while
		//If not found, we return -1
		return -1;
	}


	/** 
	 * Linear search in part of the list (bounded linear search). It does not check that the
	 * provided bounds are valid, so ArrayIndexOutOfBounds exceptions may occur.
	 *  
	 * @param list list of integers
	 * @param element element to look for
	 * @param first index of the first element to start searching. 
	 * @param last index of the element to stop searching
	 * @return position of the first appearance of the element or -1 if it is not in the sublist
	 */
	public static int boundedLinearSearch (int [] list, int element, int first, int last){
		for (int counter = first; counter <= last; counter++) {
			if (list[counter]==element) {
				return counter;
			}// end if
		}// end while
		return -1;
	}

	/**
	 * Binary Search
	 * 
	 * @param list list of integers
	 * @param element element to look for
	 * @return position of the element or -1 if it is not in the list
	 */
	public static int binarySearch (int [] list, int element){
		//auxiliary variables to define search interval
		int biggest = list.length-1, lowest = 0, central= (biggest+lowest)/2;
		// while we have an interval to search in
		while (biggest>=lowest){
			// to see the algorithm trace, uncomment this line
			//	    System.out.println(biggest+ " "+lowest+" " +central);
			// if our element is at central position, we found it
			if (list[central] == element) return central;
			// if not, if it is lower than central, we discard the upper half of the list
			else if (list[central] > element)  biggest = central-1;
			// if not, it will we higher, so we discard the lower half of the list
			else lowest = central+1;
			//we compute again the center of the list
			central = (biggest+lowest)/2;
		}//end while
		//if not found, return -1
		return -1;					
	}

	/** Bounded binary search
	 * @param list list of integers
	 * @param element element to look for
	 * @param first index of the first element to start searching
	 * @param last index of the element to stop searching
	 * @return position of the element or -1 if it is not in the sublist
	 * 
	 * Not very efficient implementation, we are duplicating the array, but allows us to reuse previous method.
	 * It does not check that the provided bounds are valid, so ArrayIndexOutOfBounds exceptions may occur.
	 */
	public static int boundedBinarySearch (int [] list, int element, int first, int last){
		//creating a new array with the sublist
		int [] newarr = new int [last-first+1];
		System.arraycopy(list, first, newarr, 0, last-first+1);
		//we invoke binarySearch method with this array
		int position = binarySearch(newarr,element);
		//we cannot return position because it is the position on the sublist, not in the original one
		//except if we didn't find it
		if (position==-1)
			return position;
		else
			return position+first;		
	}
	
	public static void main (String [] args){
		//Examples of use
		int [] unsorted = new int [] {1,12,7,9,3,2,4,8,6};
		int [] sorted = new int [] {1,3,4,6,7,8,10,12};
		//Searching for the 3 (found in both)
		System.out.println(linearSearch(unsorted, 3));
		System.out.println(binarySearch(sorted, 3));
		//Searching for the 5 (not present)
		System.out.println(linearSearch(unsorted, 5));
		System.out.println(binarySearch(sorted, 5));
		//Searching for the 5 in the 4 first elements of the sorted list
		System.out.println(boundedBinarySearch(sorted, 5,0,3));
		//Searching for the 3 in the elements 1 to 4
		System.out.println(boundedBinarySearch(sorted, 3,1,4));
	}
}

	    