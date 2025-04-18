/*
Print the below pattern: 
*****
*   *
*   *
*   *
*****
*/
//Using the conditions.
import java.util.Scanner;
public class Patterns10{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		//Input the Number 5, to get the above Output.
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        int m = n*2;
		        if(i==0 || i==n-1 || j==0 || j==n-1){
		            System.out.print("*");
		        }else{
		            System.out.print(" ");
		        }
		    }System.out.println("");
		}
	}
}