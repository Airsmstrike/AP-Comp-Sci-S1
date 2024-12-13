/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Please enter a number");
    int num1 = sc.nextInt();
    System.out.println("Please enter another number");
    int num2 = sc.nextInt();
    
    if(num1==num2){
    System.out.println("You typed the same number!");
    }
    else if(num1!=num2){
    System.out.println("You typed different numbers!");	
    }
	}
}
