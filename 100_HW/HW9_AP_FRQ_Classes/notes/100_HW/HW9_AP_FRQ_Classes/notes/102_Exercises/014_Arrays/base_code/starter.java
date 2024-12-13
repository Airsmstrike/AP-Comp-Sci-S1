/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr = new int[1001];
		 int c = 0;
		 while(c<arr.length){
		 	arr[c]=(c+1)*3;
		 	System.out.println("Index:" + c + "Value:"+ arr[c]);
		 	c++;
		 }
		 //for(int c =0; c< arr.length; c++){
		 //	arr[c] = (c+1)*3;
		 //	Sytem.out.println("Index:" + c + "Value:"+ arr[c]);
		 //}
		 
		 int[] arr2 = new int[1001];
		 int z = 0;
		 while(z < arr2.length){
		 	arr2[z] = arr2.length-1-z;
		 	System.out.println("Index:" + z + "Value:" + arr[z]);
		 	z++;
		 }
	}
}
