/*
Print the below Pattern:
* * * *
  * * * *
    * * * *
      * * * *
*/
import java.util.Scanner;
public class Patterns21{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			for(int j=i;j>0;j--){
				System.out.print("  ");
			}
			for(int j=0;j<n;j++){
				System.out.print("* ");
			}System.out.println("");
		}
	}
}