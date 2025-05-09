//Write a java program to find the index of an array element.
import java.util.Scanner;
public class Exam8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements that the array contain: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		boolean flag = false;
		System.out.println("Enter the specific value to search it in the array: ");
		int x = sc.nextInt();
		for(int i=0;i<n;i++){
			if(arr[i] == x){
				System.out.println("Found at the index value: "+(i+1));
				flag = true;
				break;
			}
		}
		if(flag == false){
			System.out.println("The element not found.");
		}
	}
}