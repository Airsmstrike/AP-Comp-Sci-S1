/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please type your name");
		String name = sc.nextLine();
		System.out.println("How many times should your name be shown on the screen?");
		int num1 = sc.nextInt();
		int count = 0;
		while(count<num1){
			System.out.println(name);
			count++;
		}

		
	}
}
