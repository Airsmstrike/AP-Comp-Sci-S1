/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class Character{
	//       Global Variables
	String role = ("rogue");
	int strength = 10;
	int dexterity = 10;
	int intelligence = 10;
	int charisma = 10;
	
}

class starter {
	
	public static void main(String args[]) {
		Character myCharacter = new Character();
        System.out.println(myCharacter.role);
        System.out.println("Strength "+myCharacter.strength);
        System.out.println("Dexterity "+myCharacter.dexterity);
        System.out.println("Intelligence "+myCharacter.intelligence);
        System.out.println("Charisma "+myCharacter.charisma);
    

		
	}
}
