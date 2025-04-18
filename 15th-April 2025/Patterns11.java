//Patterns11
//Using the Spaces and Symbols.
//Loops
//No. of Iterations
/*
Print the below pattern
  *
 * *
*   *
*/
import java.util.Scanner;
public class Patterns11{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int mid = ((n*2)/2)-1;
		int total = (n*2)-1;
		int i,k,j;
		for(i=0;i<n;i++){
			
			//for the spaces
			for(j=0;j<mid;j++){
				System.out.print("  ");
			}
			//for the values
			for(k=j;k<total-mid;k++){
				if(k==mid || k==(total-mid)-1){
					System.out.print(" *");
				}
				else
					System.out.print("  ");
					
			}							
			System.out.println("");	
			mid--;
		}
	}
}