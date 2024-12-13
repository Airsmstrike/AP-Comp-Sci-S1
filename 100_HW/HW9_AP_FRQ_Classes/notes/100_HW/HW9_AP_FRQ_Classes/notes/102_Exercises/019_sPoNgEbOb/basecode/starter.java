/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter a word/phrase: ");
	String phrase = sc.nextLine();
	
	while(true){
		if(phrase.indexOf(" ")==-1){
			System.out.print(spongeCase(phrase));
			break;
		}
		int space = phrase.indexOf(" ");
		String word = phrase.substring(0, space);
		System.out.print(spongeCase(word)+" ");
		
		phrase = phrase.substring(space+1);
	}
	
	
	}
	public static String spongeCase(String word){
	String result = "";
	for(int c=0; c < word.length(); c++){
		String letter = word.substring(c, c+1);
		if(c % 2 ==1){
			letter = letter.toLowerCase();
		}
		else{
		    letter = letter.toUpperCase();
		}
		result = result + letter;   //if you swap the letter and result you print the phrase/word backwards!!------------------
		
	}
	return result;
	}
}
