//Input and Output of the matrices 
import java.util.Scanner;
public class Arrays4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[5][4];
		int b[][] = new int[2][];
		int c[][] = new int[][]{{10,20},{10,20},{10,20}};
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		int cols = sc.nextInt();
		System.out.println("Enter the elements of the arrays: ");
		for(int i=0;i<rows;i++)
			for(int j=0;j<cols;j++)
				a[i][j] = sc.nextInt();
		System.out.println("The entered elements of the matrix are: ");
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.print(a[i][j]+" ");
			}System.out.println("");
		}
			
	}
}