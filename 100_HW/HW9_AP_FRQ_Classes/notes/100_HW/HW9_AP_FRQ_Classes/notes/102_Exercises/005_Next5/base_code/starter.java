/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
    System.out.println("Please enter a number:");
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    System.out.println("Here are the next 5 numbers!");
    System.out.println((num1+1) + ", " + (num1+2) + ", " + (num1+3) + ", " + (num1+4) + ", " + (num1+5));
    System.out.println("Here are the next 5 multiples of "+(num1)+"!");
    System.out.println((num1*2) + ", " + (num1*3) + ", " + (num1*4) + ", " + (num1*5) + ", " + (num1*6));
    System.out.println("Here is "+(num1)+" divided by 100!");
    System.out.println(num1/100.0);
    System.out.println("Here is "+(num1)+" divided by 10!");
    System.out.println(num1/10.0);
	}
}
