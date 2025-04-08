//Patterns 1
//Write a java program to print a single line of stars.
// ***** 
//Take the number of stars as input from the user.
import java.util.Scanner;
public class Patterns1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of Stars to be printed: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			System.out.print("*");
		}
	}
}