/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int [] arr = new int[100];
        for(int i = 0; i<arr.length; i++){
        	arr[i] = (int)(Math.random()*100)+1;
        }
        toStringArray(arr);
        System.out.println("The average of the array is: "+getArrayAverage(arr));
        System.out.println("The max of the array is: "+ getArrayMax(arr));
        System.out.println("The min of the array is: "+ getArrayMin(arr));
        
	}
	public static void toStringArray(int [] arr){
    for(int i = 0; i < arr.length; i++){
        	System.out.println(arr[i]);
        }
	}
	public static int getArrayAverage(int[] arr){
	int total = 0;
	for(int i = 0; i < arr.length; i++){	
		total = total + arr[i];
	}
	int average = total/arr.length;
	return average;
	}
	public static int getArrayMax(int[] arr){
		int max = arr[0];
		for(int i = 0; i < arr.length; i++){
		if(arr[i]>max){
			max = arr[i];
		}
		else{
			max= max;
		}
		}
		return max;
	}
	public static int getArrayMin(int[] arr){
		int min = arr[0];
		for(int i = 0; i < arr.length; i++){
		if(arr[i]<min){
			min = arr[i];
		}
		else{
			min= min;
		}
		}
		return min;
	}
}
