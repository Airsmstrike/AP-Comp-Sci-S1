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
    System.out.println("Please enter another final number");
    int num3 = sc.nextInt();
    if(num1>num2 && num1>num3){
    System.out.println(num1+" is the largest number you input!");
    }
    else if(num2<num1 && num2>num3){
    System.out.println(num2+" is the largest number you input!");
    }
    else if(num3>num1 && num3>num2)
    System.out.println(num3+ " is the largest number you input!");
    if(num1<num2&& num1<num3){
        System.out.println(num1+" is the smallest number you input!");
    }
    else if(num2<num1&&num2<num3){
        System.out.println(num2+" is the smallest number you input!");
    }
    else if(num3<num1&&num3<num2){
        System.out.println(num3+" is the smallest number you input!");
    }
	}
}
