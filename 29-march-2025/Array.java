//Arrays
// import java.util.Scanner;
//The below line includes all the methods of the java language.

/*
you can always use 
import java.util.Scanner;
or
import java.util.*;
or
import java.lang.*;
or
import java.lang.Scanner;
*/
import java.lang.*;
public class Array{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of the array: ");
		//Input the elements of the array.
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		//for-each loop.
		for(int element : arr){
			System.out.print(element+" ");
		}
	}
}