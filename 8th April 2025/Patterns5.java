/*
*****
*****
*****
*****
*****
*****
*****
*****
*****
*****
*/
import java.util.Scanner;
public class Patterns5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		for(int i=0;i<n*2;i++){
			for(int j=0;j<n;j++){
				System.out.print("*");
			}System.out.println("");
		}
	}
}