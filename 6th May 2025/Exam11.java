//Write a program to copy an array into an other array by iterating the array.
import java.util.Scanner;
public class Exam11{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Input the array size.
		System.out.println("Enter the number of elements that the array contain: ");
		int n = sc.nextInt();
		//Declaring the array.
		int[] arr = new int[n];
		//Input the array elements.
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		//Creating a new array, And storing the values of the old array which doesn't match with the given value.
		//Copying the array into a new array.
		int[] newarr = new int[n];
		for(int i=0;i<n;i++){
				newarr[i] = arr[i];
		}
		//Printing the array 
		System.out.println("The new array is: ");
		for(int f : newarr){
			System.out.print(" "+ f);
		}
	}
}