//Patterns 2
/*
*****
*
*
*
*
print the above pattern
*/ 
//Take the number of stars as input from the user.
import java.util.Scanner;
public class Patterns2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of Stars to be printed: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(j==0 || i==0)
				System.out.print("*");
			}System.out.print("\n");
		}
	}
}