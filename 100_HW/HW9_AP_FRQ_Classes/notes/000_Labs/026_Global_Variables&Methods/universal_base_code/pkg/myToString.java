/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;

public  class myToString{
	public String role;
	public int strength;
	public int dexterity;
	public int intelligence;
	public int charisma;
	public myToString(){
		role = "no role";
		strength =1;
		dexterity = 1;
		intelligence = 1;
		charisma =1;
	}
	
	public myToString(String a){
	if(a.equals("Warrior")||a.equals("Wizard")||a.equals("Rogue")){
		role = a;
		System.out.println("Nice choice you chose "+a);
		System.out.println("Strength stat "+strength);
		System.out.println("Dexterity stat "+dexterity);
		System.out.println("Intelligence stat "+intelligence);
		System.out.println("Charisma stat "+charisma);
	}
	else{
		role = "no role";
		System.out.println("Not a correct role. Setting to no role.");
		System.out.println("Nice choice you chose "+a);
		System.out.println("Strength stat "+strength);
		System.out.println("Dexterity stat "+dexterity);
		System.out.println("Intelligence stat "+intelligence);
		System.out.println("Charisma stat "+charisma);
	}
		
	
	}
	
	
}