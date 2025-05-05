//Write a java program to sort a numeric array (Dynamic manner)
import java.util.Scanner;
public class Exam1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Input an array first.
		System.out.println("Enter the number of elements in the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter all the elements of the array: ");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("The given array is: ");
		//Printing the array that is given by the user 
		for(int element: arr){
			System.out.print(" "+element);
		}
		//Sorting the array here
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					//Swapping the smaller number with the larger number
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		//Printing the array that is ready and sorted
		System.out.println("The sorted array of the given elements is: ");
		//Using the for-each loop to print the elements of the sorted array
		for(int element : arr){
			System.out.print(" "+element);
		}
	}
}