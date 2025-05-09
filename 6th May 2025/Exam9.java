//Write a java program to remove a specific value from the array.
//The below code replaces the specific number or value with zero.
import java.util.Scanner;
public class Exam9{
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
		//Asking the specific value from the user.
		System.out.println("Enter the specific value to remove it from the array: ");
		int x = sc.nextInt();
		for(int i=0;i<n;i++){
			if(arr[i] == x){
				arr[i] = 0;
			}
		}
		//Printing the array 
		System.out.println("The new array is: ");
		for(int f : arr){
			System.out.print(" "+ f);
		}
	}
}