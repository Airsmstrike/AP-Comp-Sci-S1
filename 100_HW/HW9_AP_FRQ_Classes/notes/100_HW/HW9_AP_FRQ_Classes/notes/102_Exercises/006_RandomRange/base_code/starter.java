/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Please enter a number.");
		int num1 = sc.nextInt();
		System.out.println("Please enter a number bigger than the first.");
		int num2 = sc.nextInt();
		int random = (int)(Math.random()*(num2-num1)) + num1;
		System.out.println(random);
	}
}
