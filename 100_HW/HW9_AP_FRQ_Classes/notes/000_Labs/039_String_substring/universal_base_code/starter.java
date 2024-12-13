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
System.out.println("Please enter a word.");
String ui = sc.nextLine();
for(int c = 0; c<ui.length(); c++){
System.out.println(ui.substring(c,c+1));
}
		
	}
}
