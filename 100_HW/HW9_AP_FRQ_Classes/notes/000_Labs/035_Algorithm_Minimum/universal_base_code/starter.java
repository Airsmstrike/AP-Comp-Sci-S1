/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
        int size = (int)(Math.random() * 150) + 51;
        int[] arr = new int[size];
        
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 100) + 1;
        }
        
        int min = arr[0];
        int max = arr[0];
        int sum = 0;
        
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
            sum += num;
        }
        
        double average = (double) sum / size;
        
        System.out.println("Array size: " + size);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Average value: " + average);
    }
}

