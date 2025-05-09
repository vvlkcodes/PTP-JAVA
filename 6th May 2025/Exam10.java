//Write a java program to remove a specific value from the array.
//The below given code removes the index of the given array number from the array.
import java.util.Scanner;
public class Exam10{
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
		//Creating a new array, And storing the values of the old array which doesn't match with the given value.
		int[] newarr = new int[n];
		int j=0;
		for(int i=0;i<n;i++){
			if(arr[i] != x){
				newarr[j++] = arr[i];
			}
		}
		//Printing the array up to the last second element.
		System.out.println("The new array is: ");
		for(int i=0;i<n-1;i++){
			System.out.print(" "+ newarr[i]);
		}
	}
}