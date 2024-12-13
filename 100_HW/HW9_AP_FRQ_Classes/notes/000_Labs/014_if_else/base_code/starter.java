/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Lets play a game!");
	System.out.println("I have a number in my head 1-1000");
	System.out.println("Try to gues what number it is!");
	int guess = sc.nextInt();
	if(guess==222){
		System.out.println("You are correct!");
	}
	else{
		System.out.println("You are incorect :(");
	}
	}
}
