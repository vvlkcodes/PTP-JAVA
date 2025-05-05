//To find the average of all the values of an array.
import java.util.Scanner;
public class Exam4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array: ");
		int n = sc.nextInt();
		int arr[]= new int[n];
		int sum = 0;
		//Taking the elements of the array 
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<n;i++){
				arr[i] = sc.nextInt();
				sum += arr[i];
		}System.out.println(" ");
		//To print all the values 
		System.out.println("The given array is: ");
		for(int i=0;i<n;i++){
				System.out.print(" "+arr[i]);
		}System.out.println("");
		System.out.println("The sum of the elements of the array is: "+sum);
		System.out.println("The average of the elements in the given array is: "+(sum/n));
	}
}