/*
Print the below pattern: 
1
12
123
1234
12345
1234
123
12
1
*/
import java.util.Scanner;
public class Patterns9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		//Give the input 5 to print the above pattern.
		int n = sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}System.out.println("");
		}
		for(int i=n-1;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}System.out.println("");
		}
	}
}