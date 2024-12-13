/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = sc.nextLine();
    System.out.println("What title will you have? Ex:Slayer of dragons");
    String title = sc.nextLine();
    
    System.out.println("Please type what role you want to play as.");
	System.out.println("You can play as a wizard, warrior or a rogue.");
	String role = sc.nextLine();
	if(role.equals("Warrior")){
		System.out.println("You want to play as a "+role+"!");
	}
	else if(role.equals("warrior")){
		System.out.println("You want to play as a "+role+"!");
	}
	else if (role.equals("Wizard")){
		System.out.println("You want to play as a "+role+"!");
	}
	else if (role.equals("wizard")){
		System.out.println("You want to play as a "+role+"!");
	}
	else if (role.equals("Rogue")){
		System.out.println("You want to play as a "+role+"!");
	}
	else if (role.equals("rogue")){
		System.out.println("You want to play as a "+role+"!");
	}
	else{
		System.out.println("You did not choose a usable role:(");
		System.out.println("Please rerun the program");
	}
	System.out.println("You have 20 skill points to allocate to the following stats: Strength, Dexterity, Intellegence, and Charisma.");
	int points = 20;
	System.out.print("Strength (1-10):");
	int strength = sc.nextInt();
	if(strength>10){
		System.out.print("Please input a smaller value. ");
		System.out.print("Strength (1-10):");
		strength = sc.nextInt();
	}
	System.out.println("You have "+(points-strength)+" points left!");
	System.out.print("Dexterity (1-10):");
	int dexterity = sc.nextInt();
	if(dexterity>points-strength){
		System.out.print("Please input a smaller value. ");
		System.out.print("Dexterity (1-10):");
		dexterity = sc.nextInt();
	}
	if (dexterity>10){
		System.out.print("Please input a smaller value. ");
		System.out.print("Dexterity (1-10):");
		dexterity = sc.nextInt();
	}
	System.out.println("You have "+(points-strength-dexterity)+" points left!");
	System.out.print("Intellegence (1-10):");
	int intellegence = sc.nextInt();
	if(intellegence>points-strength-dexterity){
		System.out.print("Please input a smaller value. ");
		System.out.print("Intellegence (1-10):");
		intellegence = sc.nextInt();
	}
	if (intellegence>10){
		System.out.print("Please input a smaller value. ");
		System.out.print("Intellegence (1-10):");
		intellegence = sc.nextInt();
	}
	System.out.println("You have "+(points-strength-dexterity-intellegence)+" points left!");
	System.out.print("Charisma (1-10):");
	int charisma = sc.nextInt();
	if(intellegence>points-strength-dexterity-intellegence){
		System.out.print("Please input a smaller value. ");
		System.out.print("Charisma (1-10):");
		charisma = sc.nextInt();
	}
	if (charisma>10){
		System.out.print("Please input a smaller value. ");
		System.out.print("charisma (1-10):");
		charisma = sc.nextInt();
	}
	System.out.println("You have "+(points-strength-dexterity-intellegence-charisma)+" points left!");
	System.out.println("----------------------------------------------------------------------------");
	System.out.println("You are "+name+", the "+title+" of CVHS");
	System.out.println("You are a "+role+" with the following stats!");
	System.out.println("Strength: "+strength);
	System.out.println("Dexterity: "+dexterity);
	System.out.println("Intellegence: "+intellegence);
	System.out.println("Charisma: "+charisma);
	}
}
