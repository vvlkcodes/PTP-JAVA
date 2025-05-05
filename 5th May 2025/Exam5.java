//expected output
/*
--------
--------
--------
--------
*/
import java.util.Scanner;
public class Exam5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements of the rows: ");
		int n = sc.nextInt();
		System.out.println("Enter the number of elements of the cols: ");
		int m = sc.nextInt();
		char arr[][] = new char[n][m];
		//Taking the input from the user and replacing them with the character.
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				arr[i][j] = sc.next().charAt(0);
				arr[i][j] = '#';
			}
		}
		//To print all the values 
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(arr[i][j]);
			}System.out.println("");
		}
	}
}