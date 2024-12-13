/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;

public  class myCharacter{
	public String role;
	public myCharacter(){
		role = "no role";
		
	}
	public myCharacter(String a){
	if(a.equals("Warrior")||a.equals("Wizard")||a.equals("Rogue")){
		role = a;
		System.out.println("Nice choice you chose "+a);
	}
	else{
		role = "no role";
		System.out.println("Not a correct role. Setting to no role.");
	}
		
	
	}
	
	
	
}
	


