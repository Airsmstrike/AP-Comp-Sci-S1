/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please type what role you want to play as.");
	System.out.println("You can play as a wizard, warrior or a rogue.");
	String role = sc.nextLine();
	System.out.println("You want to play as a "+role+"!");
	if(role.equals("Warrior")){
		System.out.println("You chose the correct role!");
	}
	else if(role.equals("warrior")){
		System.out.println("You chose the correct role!");
	}
	else{
		System.out.println("You chose the wrong role!");
	}
	}
}
