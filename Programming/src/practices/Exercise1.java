package practices;

public class Exercise1 {

	public static void main(String[] args) {
		char[][] arr = new char[][] { { 'h', 'e', 'l', 'l', 'o', 'k', 'n', 'x' },
				{ 'a', 'g', 'h', 'k', 'k', 'm', 'e', 'e' }, { 'b', 'x', 'e', 'l', 'c', 'c', 'c', 'd' },
				{ 'o', 'l', 'l', 'o', 'l', 'l', 'e', 'h' }, { 'l', 'l', 'l', 's', 'l', 'o', 'u', 'k' },
				{ 'l', 'b', 'o', 'y', 'u', 'j', 'x', 'o' }, { 'e', 'h', 'e', 'l', 'l', 'o', 'h', 'i' },
				{ 'h', 'j', 'k', 'j', 't', 'f', 'j', 'c' } };
		int result = SearchWords(arr, 8, "hello");
		System.out.println(result);
	}

	public static int SearchWords(char arr[][], int size, String word) {
		int num = 0;
		arr = new char[size][size];
		System.out.println(word.charAt(0));
		System.out.println(arr[0][0]);
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (word.charAt(0) == arr[i][j]) {
					int k=1;
					if (i + 1 < arr.length && arr[i + 1][j] == word.charAt(k)) {
						k += 1;
						for (; k < word.length(); i++) {
							if (k == word.length() - 1) {
								num+=1;
							}
							if (i + 1 < arr.length && arr[i + 1][j] == word.charAt(k)) {
								k += 1;
							}
							if (i + 1 < arr.length && arr[i + 1][j] != word.charAt(k)) {
								num+=0;
							}
						}	
					}
					else if (i - 1 >= 0 && arr[i - 1][j] == word.charAt(k)) {
						k += 1;
						for (; k < word.length(); i--) {
							if (i - 1 >= 0 && arr[i - 1][j] == word.charAt(k)) {
								num+=1;
							}
							if (k == word.length()) {
								return 1;
							}
							if (i - 1 >= 0 && arr[i - 1][j] != word.charAt(k)) {
								num+=0;
							}
						}
					}
					else if (j + 1 < arr.length && arr[i][j + 1] == word.charAt(k)) {
						k += 1;
						for (; k < word.length(); j++) {
							if (j + 1 < arr.length && arr[i][j + 1] == word.charAt(k)) {
								k += 1;
							}
							if (k == word.length()) {
								num+=1;
							}
							if (j + 1 < arr.length && arr[i][j + 1] != word.charAt(k)) {
								num+=0;
							}
						}
					}
					else if (j - 1 >= 0 && arr[i][j - 1] == word.charAt(k)) {
						k += 1;
						for (; k < word.length(); j--) {
							if (j - 1 >= 0 && arr[i][j - 1] == word.charAt(k)) {
								k += 1;
							}
							if (k == word.length()) {
								num+=1;
							}
							if (j - 1 >= 0 && arr[i][j - 1] != word.charAt(k)) {
								num+=0;
							}
						}
					}
					else{
						num+=0;
					}
				}
			}
		}

		return num;
	}

	//Used in a previous version
	public static int SearchLettersUp(char arr[][], int i, int j, String word) {
		int k = 1;
		for (; k < word.length(); i++) {
			if (k == word.length() - 1) {
				return 1;
			}
			if (i + 1 < arr.length && arr[i + 1][j] == word.charAt(k)) {
				k += 1;
			}
			if (i + 1 < arr.length && arr[i + 1][j] != word.charAt(k)) {
				return 0;
			}

		}
		return 0;
	}

	public static int SearchLettersDown(char arr[][], int i, int j, String word) {
		int k = 1;
		for (; k < word.length(); i--) {
			if (i - 1 >= 0 && arr[i - 1][j] == word.charAt(k)) {
				k += 1;
			}
			if (k == word.length()) {
				return 1;
			}
			if (i - 1 >= 0 && arr[i - 1][j] != word.charAt(k)) {
				return 0;
			}
		}
		return 0;
	}

	public static int SearchLettersRight(char arr[][], int i, int j, String word) {
		int k = 1;
		for (; k < word.length(); j++) {
			if (j + 1 < arr.length && arr[i][j + 1] == word.charAt(k)) {
				k += 1;
			}
			if (k == word.length()) {
				return 1;
			}
			if (j + 1 < arr.length && arr[i][j + 1] != word.charAt(k)) {
				return 0;
			}
		}
		return 0;
	}

	public static int SearchLettersLeft(char arr[][], int i, int j, String word) {
		int k = 1;
		for (; k < word.length(); j--) {
			if (j - 1 >= 0 && arr[i][j - 1] == word.charAt(k)) {
				k += 1;
			}
			if (k == word.length()) {
				return 1;
			}
			if (j - 1 >= 0 && arr[i][j - 1] != word.charAt(k)) {
				return 0;
			}
		}
		return 0;
	}

	/*
	 * public static int SearchLetters (char arr[][], int i, int j, String word,
	 * int k){
	 * 
	 * while (k<word.length()){//poner limites para no salirse de la matriz
	 * if(arr[i+1][j]==word.charAt(k) && i+1<arr.length){ SearchLetters(arr,i+1,
	 * j, word, k+1); } if(arr[i-1][j]==word.charAt(k) && i-1>=0){
	 * SearchLetters(arr,i-1, j, word, k+1); } if(arr[i][j+1]==word.charAt(k) &&
	 * j+1<arr.length){ SearchLetters(arr,i, j+1, word, k+1); }
	 * if(arr[i][j-1]==word.charAt(k) && j-1>=0){ SearchLetters(arr,i, j-1,
	 * word, k+1); } }
	 * 
	 * if(k==word.length()-1){//¿Debe ir fuera del while?,revisar condición
	 * return 1; }
	 * 
	 * return 0; }
	 */

}
