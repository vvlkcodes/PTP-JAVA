//To test if the given array contains a specific value that is given by the user.
import java.util.Scanner;
public class Exam7{
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
				flag = true;
				break;
			}
		}
		if(flag){
			System.out.println("The given array contains the specific value entered by the users.");
		}else{
			System.out.println("The given array does'nt contain the specific value entered by the user.");
		}
	}
}