/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a sentence.");
    String phrase = sc.nextLine();
    String result = "";
    while(true){
		if(phrase.indexOf(" ")==-1){
		    System.out.print(phrase+" ");
			break;
		}
		int space = phrase.indexOf(" ");
		String word = phrase.substring(0, space);
        result = word +" "+result;

		phrase = phrase.substring(space+1);
	}
    System.out.print(result);
	}
	
}
