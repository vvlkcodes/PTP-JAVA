//Patterns 3.

import java.util.Scanner;
public class Patterns3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of Stars to be printed: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if((i!=0 && i!=n-1)&&(j>0 || j<n-1))
					System.out.print(" ");
				if(j==0 || i==0 || j==n || i==n)
					System.out.print("* ");
			}System.out.print("\n");
		}
	}
}