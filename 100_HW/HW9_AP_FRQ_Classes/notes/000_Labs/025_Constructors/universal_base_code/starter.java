/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
		myCharacter c1 = new myCharacter();
		System.out.println(c1.role);
		System.out.println("Please type what role you want to play as.");
	    System.out.println("You can play as a Wizard, Warrior or a Rogue.");
	    String role = sc.nextLine();
		myCharacter c2 = new myCharacter(role);


	}
}
