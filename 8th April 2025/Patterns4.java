//Using a single for loop for the pattern
import java.util.Scanner;
public class Patterns4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		int m = sc.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print("* ");
			}System.out.print("\n");
		}
	}
}