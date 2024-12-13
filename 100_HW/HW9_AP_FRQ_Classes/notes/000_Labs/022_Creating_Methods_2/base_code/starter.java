/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
    pow(2,4);
    }
	public static int pow(int base, int exponent){
		int result = 1;
		int count = 0;
		while(count<exponent){
		result = result * base;
		count++;
		}
		System.out.println(result);
		return result;
		
	}
}
