//SELF PROBLEM STATEMENT
//The maximum and minimum of an array that is given by the user.(Dynamic program manner)
import java.util.Scanner;
public class Exam3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array: ");
		int n = sc.nextInt();
		//Declaring the array.
		int[] arr = new int[n];
		//Taking the input of the values for the array.
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		//Printing the array given by the user
		System.out.println("The given array of elements is: ");
		for(int element : arr){
			System.out.print(" "+element);
		}System.out.println("");
		//Initialization of the array
		int min = 0;
		int max = 0;
		for(int i=0;i<arr.length;i++){
				if(arr[i]>arr[max])
					max = i;
				if(arr[i]<arr[min])
					min = i;
		}
		System.out.println("The maximum element of the given array is: "+arr[max]);
		System.out.println("The minimum element of the given array is: "+arr[min]);

	}
}