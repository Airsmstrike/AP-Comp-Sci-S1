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
		System.out.println("Please type what role you want to play as.");
	    System.out.println("You can play as a Wizard, Warrior or a Rogue.");
	    String role = sc.nextLine();
		myToString c1 = new myToString(role);


		
	}
}
