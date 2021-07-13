package week13;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since December 2016
 * @version 1.0
 *
 */

public class Exercise3 {

	/*public static void main(String[] args) {
		String text="Hello my name is Javier";
		int [] num=new int[16];
		num=num(text);
		String print=toString(num);
		System.out.println(print);
	}
	public static int [] num (String text){
		int arr [] = new int[16];
		String [] partText=text.split(" ");
		for (int ii=0; ii<16; ii++){
			if (partText[ii].length()==1){
				arr[0]++;
			}
			if (partText[ii].length()==2){
				arr[1]++;
			}
			if (partText[ii].length()==3){
				arr[2]++;
			}
			if (partText[ii].length()==4){
				arr[3]++;
			}
			if (partText[ii].length()==5){
				arr[4]++;
			}
			if (partText[ii].length()==6){
				arr[5]++;
			}
			if (partText[ii].length()==7){
				arr[6]++;
			}
			if (partText[ii].length()==8){
				arr[7]++;
			}
			if (partText[ii].length()==9){
				arr[8]++;
			}
			if (partText[ii].length()==10){
				arr[9]++;
			}
			if (partText[ii].length()>10){
				arr[10]++;
			}
			if (partText[ii].indexOf("a")==0){
				arr[11]++;
			}
			if (partText[ii].indexOf("e")==0){
				arr[12]++;
			}
			if (partText[ii].indexOf("i")==0){
				arr[13]++;
			}
			if (partText[ii].indexOf("o")==0){
				arr[14]++;
			}
			if (partText[ii].indexOf("u")==0){
				arr[15]++;
			}
		}
		return arr;
	}
	public static String toString (int [] arr){
		String text="Words with length 1: "+arr[0]+'\n'+"Words with length 2: "+arr[1]+'\n'+"Words with length 3: "+arr[2]+'\n'+
				"Words with length 4: "+arr[3]+'\n'+"Words with length 5: "+arr[4]+'\n'+"Words with length 6: "+arr[5]+'\n'+
				"Words with length 7: "+arr[6]+'\n'+"Words with length 8: "+arr[7]+'\n'+"Words with length 9: "+arr[8]+'\n'+
				"Words with length 10: "+arr[9]+'\n'+"Words with length bigger than 10: "+arr[10]+'\n'+"Words starting with a: "+arr[11]+'\n'+
				"Words starting with e: "+arr[12]+'\n'+"Words starting with i: "+arr[13]+'\n'+"Words starting with o: "+arr[14]+'\n'+
				"Words starting with u: "+arr[15]+'\n';
		return text;
	}*/
	//Teacher's solution
	public static int [] counting (String text){
		int [] result = new int [16];
		//We split the text by the space, each position of the array
		//contains a word
		String [] newText = text.toLowerCase().split(" ");
		for (int ii=0; ii<newText.length; ii++) {
			//The length of the word
			int length = newText[ii].length();
			//If it is bigger than 10, we set it to 11
			if (length>10) {
				length = 11;
			}
			//Adding one to the number of words with this length
			result[length-1]++;
			//Now checking the starting letter, and adding one to the
			//position representing each letter
			switch (newText[ii].charAt(0)) {
			case 'a': result[11]++;break;
			case 'e': result[12]++;break;
			case 'i': result[13]++;break;
			case 'o': result[14]++;break;
			case 'u': result[15]++;break;
			}
		}
		return result;
	}
	
	public static void printing (int [] count){
		String [] vowels = new String []{"a","e","i","o","u"};
		for (int ii=0; ii<count.length; ii++){
			if (ii<10) {
				System.out.println("Words with length "+(ii+1)+": "+count[ii]);
			}
			else if (ii==10) {
				System.out.println("Words with length bigger than 10: "+count[ii]);
			}
			else {
				System.out.println("Words starting with "+vowels[ii-11]+" :"+count[ii]);
			}
		}
	}
	
	public static void main(String[] args) {
		String test ="Create a static method that receives a text in the form of a String and "
				+ "returns an array with the number of words having 1 letter";
		printing(counting(test));

	}
}
