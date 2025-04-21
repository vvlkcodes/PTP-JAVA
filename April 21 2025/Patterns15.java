//Print the below pattern
/*
   *
  ***
 *****
*******
*/
import java.util.Scanner;
public class Patterns14{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		//for the spaces 
		for(int i=0;i<n;i++){
			for(int j=n;j>0;j--){
				if(j>i+1) System.out.print(" ");
				else System.out.print("*");
			}
			for(int j=0;j<i;j++){
				System.out.print("*");
			}System.out.println("");
		}
	}
}