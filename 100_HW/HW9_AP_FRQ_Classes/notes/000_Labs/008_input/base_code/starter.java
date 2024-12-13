/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc= new Scanner (System.in);
	System.out.println("Please enter your name");
    String name = sc.nextLine();
    System.out.println("What is your age?");
    int age = sc.nextInt();
    System.out.println("What is your birth month? 1-12");
    int month = sc.nextInt();
    System.out.println("What day were you born? 1-31");
    int day= sc.nextInt();
    System.out.println("What year were you born?");
    int year=sc.nextInt();
    System.out.println("If I have 6 quarters, how much money do I have?");
    double money=sc.nextDouble();
    System.out.println("Your name is "+(name)+" and you were born on "+ (month)+"/"+(day)+"/"+(year)+".");
    System.out.println("Youa are "+(age)+" years old!!!");
    System.out.print("You have "+(money)+" in your wallet.");
	}
}
