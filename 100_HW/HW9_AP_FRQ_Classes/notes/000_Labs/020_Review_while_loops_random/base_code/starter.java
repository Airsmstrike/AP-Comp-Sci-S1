/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Let's play a game! You try to guess a number 1-1000");
		int guess = sc.nextInt();
		int number = 222;
		while(guess != number){
		System.out.println("Guess again! :P");
		guess = sc.nextInt();
		if(guess == number){
		System.out.println("You are correct!");	
			break;
		}
		
		
		
		}
		
		
		
		
	}
}
